package io.reactivesw.catalog.common

import io.grpc.stub.StreamObserver
import io.reactivesw.catalog.infrastructure.GrpcProduct
import spock.lang.Specification

/**
 * Created by Davis on 16/9/20.
 */
class GrpcResponseUtilTest extends Specification{
    def "test GrpcResponseUtil"(){
        given:
        GrpcProduct reply = GrpcProduct.newBuilder().build()
        def responseObserver = Mock(StreamObserver)

        when:
        def grpcResponseUtil = new GrpcResponseUtil()
        GrpcResponseUtil.completeResponse(responseObserver, reply)

        then:
        noExceptionThrown()
    }
}
