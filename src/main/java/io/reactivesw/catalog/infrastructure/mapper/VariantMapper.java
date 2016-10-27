package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Variant;
import io.reactivesw.catalog.grpc.GrpcVariant;
import io.reactivesw.catalog.infrastructure.dto.VariantDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Mapper for Variant.
 * Created by Davis on 16/10/25.
 */
public final class VariantMapper {
  /**
   * modelmapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructor.
   */
  private VariantMapper() {
  }

  /**
   * transfer list of VariantDTO to list of GrpcVariant.
   *
   * @param variants list of VariantDTO
   * @return list of GrpcVariant
   */
  public static List<GrpcVariant> transferToGrpcVariantList(List<VariantDTO> variants) {
    List<GrpcVariant> grpcVariants = new ArrayList<>();
    for (VariantDTO variant : variants) {
      grpcVariants.add(transferToGrpcVariant(variant));
    }
    return grpcVariants;
  }

  /**
   * transfer VariantDTO to GrpcVariant.
   *
   * @param variant VariantDTO
   * @return GrpcVariant
   */
  public static GrpcVariant transferToGrpcVariant(VariantDTO variant) {
    final GrpcVariant.Builder builder = modelMapper.map(variant, GrpcVariant.Builder.class);
    builder.addAllVariantValue(VariantValueMapper.transferToGrpcVariantValueList(variant
        .getVariantValues()));
    return builder.build();
  }

  /**
   * transfer set of Variant to list of GrpcVariant.
   * @param variants set of Variant
   * @return list of GrpcVariant
   */
  public static List<GrpcVariant> transferToGrpcVariantList(Set<Variant> variants) {
    List<GrpcVariant> grpcVariants = new ArrayList<>();
    for (Variant variant : variants) {
      grpcVariants.add(transferToGrpcVariant(variant));
    }
    return grpcVariants;
  }

  /**
   * transfer Variant to GrpcVaraint.
   * @param variant Varaint
   * @return GrpcVaraint
   */
  public static GrpcVariant transferToGrpcVariant(Variant variant) {
    final GrpcVariant.Builder builder = modelMapper.map(variant, GrpcVariant.Builder.class);
    builder.addAllVariantValue(VariantValueMapper.transferToVariantValueList(variant
        .getVariantValues()));
    return builder.build();
  }
}
