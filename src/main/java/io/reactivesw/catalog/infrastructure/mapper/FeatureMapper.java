package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Feature;
import io.reactivesw.catalog.grpc.GrpcFeature;

import io.reactivesw.catalog.infrastructure.dto.FeatureDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * this is transfer class for feature.
 *
 * @author Davis
 */
public final class FeatureMapper {

  /**
   * modelMapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructor.
   */
  private FeatureMapper() {
  }

  /**
   * transfer Feature to GrpcFeature.
   *
   * @param feature feature
   * @return GrpcFeature
   */
  public static GrpcFeature transferToFeatureInfo(Feature feature) {
    final GrpcFeature.Builder builder = modelMapper.map(feature, GrpcFeature.Builder.class);
    return builder.build();
  }

  /**
   * transfer List of FeatureDTO to List of GrpcFeature.
   *
   * @param features list of FeatureDTO
   * @return list of GrpcFeature
   */
  public static List<GrpcFeature> transferToGrpcFeatureList(List<FeatureDTO> features) {
    List<GrpcFeature> gRpcFeatures = new ArrayList<>();
    for (FeatureDTO feature : features) {
      gRpcFeatures.add(transferToGrpcFeature(feature));
    }
    return gRpcFeatures;
  }

  /**
   * transfer FeatureDTO to GrpcFeature.
   * @param feature FeatureDTO
   * @return GrpcFeature
   */
  public static GrpcFeature transferToGrpcFeature(FeatureDTO feature) {
    GrpcFeature.Builder builder = modelMapper.map(feature, GrpcFeature.Builder.class);
    return builder.build();
  }
}
