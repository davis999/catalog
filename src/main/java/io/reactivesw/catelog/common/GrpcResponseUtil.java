package io.reactivesw.catelog.common;

import io.grpc.stub.StreamObserver;

/**
 * this is util class for grpc response.
 * 
 * @author Davis
 *
 */
public final class GrpcResponseUtil {

  /**
   * private constructor.
   */
  private GrpcResponseUtil() {}

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
