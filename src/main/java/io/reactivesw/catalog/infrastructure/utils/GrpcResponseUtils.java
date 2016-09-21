package io.reactivesw.catalog.infrastructure.utils;

import io.grpc.stub.StreamObserver;

/**
 * this is utils class for grpc response.
 * 
 * @author Davis
 *
 */
public final class GrpcResponseUtils {

  /**
   * private constructor.
   */
  private GrpcResponseUtils() {}

  /**
   * complete response.
   * 
   * @param responseObserver responseObserver
   * @param reply reply
   */
  public static <T> void completeResponse(StreamObserver<T> responseObserver, final T reply) {
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
