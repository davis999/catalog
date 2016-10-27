package io.reactivesw.catalog.infrastructure.rpcserver;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.service.ProductService;
import io.reactivesw.catalog.grpc.GrpcProduct;
import io.reactivesw.catalog.grpc.LongValue;
import io.reactivesw.catalog.grpc.ProductBriefList;
import io.reactivesw.catalog.grpc.ProductServiceGrpc;
import io.reactivesw.catalog.infrastructure.mapper.ProductMapper;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.utils.GrpcResponseUtils;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * this is gRPC server for product.
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
  public void getProductDetial(LongValue request, StreamObserver<GrpcProduct> responseObserver) {
    final long productId = request.getValue();
    LOG.debug("enter queryProductDetial, product id is {}", productId);
    try {
      final Product product = productService.getProductDetail(productId);
      final GrpcProduct reply = ProductMapper.transferToGrpcProduct(product);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end queryProductDetial, product is {}.", reply.toString());
    } catch (NotFoundException exception) {
      LOG.debug("product is null, id is {}", productId);
      final Status status = Status.NOT_FOUND.withDescription("query product fail, not found");
      throw new StatusRuntimeException(status);
    }
  }

  /**
   * query products by category.
   */
  @Override
  public void getProductsByCategory(LongValue request,
      StreamObserver<ProductBriefList> responseObserver) {
    final long categoryId = request.getValue();
    LOG.debug("enter queryProductsByCategory, category id is {}", categoryId);
    try {
      final List<Product> products = productService.queryProductsByCategory(categoryId);
      final ProductBriefList reply = ProductMapper.transferToProductBriefList(products);
      GrpcResponseUtils.completeResponse(responseObserver, reply);
      LOG.debug("end queryProductsByCategory, get {} products", reply.getProductBriefCount());
    } catch (NotFoundException exception) {
      LOG.debug("can not query product by a not exist category with id {}.", categoryId);
      final Status status = Status.NOT_FOUND.withDescription("category is not exist");
      throw new StatusRuntimeException(status);
    }
  }
}
