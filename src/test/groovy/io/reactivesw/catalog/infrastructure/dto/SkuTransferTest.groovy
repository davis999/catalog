package io.reactivesw.catalog.infrastructure.dto

import io.reactivesw.catalog.domain.entity.Media
import io.reactivesw.catalog.domain.entity.Sku
import io.reactivesw.catalog.domain.entity.Variant
import io.reactivesw.catalog.domain.entity.VariantValue
import io.reactivesw.catalog.grpc.GrpcSku
import io.reactivesw.catalog.grpc.SkuInformation;
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

  def "test transfer to SkuInformation"(){
    when:
    SkuInformation skuInformation = SkuTransfer.transferToSkuInformation(sku)
    then:
    skuInformation.getSkuId() == sku.getId()
    skuInformation.getMediaUrl() == sku.getMedias().getAt(0).getUrl()
    skuInformation.getPrice() == sku.getPrice().toString()
  }
}
