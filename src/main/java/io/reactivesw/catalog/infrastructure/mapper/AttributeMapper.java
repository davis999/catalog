package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Attribute;
import io.reactivesw.catalog.domain.entity.AttributeValue;
import io.reactivesw.catalog.grpc.GrpcAttribute;
import io.reactivesw.catalog.infrastructure.dto.AttributeDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * this is transfer class for Vttribute and AttributeValue.
 *
 * @author Davis
 */
public final class AttributeMapper {
  /**
   * ModelMapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructor.
   */
  private AttributeMapper() {
  }

  /**
   * transfer set of AttributeValue to list of GrpcAttribute.
   * @param attributeValues set of AttributeValue
   * @return list of GrpcAttribute
   */
  public static List<GrpcAttribute> transferToGrpcAttributeList(Set<AttributeValue> attributeValues){
    List<GrpcAttribute> grpcAttributes = new ArrayList<>();
    for (AttributeValue attributeValue : attributeValues) {
      grpcAttributes.add(transferToAttributeInfo(attributeValue));
    }
    return grpcAttributes;
  }

  /**
   * transfer AttributeValue to GrpcAttribute.
   *
   * @param attributeValue AttributeValue
   * @return GrpcAttribute
   */
  public static GrpcAttribute transferToAttributeInfo(AttributeValue attributeValue) {
    final GrpcAttribute.Builder builder = GrpcAttribute.newBuilder();

    final Attribute attribute = attributeValue.getAttribute();

    builder.setId(attributeValue.getId());
    builder.setName(attribute.getName());
    builder.setValue(attributeValue.getValue());

    return builder.build();
  }

  /**
   * transfer list of AttributeDTO to list of GrpcAttribute.
   *
   * @param attributes list of AttributeDto
   * @return list of GrpcAttribute
   */
  public static List<GrpcAttribute> transferToGrpcAttributeList(List<AttributeDTO> attributes) {
    List<GrpcAttribute> grpcAttributes = new ArrayList<>();
    for (AttributeDTO attribute :
        attributes) {
      grpcAttributes.add(transferToGrpcAttribute(attribute));
    }
    return grpcAttributes;
  }

  /**
   * transfer AttributeDTO to GrpcAttribute.
   *
   * @param attribute AttributeDTO
   * @return GrpcAttribute
   */
  public static GrpcAttribute transferToGrpcAttribute(AttributeDTO attribute) {
    GrpcAttribute.Builder builder = modelMapper.map(attribute, GrpcAttribute.Builder.class);
    return builder.build();
  }
}
