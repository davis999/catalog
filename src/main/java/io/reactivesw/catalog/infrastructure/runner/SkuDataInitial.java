package io.reactivesw.catalog.infrastructure.runner;

import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.infrastructure.utils.ZonedDatetimeUtils;

import java.math.BigDecimal;

/**
 * sku data initial.
 * Created by Davis on 16/9/23.
 */
public final class SkuDataInitial {
  /**
   * private constructor.
   */
  private SkuDataInitial() {
  }

  /**
   * initial sku.
   *
   * @return Sku
   */
  public static Sku initialSku() {
    final Sku defaultSku = new Sku();

    defaultSku.setSkuNumber("feature-sku");
    defaultSku.setActive(true);
    defaultSku.setQuantity(10086);
    defaultSku.setUpc("6926032345114");
    defaultSku.setDisplayOrder(0);
    defaultSku.setPrice(new BigDecimal("19.99"));
    defaultSku.setCreatedTime(ZonedDatetimeUtils.getZonedDatetimeNow());
    defaultSku.setModifiedTime(ZonedDatetimeUtils.getZonedDatetimeNow());

    return defaultSku;
  }
}
