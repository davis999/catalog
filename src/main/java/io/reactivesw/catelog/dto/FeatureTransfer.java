package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Feature;
import io.reactivesw.catelog.infrastructure.GrpcFeature;

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
    final GrpcFeature.Builder builder = GrpcFeature.newBuilder();

    builder.setId(feature.getId());
    builder.setName(feature.getName());
    builder.setDescription(feature.getDescription());
    builder.setDisplayOrder(feature.getDisplayOrder());

    return builder.build();
  }
}
