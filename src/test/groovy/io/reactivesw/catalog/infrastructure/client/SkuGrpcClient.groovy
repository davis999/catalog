package io.reactivesw.catalog.infrastructure.client

import io.grpc.ManagedChannel
import io.grpc.netty.NettyChannelBuilder
import io.reactivesw.catalog.grpc.IntValue
import io.reactivesw.catalog.grpc.LongValue
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
//        long skuId = 1L
//        LongValue request = LongValue.newBuilder().setValue(skuId).build()
//        ManagedChannel channel =
//                NettyChannelBuilder.forAddress("127.0.0.1", 9096).usePlaintext(true).build()
//        SkuServiceGrpc.SkuServiceBlockingStub stub = SkuServiceGrpc.newBlockingStub(channel)
//
//        when:
//        IntValue reply = stub.querySkuInventory(request)
//
//        then:
//        reply.getValue() == 10086
//    }
//
//    def "query sku information by id"(){
//        given:
//        long skuId = 1L
//        LongValue request = LongValue.newBuilder().setValue(skuId).build()
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
}
