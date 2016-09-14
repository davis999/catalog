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

import java.util.List;

import javax.annotation.Resource;

/**
 * this is gRPC server for catelog.
 * 
 * @author Davis
 *
 */
@GRpcService
public class CatelogRmiServer extends CatelogServiceGrpc.CatelogServiceImplBase {

  /**
   * category service.
   */
  @Resource(name = "categoryService")
  private transient CategoryService categoryService;

  /**
   * product service.
   */
  @Resource(name = "productService")
  private transient ProductService productService;

  /**
   * get product detail.
   */
  @Override
  public void queryProductDetial(Int64Value request, StreamObserver<GrpcProduct> responseObserver) {
    // TODO Auto-generated method stub
    final long productId = request.getValue();
    final Product product = productService.queryProductById(productId);
    if (null == product) {
      final Status status = Status.NOT_FOUND.withDescription("query product fail, not found");
      throw new StatusRuntimeException(status);
    }

    final GrpcProduct reply = ProductTransfer.transferToProductInfo(product);

    completeResponse(responseObserver, reply);
  }

  /**
   * query products by category.
   */
  @Override
  public void queryProductsByCategory(Int64Value request,
      StreamObserver<ProductBriefList> responseObserver) {
    final long categoryId = request.getValue();
    final List<Product> products = productService.queryProductsByCategoryId(categoryId);
    if (null == products) {
      final Status status = Status.NOT_FOUND.withDescription("query product list fail, not found");
      throw new StatusRuntimeException(status);
    }
    final ProductBriefList reply = ProductTransfer.transferToProductBriefList(products);

    completeResponse(responseObserver, reply);
  }

  /**
   * get all categories and subcategories.
   */
  @Override
  public void getCategories(Empty request, StreamObserver<CategoryList> responseObserver) {
    final List<Category> categories = categoryService.findAllTopCategories();
    if (null == categories) {
      final Status status =
          Status.NOT_FOUND.withDescription("query all categories fail, no categories");
      throw new StatusRuntimeException(status);
    }

    final CategoryList reply = CategoryTransfer.transferToCategoryList(categories);

    completeResponse(responseObserver, reply);
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
