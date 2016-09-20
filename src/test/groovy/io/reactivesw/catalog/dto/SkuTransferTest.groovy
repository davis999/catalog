package io.reactivesw.catalog.dto

import io.reactivesw.catalog.dto.SkuTransfer;
import io.reactivesw.catalog.domain.Media
import io.reactivesw.catalog.domain.Sku
import io.reactivesw.catalog.domain.Variant
import io.reactivesw.catalog.domain.VariantValue
import io.reactivesw.catalog.infrastructure.GrpcSku;

import spock.lang.Specification

class SkuTransferTest extends Specification{
  Sku sku = null;
  Media media = null;
  VariantValue variantValue = null;
  
  def setup(){
    sku = new Sku();
    sku.setId(1L);
    sku.setPrice(new BigDecimal(19.99));
    sku.setSkuNumber("sku number");
    sku.setUpc("sku upc");
    
    media = new Media();
    media.setUrl("/usr/product/0001/0001.jpg");
    media.setTitle("product main");
    media.setType("main");
    
    Set<Media> medias = new HashSet<Media>();
    medias.add(media);
    sku.setMedias(medias);
    
    variantValue = new VariantValue();
    variantValue.setId(1L);
    variantValue.setPriceAdjustment(new BigDecimal(1));
    variantValue.setValue("BLUE");
    variantValue.setVariant(new Variant());
    
    Set<VariantValue> variantValues = new HashSet<VariantValue>();
    variantValues.add(variantValue);
    sku.setVariantValues(variantValues);
  } 
  
  def "test transfer to GrpcSku"(){
    when:
    SkuTransfer skuTransfer = new SkuTransfer();
    GrpcSku grpcSku = SkuTransfer.transferToGrpcSku(sku);
    then:
    grpcSku.getId() == sku.getId();
    grpcSku.getUpc() == sku.getUpc();
    grpcSku.getMediaCount() == sku.getMedias().size();
    grpcSku.getVariantValueCount() == sku.getVariantValues().size();
  }
}
