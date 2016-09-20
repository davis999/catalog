package io.reactivesw.catalog.dto

import io.reactivesw.catalog.dto.VariantValueTransfer;
import io.reactivesw.catalog.domain.Variant
import io.reactivesw.catalog.domain.VariantValue
import io.reactivesw.catalog.infrastructure.GrpcVariantValue

import spock.lang.Specification

class VariantValueTransferTest extends Specification {
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
    VariantValueTransfer variantValueTransfer = new VariantValueTransfer();
    GrpcVariantValue grpcVariantValue = VariantValueTransfer.transferToVariantValue(variantValue);
    then:
    grpcVariantValue.getId() == variantValue.getId();
    grpcVariantValue.getValue() == variantValue.getValue();
    grpcVariantValue.getPriceAdjustment() == variantValue.getPriceAdjustment().toString();
  }
}
