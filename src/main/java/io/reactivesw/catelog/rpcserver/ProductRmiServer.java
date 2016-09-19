package io.reactivesw.catelog.rpcserver;

import com.google.protobuf.Int64Value;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catelog.common.GrpcResponseUtil;
import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.dto.ProductTransfer;
import io.reactivesw.catelog.infrastructure.GrpcProduct;
import io.reactivesw.catelog.infrastructure.ProductBriefList;
import io.reactivesw.catelog.infrastructure.ProductServiceGrpc;
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
public class ProductRmiServer extends ProductServiceGrpc.ProductServiceImplBase {

  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ProductRmiServer.class);

  /**
   * product service.
   */
  @Autowired
  private transient ProductService productService;

  /**
   * get product detail.
   */
  @Override
  public void getProductDetial(Int64Value request, StreamObserver<GrpcProduct> responseObserver) {
    final long productId = request.getValue();
    LOG.debug("enter queryProductDetial, product id is {}", productId);
    final Product product = productService.queryProductById(productId);
    if (product == null) {
      LOG.error("product is null, query id is {}", productId);
      final Status status = Status.NOT_FOUND.withDescription("query product fail, not found");
      throw new StatusRuntimeException(status);
    }

    final GrpcProduct reply = ProductTransfer.transferToGrpcProduct(product);

    GrpcResponseUtil.completeResponse(responseObserver, reply);
    LOG.info("end queryProductDetial.");
  }

  /**
   * query products by category.
   */
  @Override
  public void getProductsByCategory(Int64Value request,
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

    GrpcResponseUtil.completeResponse(responseObserver, reply);
    LOG.debug("end queryProductsByCategory");
  }
}
