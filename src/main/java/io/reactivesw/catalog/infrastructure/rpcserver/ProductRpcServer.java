package io.reactivesw.catalog.infrastructure.rpcserver;

import com.google.protobuf.Int64Value;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.service.ProductService;
import io.reactivesw.catalog.grpc.GrpcProduct;
import io.reactivesw.catalog.grpc.ProductBriefList;
import io.reactivesw.catalog.grpc.ProductServiceGrpc;
import io.reactivesw.catalog.infrastructure.dto.ProductTransfer;
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
 *
 */
@GRpcService
public class ProductRpcServer extends ProductServiceGrpc.ProductServiceImplBase {

  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ProductRpcServer.class);

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
    LOG.info("enter queryProductDetial, product id is {}", productId);
    try {
      final Product product = productService.queryProductById(productId);
      final GrpcProduct reply = ProductTransfer.transferToGrpcProduct(product);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.info("end queryProductDetial, product is {}.", reply.toString());
    } catch (CatalogRuntimeException exception) {
      LOG.error("product is null, id is {}", productId);
      final Status status = Status.NOT_FOUND.withDescription("query product fail, not found");
      throw new StatusRuntimeException(status);
    }
  }

  /**
   * query products by category.
   */
  @Override
  public void getProductsByCategory(Int64Value request,
      StreamObserver<ProductBriefList> responseObserver) {
    final long categoryId = request.getValue();
    LOG.info("enter queryProductsByCategory, category id is {}", categoryId);
    try {
      final List<Product> products = productService.queryProductsByCategoryId(categoryId);
      final ProductBriefList reply = ProductTransfer.transferToProductBriefList(products);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.info("end queryProductsByCategory, get {} products", reply.getProductBriefCount());
    } catch (CatalogRuntimeException exception) {
      LOG.debug("cann't query product by category id {}", categoryId);
      final Status status = Status.NOT_FOUND.withDescription("query product list fail, not found");
      throw new StatusRuntimeException(status);
    }
  }
}
