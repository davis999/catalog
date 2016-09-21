package io.reactivesw.catalog.infrastructure.dto

import io.reactivesw.catalog.domain.entity.Attribute
import io.reactivesw.catalog.domain.entity.AttributeValue
import io.reactivesw.catalog.grpc.GrpcAttribute;

import spock.lang.Specification

class AttributeTransferTest extends Specification{
  Attribute attribute = null;
  AttributeValue attributeValue = null;

  def setup(){
    attribute = new Attribute();
    attribute.setId(10010L);
    attribute.setName("product attribute");
    attribute.setDescription("this is product attribute");
    attribute.setDisplayOrder(101);
    attribute.setType("String");

    attributeValue = new AttributeValue();
    attributeValue.setId(10000L);
    attributeValue.setValue("the true value of attribute");
    attributeValue.setAttribute(attribute);
  }

  def "test transfer to GrpcAttribute"(){
    when:
    AttributeTransfer attributeTransfer = new AttributeTransfer();
    GrpcAttribute grpcAttribute = AttributeTransfer.transferToAttributeInfo(attributeValue);
    then:
    grpcAttribute.getId() == attributeValue.getId();
    grpcAttribute.getName() == attribute.getName();
    grpcAttribute.getDescription() == attribute.getDescription();
    grpcAttribute.getDisplayOrder() == attribute.getDisplayOrder();
    grpcAttribute.getValue() == attributeValue.getValue();
    grpcAttribute.getType() == attribute.getType();
  }
}
