package io.reactivesw.catalog.infrastructure.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * utils class for BigDecimal.
 * Created by Davis on 16/10/9.
 */
public final class DecimalFormatUtils {
  /**
   * DecimalFormat.
   */
  private static DecimalFormat formatter = new DecimalFormat("#.#####");

  /**
   * private constructor.
   */
  private DecimalFormatUtils() {
  }
  
  /**
   * transfer BigDecimal to String, and remove uselese 0.
   *
   * @param decimal BigDecimal
   * @return String
   */
  public static String transferToShortString(BigDecimal decimal) {
    return formatter.format(decimal);
  }
}
