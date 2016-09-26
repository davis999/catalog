package io.reactivesw.catalog.infrastructure.exception;

/**
 * SkuNotActiveException, when active of sku is false, throw this exception.
 * Created by Davis on 16/9/26.
 */
public class SkuNotActiveException extends RuntimeException {

  /**
   * auto generated serial id.
   */
  private static final long serialVersionUID = -8976040699328157708L;

  /**
   * Constructs an SkuNotActiveException with no detail message.
   */
  public SkuNotActiveException() {
    super();
  }

  /**
   * Constructs an SkuNotActiveException with the
   * specified detail message.
   *
   * @param message the detail message.
   */
  public SkuNotActiveException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and
   * cause.
   *
   * @param message the detail message.
   * @param cause   the cause.
   */
  public SkuNotActiveException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified cause and a detail
   * message of (cause==null ? null : cause.toString()).
   *
   * @param cause the cause.
   */
  public SkuNotActiveException(Throwable cause) {
    super(cause);
  }
}