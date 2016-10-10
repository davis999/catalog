package io.reactivesw.catalog.infrastructure.client

import com.google.protobuf.Int64Value
import io.grpc.ManagedChannel
import io.grpc.netty.NettyChannelBuilder
import io.reactivesw.catalog.grpc.GrpcProduct
import io.reactivesw.catalog.grpc.LongValue
import io.reactivesw.catalog.grpc.ProductBriefList
import io.reactivesw.catalog.grpc.ProductServiceGrpc
import spock.lang.Specification

/**
 * Created by Davis on 16/9/23.
 */
class ProductGrpcClientTest extends Specification {

//    def "test find list of product by category"() {
//        given:
//        ManagedChannel channel =
//                NettyChannelBuilder.forAddress("192.168.8.115", 9096).usePlaintext(true).build();
//        ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);
//        LongValue.Builder builder = LongValue.newBuilder();
//        builder.setValue(1L);
//
//        when:
//        ProductBriefList products = stub.getProductsByCategory(builder.build());
//        then:
//        products != null;
//        products.getProductBriefCount() > 0;
//    }

//    def "test find product detail information"() {
//        given:
//        def productId = 1L;
//        ManagedChannel channel =
//                NettyChannelBuilder.forAddress("127.0.0.1", 9096).usePlaintext(true).build();
//        ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);
//        Int64Value.Builder builder = Int64Value.newBuilder();
//        builder.setValue(productId);
//        when:
//        GrpcProduct productInfo = stub.getProductDetial(builder.build());
//        then:
//        productInfo != null
//
//    }
}
