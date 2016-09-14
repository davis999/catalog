package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.VariantValue;
import io.reactivesw.catelog.infrastructure.VariantValueInfo;

/**
 * this is transfer class for VariantValue.
 * 
 * @author Davis
 *
 */
public final class VariantValueTransfer {

  /**
   * private constructor.
   */
  private VariantValueTransfer() {}

  /**
   * transfer VariantValue to VariantValueInfo.
   * 
   * @param variantValue variant value
   * @return VariantValueInfo
   */
  public static VariantValueInfo transferToVariantValue(VariantValue variantValue) {
    final VariantValueInfo.Builder builder = VariantValueInfo.newBuilder();

    builder.setId(variantValue.getId());
    builder.setValue(variantValue.getValue());
    builder.setDisplayOrder(variantValue.getDisplayOrder());
    builder.setPriceAdjustment(variantValue.getPriceAdjustment().toString());

    return builder.build();
  }
}
