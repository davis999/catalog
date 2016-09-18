package io.reactivesw.catelog.rpcserver;

import com.google.protobuf.Int64Value;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.dto.ProductTransfer;
import io.reactivesw.catelog.infrastructure.GrpcProduct;
import io.reactivesw.catelog.infrastructure.ProductServiceGrpc;
import io.reactivesw.catelog.repository.ProductRepository;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * this is gRPC server for product.
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
   * product repository.
   */
  @Autowired
  private transient ProductRepository productRepository;

  /**
   * get product general information.
   */
  @Override
  public void getProductGenaralInformation(Int64Value request,
      StreamObserver<GrpcProduct> responseObserver) {
    final long productId = request.getValue();
    LOG.debug("start getProductGenaralInformation, product id is {}", productId);
    final Product product = productRepository.findOne(productId);
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
