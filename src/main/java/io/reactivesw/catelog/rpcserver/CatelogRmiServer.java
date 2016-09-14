package io.reactivesw.catelog.rpcserver;

import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catelog.domain.Category;
import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.dto.CategoryTransfer;
import io.reactivesw.catelog.dto.ProductTransfer;
import io.reactivesw.catelog.infrastructure.CategoryList;
import io.reactivesw.catelog.infrastructure.CatelogServiceGrpc;
import io.reactivesw.catelog.infrastructure.GrpcProduct;
import io.reactivesw.catelog.infrastructure.ProductBriefList;
import io.reactivesw.catelog.service.CategoryService;
import io.reactivesw.catelog.service.ProductService;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * this is gRPC server for catelog.
 * 
 * @author Davis
 *
 */
@GRpcService
public class CatelogRmiServer extends CatelogServiceGrpc.CatelogServiceImplBase {


  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CatelogRmiServer.class);

  /**
   * category service.
   */
  @Autowired
  private transient CategoryService categoryService;

  /**
   * product service.
   */
  @Autowired
  private transient ProductService productService;

  /**
   * get product detail.
   */
  @Override
  public void queryProductDetial(Int64Value request, StreamObserver<GrpcProduct> responseObserver) {
    final long productId = request.getValue();
    LOG.debug("enter queryProductDetial, product id is {}", productId);
    final Product product = productService.queryProductById(productId);
    if (product == null) {
      LOG.error("product is null, query id is {}", productId);
      final Status status = Status.NOT_FOUND.withDescription("query product fail, not found");
      throw new StatusRuntimeException(status);
    }

    final GrpcProduct reply = ProductTransfer.transferToProductInfo(product);

    completeResponse(responseObserver, reply);
    LOG.info("end queryProductDetial.");
  }

  /**
   * query products by category.
   */
  @Override
  public void queryProductsByCategory(Int64Value request,
      StreamObserver<ProductBriefList> responseObserver) {
    final long categoryId = request.getValue();
    LOG.debug("enter queryProductsByCategory, category id is {}", categoryId);
    final List<Product> products = productService.queryProductsByCategoryId(categoryId);
    if (products == null) {
      LOG.debug("cann't query product by category id {}", categoryId);
      final Status status = Status.NOT_FOUND.withDescription("query product list fail, not found");
      throw new StatusRuntimeException(status);
    }
    final ProductBriefList reply = ProductTransfer.transferToProductBriefList(products);

    completeResponse(responseObserver, reply);
    LOG.debug("end queryProductsByCategory");
  }

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
