package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Attribute;
import io.reactivesw.catelog.domain.AttributeValue;
import io.reactivesw.catelog.infrastructure.GrpcAttribute;

/**
 * this is transfer class for Vttribute and AttributeValue.
 * 
 * @author Davis
 *
 */
public final class AttributeTransfer {
  /**
   * private constructor.
   */
  private AttributeTransfer() {}

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
