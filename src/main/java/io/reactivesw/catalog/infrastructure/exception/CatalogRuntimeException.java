package io.reactivesw.catalog.infrastructure.exception;

/**
 * catalog runtime exception.
 *
 * @author Davis
 */
public final class CatalogRuntimeException extends RuntimeException {
  private static final long serialVersionUID = 6797042230823725800L;

  /**
   * Constructs an CatalogRuntimeException with no detail message.
   */
  public CatalogRuntimeException() {
    super();
  }

  /**
   * Constructs an <code>CatalogRuntimeException</code> with the
   * specified detail message.
   *
   * @param message the detail message.
   */
  public CatalogRuntimeException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and
   * cause.
   * <p>
   * <p>Note that the detail message associated with <code>cause</code> is
   * <i>not</i> automatically incorporated in this exception's detail
   * message.
   *
   * @param message the detail message.
   * @param cause   the cause.
   */
  public CatalogRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified cause and a detail
   * message of <tt>(cause==null ? null : cause.toString())</tt> (which
   * typically contains the class and detail message of <tt>cause</tt>).
   * This constructor is useful for exceptions that are little more than
   * wrappers for other throwables (for example, {@link
   * java.security.PrivilegedActionException}).
   *
   * @param cause the cause.
   */
  public CatalogRuntimeException(Throwable cause) {
    super(cause);
  }
}
