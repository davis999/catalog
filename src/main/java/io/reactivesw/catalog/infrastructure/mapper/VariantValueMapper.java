package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.grpc.GrpcVariantValue;

import io.reactivesw.catalog.infrastructure.dto.VariantValueDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * this is transfer class for VariantValue.
 *
 * @author Davis
 */
public final class VariantValueMapper {
  /**
   * modelmapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructor.
   */
  private VariantValueMapper() {
  }

  /**
   * transfer set of VariantValue to list of GrpcVariantValue
   * @param variantValues set of VariantValue
   * @return list of GrpcVariantValue
   */
  public static List<GrpcVariantValue> transferToVariantValueList(Set<VariantValue> variantValues) {
    List<GrpcVariantValue> grpcVariantValues = new ArrayList<>();
    for (VariantValue variantValue : variantValues) {
      grpcVariantValues.add(transferToVariantValue(variantValue));
    }
    return grpcVariantValues;
  }

  /**
   * transfer VariantValue to GrpcVariantValue.
   *
   * @param variantValue variant value
   * @return GrpcVariantValue
   */
  public static GrpcVariantValue transferToVariantValue(VariantValue variantValue) {
//    final GrpcVariantValue.Builder builder =
//        modelMapper.map(variantValue, GrpcVariantValue.Builder.class);
//    return builder.build();
    GrpcVariantValue.Builder builder = GrpcVariantValue.newBuilder();
    builder.setId(variantValue.getId());
    builder.setValue(variantValue.getValue());
    builder.setDisplayOrder(variantValue.getDisplayOrder());
    return builder.build();
  }

  /**
   * transfer list of VariantValueDTO to list of GrpcVariantValue
   *
   * @param variantValues list of VariantValueDTO
   * @return list of GrpcVariantValue
   */
  public static List<GrpcVariantValue> transferToGrpcVariantValueList(List<VariantValueDTO>
                                                                          variantValues) {
    List<GrpcVariantValue> grpcVariantValues = new ArrayList<>();
    for (VariantValueDTO variantValue : variantValues) {
      grpcVariantValues.add(transferToGrpcVariantValue(variantValue));
    }
    return grpcVariantValues;
  }

  /**
   * transfer VariantValueDTO to GrpcVariantValue
   *
   * @param variantValue VariantValueDTO
   * @return GrpcVariantValue
   */
  public static GrpcVariantValue transferToGrpcVariantValue(VariantValueDTO variantValue) {
    final GrpcVariantValue.Builder builder = modelMapper.map(variantValue, GrpcVariantValue
        .Builder.class);
    return builder.build();
  }
}
