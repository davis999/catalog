package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Attribute;
import io.reactivesw.catalog.domain.entity.AttributeValue;
import io.reactivesw.catalog.grpc.GrpcAttribute;

/**
 * this is transfer class for Vttribute and AttributeValue.
 * 
 * @author Davis
 *
 */
public final class AttributeMapper {
  /**
   * private constructor.
   */
  private AttributeMapper() {}

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
    builder.setDescription(attribute.getDescription());
    builder.setValue(attributeValue.getValue());
    builder.setType(attribute.getType());
    builder.setDisplayOrder(attribute.getDisplayOrder());

    return builder.build();
  }
}
