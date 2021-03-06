package io.reactivesw.catalog.infrastructure.rpcserver;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.domain.service.CategoryService;
import io.reactivesw.catalog.grpc.CategoryList;
import io.reactivesw.catalog.grpc.CategoryServiceGrpc;
import io.reactivesw.catalog.grpc.Empty;
import io.reactivesw.catalog.grpc.GrpcCategory;
import io.reactivesw.catalog.grpc.LongValue;
import io.reactivesw.catalog.infrastructure.mapper.CategoryMapper;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.utils.GrpcResponseUtils;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * this is gRPC server for category.
 *
 * @author Davis
 */
@GRpcService
public class CategoryRpcServer extends CategoryServiceGrpc.CategoryServiceImplBase {

  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CategoryRpcServer.class);

  /**
   * category service.
   */
  @Autowired
  private transient CategoryService categoryService;

  /**
   * get all categories and subcategories.
   */
  @Override
  public void getCategories(Empty request, StreamObserver<CategoryList> responseObserver) {
    LOG.debug("enter getCategories.");
    try {
      final List<Category> categories = categoryService.getAllCategories();
      final CategoryList reply = CategoryMapper.transferToCategoryList(categories);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end getCategories.get {} categories.", reply.getCategoryCount());
    } catch (NotFoundException exception) {
      LOG.debug("exception from findAllTopCategories, no result.", exception);
      final Status status =
          Status.INTERNAL.withDescription("can not get any category.");
      throw new StatusRuntimeException(status);
    }
  }

  /**
   * get a category by it's id.
   *
   * @param request          request from client
   * @param responseObserver response to client
   */
  @Override
  public void getCategoryById(LongValue request, StreamObserver<GrpcCategory> responseObserver) {
    final long categoryId = request.getValue();
    LOG.info("enter getCategoryById, id is {}", categoryId);
    try {
      final Category category = categoryService.findCategoryById(categoryId);
      final GrpcCategory reply = CategoryMapper.transferToCategoryInfo(category);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.info("end getCategoryById, get the category: {}", reply.toString());
    } catch (NotFoundException exception) {
      LOG.debug("query fail, category with id {} is not exist.", categoryId);
      final Status status =
          Status.NOT_FOUND.withDescription("query category fail, ID is not exist");
      throw new StatusRuntimeException(status);
    }
  }
}
