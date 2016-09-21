package io.reactivesw.catalog.infrastructure.dto;

import io.reactivesw.catalog.domain.entity.Feature;
import io.reactivesw.catalog.grpc.GrpcFeature;

import org.modelmapper.ModelMapper;

/**
 * this is transfer class for feature.
 * 
 * @author Davis
 *
 */
public final class FeatureTransfer {

  /**
   * private constructor.
   */
  private FeatureTransfer() {}

  /**
   * transfer Feature to GrpcFeature.
   * 
   * @param feature feature
   * @return GrpcFeature
   */
  public static GrpcFeature transferToFeatureInfo(Feature feature) {
    final ModelMapper modelMapper = new ModelMapper();
    final GrpcFeature.Builder builder = modelMapper.map(feature, GrpcFeature.Builder.class);
    return builder.build();
  }
}
