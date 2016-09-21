package io.reactivesw.catalog.infrastructure.utils

import io.grpc.stub.StreamObserver
import io.reactivesw.catalog.grpc.GrpcProduct
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
        def grpcResponseUtil = new GrpcResponseUtils()
        GrpcResponseUtils.completeResponse(responseObserver, reply)

        then:
        noExceptionThrown()
    }
}
