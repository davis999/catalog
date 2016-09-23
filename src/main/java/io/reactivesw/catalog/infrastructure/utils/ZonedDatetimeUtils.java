package io.reactivesw.catalog.infrastructure.utils;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * utils for zoned date time.
 * Created by Davis on 16/9/23.
 */
public final class ZonedDatetimeUtils {

  /**
   * private constructor.
   */
  private ZonedDatetimeUtils() {
  }

  /**
   * get now ZonedDateTime of utc.
   *
   * @return ZonedDateTime.
   */
  public static ZonedDateTime getZonedDatetimeNow() {
    return ZonedDateTime.now(ZoneOffset.UTC);
  }
}
