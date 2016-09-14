package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Attribute;
import io.reactivesw.catelog.domain.AttributeValue;
import io.reactivesw.catelog.infrastructure.AttributeInfo;

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
   * transfer AttributeValue to AttributeInfo.
   * 
   * @param attributeValue AttributeValue
   * @return AttributeInfo
   */
  public static AttributeInfo transferToAttributeInfo(AttributeValue attributeValue) {
    final AttributeInfo.Builder builder = AttributeInfo.newBuilder();

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
