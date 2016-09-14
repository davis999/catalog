package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.VariantValue;
import io.reactivesw.catelog.infrastructure.GrpcVariantValue;

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
   * transfer VariantValue to GrpcVariantValue.
   * 
   * @param variantValue variant value
   * @return GrpcVariantValue
   */
  public static GrpcVariantValue transferToVariantValue(VariantValue variantValue) {
    final GrpcVariantValue.Builder builder = GrpcVariantValue.newBuilder();

    builder.setId(variantValue.getId());
    builder.setValue(variantValue.getValue());
    builder.setDisplayOrder(variantValue.getDisplayOrder());
    builder.setPriceAdjustment(variantValue.getPriceAdjustment().toString());

    return builder.build();
  }
}
