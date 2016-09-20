package io.reactivesw.catalog.infrastructure;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 **
 *  product rpc service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: catalog-service.proto")
public class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "io.reactivesw.catalog.infrastructure.ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catalog.infrastructure.ProductBriefList> METHOD_GET_PRODUCTS_BY_CATEGORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catalog.infrastructure.ProductService", "getProductsByCategory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catalog.infrastructure.ProductBriefList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catalog.infrastructure.GrpcProduct> METHOD_GET_PRODUCT_DETIAL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catalog.infrastructure.ProductService", "getProductDetial"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catalog.infrastructure.GrpcProduct.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   *  product rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface ProductService {

    /**
     * <pre>
     *query all products by id of category
     * </pre>
     */
    public void getProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.ProductBriefList> responseObserver);

    /**
     * <pre>
     *query product's detail by id of product
     * </pre>
     */
    public void getProductDetial(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.GrpcProduct> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ProductServiceImplBase implements ProductService, io.grpc.BindableService {

    @java.lang.Override
    public void getProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.ProductBriefList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS_BY_CATEGORY, responseObserver);
    }

    @java.lang.Override
    public void getProductDetial(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.GrpcProduct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_DETIAL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   **
   *  product rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface ProductServiceBlockingClient {

    /**
     * <pre>
     *query all products by id of category
     * </pre>
     */
    public io.reactivesw.catalog.infrastructure.ProductBriefList getProductsByCategory(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product's detail by id of product
     * </pre>
     */
    public io.reactivesw.catalog.infrastructure.GrpcProduct getProductDetial(com.google.protobuf.Int64Value request);
  }

  /**
   * <pre>
   **
   *  product rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface ProductServiceFutureClient {

    /**
     * <pre>
     *query all products by id of category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catalog.infrastructure.ProductBriefList> getProductsByCategory(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product's detail by id of product
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catalog.infrastructure.GrpcProduct> getProductDetial(
        com.google.protobuf.Int64Value request);
  }

  public static class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub>
      implements ProductService {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.ProductBriefList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_CATEGORY, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getProductDetial(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.GrpcProduct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_DETIAL, getCallOptions()), request, responseObserver);
    }
  }

  public static class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub>
      implements ProductServiceBlockingClient {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public io.reactivesw.catalog.infrastructure.ProductBriefList getProductsByCategory(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS_BY_CATEGORY, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catalog.infrastructure.GrpcProduct getProductDetial(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_DETIAL, getCallOptions(), request);
    }
  }

  public static class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub>
      implements ProductServiceFutureClient {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catalog.infrastructure.ProductBriefList> getProductsByCategory(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_CATEGORY, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catalog.infrastructure.GrpcProduct> getProductDetial(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_DETIAL, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractProductService extends ProductServiceImplBase {}

  private static final int METHODID_GET_PRODUCTS_BY_CATEGORY = 0;
  private static final int METHODID_GET_PRODUCT_DETIAL = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductService serviceImpl;
    private final int methodId;

    public MethodHandlers(ProductService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS_BY_CATEGORY:
          serviceImpl.getProductsByCategory((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.ProductBriefList>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_DETIAL:
          serviceImpl.getProductDetial((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catalog.infrastructure.GrpcProduct>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_PRODUCTS_BY_CATEGORY,
        METHOD_GET_PRODUCT_DETIAL);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ProductService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_PRODUCTS_BY_CATEGORY,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catalog.infrastructure.ProductBriefList>(
                serviceImpl, METHODID_GET_PRODUCTS_BY_CATEGORY)))
        .addMethod(
          METHOD_GET_PRODUCT_DETIAL,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catalog.infrastructure.GrpcProduct>(
                serviceImpl, METHODID_GET_PRODUCT_DETIAL)))
        .build();
  }
}
