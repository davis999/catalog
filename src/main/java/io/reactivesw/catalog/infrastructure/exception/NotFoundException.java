package io.reactivesw.catalog.infrastructure.exception;

/**
 * not found exception.
 *
 * @author Davis
 */
public final class NotFoundException extends RuntimeException {

  /**
   * auto generated serial id.
   */
  private static final long serialVersionUID = 5853876300441275612L;

  /**
   * Constructs an NotFoundException with no detail message.
   */
  public NotFoundException() {
    super();
  }

  /**
   * Constructs an NotFoundException with the
   * specified detail message.
   *
   * @param message the detail message.
   */
  public NotFoundException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and
   * cause.
   * @param message the detail message.
   * @param cause   the cause.
   */
  public NotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified cause and a detail
   * message of (cause==null ? null : cause.toString()).
   *
   * @param cause the cause.
   */
  public NotFoundException(Throwable cause) {
    super(cause);
  }
}
