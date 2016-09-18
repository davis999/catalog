package io.reactivesw.catelog.infrastructure;

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
 *service for product.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: catelog-service.proto")
public class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "io.reactivesw.catelog.infrastructure.ProductService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.infrastructure.ProductBriefList> METHOD_GET_PRODUCTS_BY_CATEGORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getProductsByCategory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.infrastructure.ProductBriefList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.infrastructure.GrpcProduct> METHOD_GET_PRODUCT_GENARAL_INFORMATION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getProductGenaralInformation"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.infrastructure.GrpcProduct.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.infrastructure.FeatureList> METHOD_GET_PRODUCT_FEATURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getProductFeature"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.infrastructure.FeatureList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.infrastructure.VariantList> METHOD_GET_PRODUCT_VARIANT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getProductVariant"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.infrastructure.VariantList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.infrastructure.SkuList> METHOD_GET_SKU_BY_PRODUCT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getSkuByProduct"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.infrastructure.SkuList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      io.reactivesw.catelog.infrastructure.AttributeList> METHOD_GET_PRODUCT_ATTRIBUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getProductAttribute"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.reactivesw.catelog.infrastructure.AttributeList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.StringValue> METHOD_GET_PRODUCT_DETAIL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "io.reactivesw.catelog.infrastructure.ProductService", "getProductDetail"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Int64Value.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.StringValue.getDefaultInstance()));

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
   *service for product.
   * </pre>
   */
  @java.lang.Deprecated public static interface ProductService {

    /**
     * <pre>
     *query all products by id of category.
     * </pre>
     */
    public void getProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.ProductBriefList> responseObserver);

    /**
     * <pre>
     *query product genaral information by product id.
     * </pre>
     */
    public void getProductGenaralInformation(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.GrpcProduct> responseObserver);

    /**
     * <pre>
     *query product feature by product id.
     * </pre>
     */
    public void getProductFeature(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.FeatureList> responseObserver);

    /**
     * <pre>
     *query product variant by product id.
     * </pre>
     */
    public void getProductVariant(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.VariantList> responseObserver);

    /**
     * <pre>
     *query skus by product id.
     * </pre>
     */
    public void getSkuByProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.SkuList> responseObserver);

    /**
     * <pre>
     *query product attribute by product id.
     *TODO define response body.
     * </pre>
     */
    public void getProductAttribute(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.AttributeList> responseObserver);

    /**
     * <pre>
     *query product's detail by id of product.
     * </pre>
     */
    public void getProductDetail(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class ProductServiceImplBase implements ProductService, io.grpc.BindableService {

    @java.lang.Override
    public void getProductsByCategory(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.ProductBriefList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS_BY_CATEGORY, responseObserver);
    }

    @java.lang.Override
    public void getProductGenaralInformation(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.GrpcProduct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_GENARAL_INFORMATION, responseObserver);
    }

    @java.lang.Override
    public void getProductFeature(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.FeatureList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_FEATURE, responseObserver);
    }

    @java.lang.Override
    public void getProductVariant(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.VariantList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_VARIANT, responseObserver);
    }

    @java.lang.Override
    public void getSkuByProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.SkuList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SKU_BY_PRODUCT, responseObserver);
    }

    @java.lang.Override
    public void getProductAttribute(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.AttributeList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_ATTRIBUTE, responseObserver);
    }

    @java.lang.Override
    public void getProductDetail(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCT_DETAIL, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   **
   *service for product.
   * </pre>
   */
  @java.lang.Deprecated public static interface ProductServiceBlockingClient {

    /**
     * <pre>
     *query all products by id of category.
     * </pre>
     */
    public io.reactivesw.catelog.infrastructure.ProductBriefList getProductsByCategory(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product genaral information by product id.
     * </pre>
     */
    public io.reactivesw.catelog.infrastructure.GrpcProduct getProductGenaralInformation(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product feature by product id.
     * </pre>
     */
    public io.reactivesw.catelog.infrastructure.FeatureList getProductFeature(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product variant by product id.
     * </pre>
     */
    public io.reactivesw.catelog.infrastructure.VariantList getProductVariant(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query skus by product id.
     * </pre>
     */
    public io.reactivesw.catelog.infrastructure.SkuList getSkuByProduct(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product attribute by product id.
     *TODO define response body.
     * </pre>
     */
    public io.reactivesw.catelog.infrastructure.AttributeList getProductAttribute(com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product's detail by id of product.
     * </pre>
     */
    public com.google.protobuf.StringValue getProductDetail(com.google.protobuf.Int64Value request);
  }

  /**
   * <pre>
   **
   *service for product.
   * </pre>
   */
  @java.lang.Deprecated public static interface ProductServiceFutureClient {

    /**
     * <pre>
     *query all products by id of category.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.ProductBriefList> getProductsByCategory(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product genaral information by product id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.GrpcProduct> getProductGenaralInformation(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product feature by product id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.FeatureList> getProductFeature(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product variant by product id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.VariantList> getProductVariant(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query skus by product id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.SkuList> getSkuByProduct(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product attribute by product id.
     *TODO define response body.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.AttributeList> getProductAttribute(
        com.google.protobuf.Int64Value request);

    /**
     * <pre>
     *query product's detail by id of product.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> getProductDetail(
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
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.ProductBriefList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_CATEGORY, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getProductGenaralInformation(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.GrpcProduct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_GENARAL_INFORMATION, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getProductFeature(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.FeatureList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_FEATURE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getProductVariant(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.VariantList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_VARIANT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getSkuByProduct(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.SkuList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SKU_BY_PRODUCT, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getProductAttribute(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.AttributeList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_ATTRIBUTE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void getProductDetail(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.StringValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_DETAIL, getCallOptions()), request, responseObserver);
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
    public io.reactivesw.catelog.infrastructure.ProductBriefList getProductsByCategory(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS_BY_CATEGORY, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.infrastructure.GrpcProduct getProductGenaralInformation(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_GENARAL_INFORMATION, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.infrastructure.FeatureList getProductFeature(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_FEATURE, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.infrastructure.VariantList getProductVariant(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_VARIANT, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.infrastructure.SkuList getSkuByProduct(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SKU_BY_PRODUCT, getCallOptions(), request);
    }

    @java.lang.Override
    public io.reactivesw.catelog.infrastructure.AttributeList getProductAttribute(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_ATTRIBUTE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.google.protobuf.StringValue getProductDetail(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCT_DETAIL, getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.ProductBriefList> getProductsByCategory(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_BY_CATEGORY, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.GrpcProduct> getProductGenaralInformation(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_GENARAL_INFORMATION, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.FeatureList> getProductFeature(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_FEATURE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.VariantList> getProductVariant(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_VARIANT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.SkuList> getSkuByProduct(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SKU_BY_PRODUCT, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<io.reactivesw.catelog.infrastructure.AttributeList> getProductAttribute(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_ATTRIBUTE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.StringValue> getProductDetail(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCT_DETAIL, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractProductService extends ProductServiceImplBase {}

  private static final int METHODID_GET_PRODUCTS_BY_CATEGORY = 0;
  private static final int METHODID_GET_PRODUCT_GENARAL_INFORMATION = 1;
  private static final int METHODID_GET_PRODUCT_FEATURE = 2;
  private static final int METHODID_GET_PRODUCT_VARIANT = 3;
  private static final int METHODID_GET_SKU_BY_PRODUCT = 4;
  private static final int METHODID_GET_PRODUCT_ATTRIBUTE = 5;
  private static final int METHODID_GET_PRODUCT_DETAIL = 6;

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
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.ProductBriefList>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_GENARAL_INFORMATION:
          serviceImpl.getProductGenaralInformation((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.GrpcProduct>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_FEATURE:
          serviceImpl.getProductFeature((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.FeatureList>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_VARIANT:
          serviceImpl.getProductVariant((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.VariantList>) responseObserver);
          break;
        case METHODID_GET_SKU_BY_PRODUCT:
          serviceImpl.getSkuByProduct((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.SkuList>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_ATTRIBUTE:
          serviceImpl.getProductAttribute((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<io.reactivesw.catelog.infrastructure.AttributeList>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_DETAIL:
          serviceImpl.getProductDetail((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.StringValue>) responseObserver);
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
        METHOD_GET_PRODUCT_GENARAL_INFORMATION,
        METHOD_GET_PRODUCT_FEATURE,
        METHOD_GET_PRODUCT_VARIANT,
        METHOD_GET_SKU_BY_PRODUCT,
        METHOD_GET_PRODUCT_ATTRIBUTE,
        METHOD_GET_PRODUCT_DETAIL);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final ProductService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_PRODUCTS_BY_CATEGORY,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.infrastructure.ProductBriefList>(
                serviceImpl, METHODID_GET_PRODUCTS_BY_CATEGORY)))
        .addMethod(
          METHOD_GET_PRODUCT_GENARAL_INFORMATION,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.infrastructure.GrpcProduct>(
                serviceImpl, METHODID_GET_PRODUCT_GENARAL_INFORMATION)))
        .addMethod(
          METHOD_GET_PRODUCT_FEATURE,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.infrastructure.FeatureList>(
                serviceImpl, METHODID_GET_PRODUCT_FEATURE)))
        .addMethod(
          METHOD_GET_PRODUCT_VARIANT,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.infrastructure.VariantList>(
                serviceImpl, METHODID_GET_PRODUCT_VARIANT)))
        .addMethod(
          METHOD_GET_SKU_BY_PRODUCT,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.infrastructure.SkuList>(
                serviceImpl, METHODID_GET_SKU_BY_PRODUCT)))
        .addMethod(
          METHOD_GET_PRODUCT_ATTRIBUTE,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              io.reactivesw.catelog.infrastructure.AttributeList>(
                serviceImpl, METHODID_GET_PRODUCT_ATTRIBUTE)))
        .addMethod(
          METHOD_GET_PRODUCT_DETAIL,
          asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int64Value,
              com.google.protobuf.StringValue>(
                serviceImpl, METHODID_GET_PRODUCT_DETAIL)))
        .build();
  }
}
