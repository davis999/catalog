package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.VariantValue;
import io.reactivesw.catelog.infrastructure.GrpcVariantValue;

import org.modelmapper.ModelMapper;

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
    final ModelMapper modelMapper = new ModelMapper();
    final GrpcVariantValue.Builder builder =
        modelMapper.map(variantValue, GrpcVariantValue.Builder.class);
    return builder.build();
  }
}
