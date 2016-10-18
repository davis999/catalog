package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.grpc.GrpcVariantValue;

import org.modelmapper.ModelMapper;

/**
 * this is transfer class for VariantValue.
 * 
 * @author Davis
 *
 */
public final class VariantValueMapper {

  /**
   * private constructor.
   */
  private VariantValueMapper() {}

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
