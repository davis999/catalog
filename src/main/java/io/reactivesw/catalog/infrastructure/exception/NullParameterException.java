package io.reactivesw.catalog.infrastructure.exception;

/**
 * null parameter exception.
 *
 * @author Davis
 */
public final class NullParameterException extends RuntimeException {

  /**
   * auto generated serial id.
   */
  private static final long serialVersionUID = -389441148110902147L;

  /**
   * Constructs an NullParameterException with no detail message.
   */
  public NullParameterException() {
    super();
  }

  /**
   * Constructs an NullParameterException with the
   * specified detail message.
   *
   * @param message the detail message.
   */
  public NullParameterException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and
   * cause.
   *
   * @param message the detail message.
   * @param cause   the cause.
   */
  public NullParameterException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified cause and a detail
   * message of (cause==null ? null : cause.toString()).
   *
   * @param cause the cause.
   */
  public NullParameterException(Throwable cause) {
    super(cause);
  }
}
