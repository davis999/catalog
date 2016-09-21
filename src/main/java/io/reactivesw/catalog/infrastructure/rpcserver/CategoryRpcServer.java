package io.reactivesw.catalog.infrastructure.rpcserver;

import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.domain.service.CategoryService;
import io.reactivesw.catalog.grpc.CategoryList;
import io.reactivesw.catalog.grpc.CategoryServiceGrpc;
import io.reactivesw.catalog.grpc.GrpcCategory;
import io.reactivesw.catalog.infrastructure.dto.CategoryTransfer;
import io.reactivesw.catalog.infrastructure.exception.CatalogRuntimeException;
import io.reactivesw.catalog.infrastructure.utils.GrpcResponseUtils;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * this is gRPC server for catelog.
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
    LOG.info("enter getCategories.");
    try {
      final List<Category> categories = categoryService.findAllCategories();
      final CategoryList reply = CategoryTransfer.transferToCategoryList(categories);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.info("end getCategories.get {} categories.", reply.getCategoryCount());
    } catch (CatalogRuntimeException exception) {
      LOG.error("exception from findAllTopCategories, no result.", exception);
      final Status status =
          Status.NOT_FOUND.withDescription("query all categories fail, no categories");
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
  public void getCategoryById(Int64Value request, StreamObserver<GrpcCategory> responseObserver) {
    final long categoryId = request.getValue();
    LOG.info("enter getCategoryById, id is {}", categoryId);
    try {
      final Category category = categoryService.findCategoryById(categoryId);
      final GrpcCategory reply = CategoryTransfer.transferToCategoryInfo(category);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.info("end getCategoryById, get the category: {}", reply.toString());
    } catch (CatalogRuntimeException exception) {
      LOG.error("query fail, category with id {} is not exist.", categoryId);
      final Status status =
          Status.NOT_FOUND.withDescription("query category fail, ID is not exist");
      throw new StatusRuntimeException(status);
    }
  }
}
