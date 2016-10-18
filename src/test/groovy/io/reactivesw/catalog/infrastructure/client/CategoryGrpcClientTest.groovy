package io.reactivesw.catalog.infrastructure.client

/**
 * Created by Davis on 16/9/23.
 */

import io.grpc.ManagedChannel
import io.grpc.netty.NettyChannelBuilder
import io.reactivesw.catalog.grpc.CategoryList
import io.reactivesw.catalog.grpc.CategoryServiceGrpc
import spock.lang.Specification

import java.text.DecimalFormat
import java.util.concurrent.TimeUnit

class CategoryGrpcClientTest extends Specification{
//
//  def "test find all top categories"(){
//    given:
//    ManagedChannel channel =
//        NettyChannelBuilder.forAddress("127.0.0.1", 9096).usePlaintext(true).build();
//    CategoryServiceGrpc.CategoryServiceBlockingStub stub = CategoryServiceGrpc.newBlockingStub(channel);
//
//    when:
//    CategoryList categories = stub.getCategories();
//
//    then:
//    categories != null;
//    categories.getCategoryList().size() == 4;
//    channel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
//  }
}

