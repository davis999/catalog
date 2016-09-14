package io.reactivesw.catelog.grpc.infrastructure;

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
 * define catelog rpc service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: reactivesw-catelog.proto")
public class CatelogServiceGrpc {

  private CatelogServiceGrpc() {}

  public static final String SERVICE_NAME = "io.reactivesw.catelog.grpc.CatelogService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.reactivesw.catelog.grpc.infrastructure.CategoryList> METHOD_GET_CATEGORIES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.grpc.CatelogService", "getCategories"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.grpc.infrastructure.CategoryList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.grpc.infrastructure.ProductBriefList> METHOD_QUERY_PRODUCTS_BY_CATEGORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.grpc.CatelogService", "queryProductsByCategory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.grpc.infrastructure.ProductBriefList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.grpc.infrastructure.ProductInfo> METHOD_QUERY_PRODUCT_DETIAL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.grpc.CatelogService", "queryProductDetial"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.grpc.infrastructure.ProductInfo.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CatelogServiceStub newStub(io.grpc.Channel channel) {
    return new CatelogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CatelogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CatelogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CatelogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CatelogServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * define catelog rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface CatelogService {

    /**
     * <pre>
     *query all categories and subcategories.
     * </pre>
     */
    public void getCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.CategoryList> responseObserver);

    /**
     * <pre>
     *query all products by id of category
     * </pre>
     */
    public void queryProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductBriefList> responseObserver);

    /**
     * <pre>
     *query product's detail by id of product
     * </pre>
     */
    public void queryProductDetial(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductInfo> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class CatelogServiceImplBase implements CatelogService, io.grpc.BindableService {

    @java.lang.Override
    public void getCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.CategoryList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CATEGORIES, responseObserver);
    }

    @java.lang.Override
    public void queryProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductBriefList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_PRODUCTS_BY_CATEGORY, responseObserver);
    }

    @java.lang.Override
    public void queryProductDetial(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductInfo> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY_PRODUCT_DETIAL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return CatelogServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   **
   * define catelog rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface CatelogServiceBlockingClient {

    /**
     * <pre>
     *query all categories and subcategories.
     * </pre>
     */
    public io.reactivesw.catelog.grpc.infrastructure.CategoryList getCategories(com.google.protobuf.Empty request);

    /**
     * <pre>
     *query all products by id of category
     * </pre>
     */
    public io.reactivesw.catelog.grpc.infrastructure.ProductBriefList queryProductsByCategory(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product's detail by id of product
     * </pre>
     */
    public io.reactivesw.catelog.grpc.infrastructure.ProductInfo queryProductDetial(com.google.protobuf.Int64Value request);
  }

  /**
   * <pre>
   **
   * define catelog rpc service.
   * </pre>
   */
  @java.lang.Deprecated public static interface CatelogServiceFutureClient {

    /**
     * <pre>
     *query all categories and subcategories.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.grpc.infrastructure.CategoryList> getCategories(
        com.google.protobuf.Empty request);

    /**
     * <pre>
     *query all products by id of category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.grpc.infrastructure.ProductBriefList> queryProductsByCategory(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product's detail by id of product
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.grpc.infrastructure.ProductInfo> queryProductDetial(
        com.google.protobuf.Int64Value request);
  }

  public static class CatelogServiceStub extends io.grpc.stub.AbstractStub<CatelogServiceStub>
      implements CatelogService {
    private CatelogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatelogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatelogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatelogServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void getCategories(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.CategoryList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CATEGORIES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void queryProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductBriefList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_PRODUCTS_BY_CATEGORY, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void queryProductDetial(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY_PRODUCT_DETIAL, getCallOptions()), request, responseObserver);
    }
  }

  public static class CatelogServiceBlockingStub extends io.grpc.stub.AbstractStub<CatelogServiceBlockingStub>
      implements CatelogServiceBlockingClient {
    private CatelogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatelogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatelogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatelogServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public io.reactivesw.catelog.grpc.infrastructure.CategoryList getCategories(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CATEGORIES, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.grpc.infrastructure.ProductBriefList queryProductsByCategory(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_PRODUCTS_BY_CATEGORY, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.grpc.infrastructure.ProductInfo queryProductDetial(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY_PRODUCT_DETIAL, getCallOptions(), request);
    }
  }

  public static class CatelogServiceFutureStub extends io.grpc.stub.AbstractStub<CatelogServiceFutureStub>
      implements CatelogServiceFutureClient {
    private CatelogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CatelogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CatelogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CatelogServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.grpc.infrastructure.CategoryList> getCategories(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CATEGORIES, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.grpc.infrastructure.ProductBriefList> queryProductsByCategory(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_PRODUCTS_BY_CATEGORY, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.grpc.infrastructure.ProductInfo> queryProductDetial(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY_PRODUCT_DETIAL, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractCatelogService extends CatelogServiceImplBase {}

  private static final int METHODID_GET_CATEGORIES = 0;
  private static final int METHODID_QUERY_PRODUCTS_BY_CATEGORY = 1;
  private static final int METHODID_QUERY_PRODUCT_DETIAL = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CatelogService serviceImpl;
    private final int methodId;

    public MethodHandlers(CatelogService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CATEGORIES:
          serviceImpl.getCategories((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.CategoryList>) responseObserver);
          break;
        case METHODID_QUERY_PRODUCTS_BY_CATEGORY:
          serviceImpl.queryProductsByCategory((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductBriefList>) responseObserver);
          break;
        case METHODID_QUERY_PRODUCT_DETIAL:
          serviceImpl.queryProductDetial((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.grpc.infrastructure.ProductInfo>) responseObserver);
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
        METHOD_GET_CATEGORIES,
        METHOD_QUERY_PRODUCTS_BY_CATEGORY,
        METHOD_QUERY_PRODUCT_DETIAL);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final CatelogService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_CATEGORIES,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              io.reactivesw.catelog.grpc.infrastructure.CategoryList>(
                serviceImpl, METHODID_GET_CATEGORIES)))
        .addMethod(
          METHOD_QUERY_PRODUCTS_BY_CATEGORY,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.grpc.infrastructure.ProductBriefList>(
                serviceImpl, METHODID_QUERY_PRODUCTS_BY_CATEGORY)))
        .addMethod(
          METHOD_QUERY_PRODUCT_DETIAL,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.grpc.infrastructure.ProductInfo>(
                serviceImpl, METHODID_QUERY_PRODUCT_DETIAL)))
        .build();
  }
}
