package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Feature;
import io.reactivesw.catelog.grpc.infrastructure.FeatureInfo;

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
   * transfer Feature to FeatureInfo.
   * 
   * @param feature feature
   * @return FeatureInfo
   */
  public static FeatureInfo transferToFeatureInfo(Feature feature) {
    final FeatureInfo.Builder builder = FeatureInfo.newBuilder();

    builder.setId(feature.getId());
    builder.setName(feature.getName());
    builder.setDescription(feature.getDescription());
    builder.setDisplayOrder(feature.getDisplayOrder());

    return builder.build();
  }
}
