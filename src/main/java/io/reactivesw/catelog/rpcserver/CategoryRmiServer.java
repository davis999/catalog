package io.reactivesw.catelog.rpcserver;

import com.google.protobuf.Empty;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catelog.domain.Category;
import io.reactivesw.catelog.dto.CategoryTransfer;
import io.reactivesw.catelog.infrastructure.CategoryList;
import io.reactivesw.catelog.infrastructure.CategoryServiceGrpc;
import io.reactivesw.catelog.service.CategoryService;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * this is gRPC server for category.
 * 
 * @author Davis
 *
 */
@GRpcService
public class CategoryRmiServer extends CategoryServiceGrpc.CategoryServiceImplBase {

  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CategoryRmiServer.class);

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
    final List<Category> categories = categoryService.findAllTopCategories();
    if (categories == null) {
      LOG.debug("query top categories fail, result is null");
      final Status status =
          Status.NOT_FOUND.withDescription("query all categories fail, no categories");
      throw new StatusRuntimeException(status);
    }

    final CategoryList reply = CategoryTransfer.transferToCategoryList(categories);

    completeResponse(responseObserver, reply);
    LOG.debug("end getCategories.");
  }

  /**
   * complete response.
   * 
   * @param responseObserver responseObserver
   * @param reply reply
   */
  private <T> void completeResponse(StreamObserver<T> responseObserver, final T reply) {
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
