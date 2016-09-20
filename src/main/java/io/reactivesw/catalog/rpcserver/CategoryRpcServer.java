package io.reactivesw.catalog.rpcserver;

import com.google.protobuf.Empty;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catalog.common.GrpcResponseUtil;
import io.reactivesw.catalog.domain.Category;
import io.reactivesw.catalog.dto.CategoryTransfer;
import io.reactivesw.catalog.exception.CatalogRuntimeException;
import io.reactivesw.catalog.infrastructure.CategoryList;
import io.reactivesw.catalog.infrastructure.CategoryServiceGrpc;
import io.reactivesw.catalog.service.CategoryService;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * this is gRPC server for catelog.
 * 
 * @author Davis
 *
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
      final Set<Category> categories = categoryService.findAllTopCategories();
      final CategoryList reply = CategoryTransfer.transferToCategoryList(categories);
      GrpcResponseUtil.completeResponse(responseObserver, reply);
      LOG.info("end getCategories.get {} categories.", reply.getCategoryCount());
    } catch (CatalogRuntimeException exception) {
      LOG.error("exception from findAllTopCategories, no result.");
      final Status status =
          Status.NOT_FOUND.withDescription("query all categories fail, no categories");
      throw new StatusRuntimeException(status);
    }
  }
}
