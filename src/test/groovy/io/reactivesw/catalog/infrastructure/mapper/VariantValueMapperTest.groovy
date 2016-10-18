package io.reactivesw.catalog.infrastructure.mapper

import io.reactivesw.catalog.domain.entity.Variant
import io.reactivesw.catalog.domain.entity.VariantValue
import io.reactivesw.catalog.grpc.GrpcVariantValue

import spock.lang.Specification

class VariantValueMapperTest extends Specification {
  VariantValue variantValue = null;
  Variant variant = null;
  
  def setup(){
    variant = new Variant();
    variant.setId(2L);
    variant.setVariantName("COLOR");
    
    variantValue = new VariantValue();
    variantValue.setId(1L);
    variantValue.setPriceAdjustment(new BigDecimal(1.9));
    variantValue.setValue("BLUE");
    variantValue.setVariant(variant);
  }
  
  def "test transfer to GrpcVariantValue"(){
    when:
    VariantValueMapper variantValueTransfer = new VariantValueMapper();
    GrpcVariantValue grpcVariantValue = VariantValueMapper.transferToVariantValue(variantValue);
    then:
    grpcVariantValue.getId() == variantValue.getId();
    grpcVariantValue.getValue() == variantValue.getValue();
    grpcVariantValue.getPriceAdjustment() == variantValue.getPriceAdjustment().toString();
  }
}
