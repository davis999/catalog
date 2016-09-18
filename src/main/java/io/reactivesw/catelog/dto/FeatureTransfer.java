package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Feature;
import io.reactivesw.catelog.infrastructure.GrpcFeature;

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
