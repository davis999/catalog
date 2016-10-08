package io.reactivesw.catalog.infrastructure.client

import com.google.protobuf.Int32Value
import com.google.protobuf.Int64Value
import io.grpc.ManagedChannel
import io.grpc.netty.NettyChannelBuilder
import io.reactivesw.catalog.grpc.SkuIdList
import io.reactivesw.catalog.grpc.SkuInformation
import io.reactivesw.catalog.grpc.SkuInformationList
import io.reactivesw.catalog.grpc.SkuServiceGrpc
import spock.lang.Specification

/**
 * Created by Davis on 16/9/26.
 */
class SkuGrpcClient extends Specification {
//    def "query sku inventory by id"(){
//        given:
//        long skuId = 2L
//        Int64Value request = Int64Value.newBuilder().setValue(skuId).build()
//        ManagedChannel channel =
//                NettyChannelBuilder.forAddress("127.0.0.1", 9096).usePlaintext(true).build()
//        SkuServiceGrpc.SkuServiceBlockingStub stub = SkuServiceGrpc.newBlockingStub(channel)
//
//        when:
//        Int32Value reply = stub.querySkuInventory(request)
//
//        then:
//        reply.getValue() == 10086
//    }
//
//    def "query sku information by id"(){
//        given:
//        long skuId = 2L
//        Int64Value request = Int64Value.newBuilder().setValue(skuId).build()
//        ManagedChannel channel =
//                NettyChannelBuilder.forAddress("127.0.0.1", 9096).usePlaintext(true).build()
//        SkuServiceGrpc.SkuServiceBlockingStub stub = SkuServiceGrpc.newBlockingStub(channel)
//
//        when:
//        SkuInformation reply = stub.querySkuSimpleInformation(request)
//
//        then:
//        reply != null
//        reply.getSkuId() == skuId
//        reply.getMediaUrl() != ""
//    }

//    def "query sku information by id"() {
//        given:
//        SkuIdList.Builder builder = SkuIdList.newBuilder()
//        builder.addSkuId(19L).addSkuId(12L).addSkuId(13L).addSkuId(14L);
//        ManagedChannel channel =
//                NettyChannelBuilder.forAddress("127.0.0.1", 9096).usePlaintext(true).build()
//        SkuServiceGrpc.SkuServiceBlockingStub stub = SkuServiceGrpc.newBlockingStub(channel)
//
//        when:
//        SkuInformationList reply = stub.querySkuInformationList(builder.build())
//
//        then:
//        reply != null
//        reply.getSkuInformationCount() == 0
//    }
}
