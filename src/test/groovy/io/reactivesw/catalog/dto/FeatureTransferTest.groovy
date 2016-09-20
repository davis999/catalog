package io.reactivesw.catalog.dto

import io.reactivesw.catalog.dto.FeatureTransfer;
import io.reactivesw.catalog.domain.Feature
import io.reactivesw.catalog.infrastructure.GrpcFeature;

import spock.lang.Specification

class FeatureTransferTest extends Specification{
  Feature feature = null;
  
  def setup(){
    feature = new Feature();
    feature.setId(10086L);
    feature.setDisplayOrder(11);
    feature.setName("feature for product");
    feature.setDescription("this is product feature");
  }
  
  def "test transfer to GrpcFeature"(){
    when:
    FeatureTransfer featureTransfer = new FeatureTransfer();
    GrpcFeature grpcFeature = FeatureTransfer.transferToFeatureInfo(feature);
    
    then:
    grpcFeature.getId() == feature.getId();
    grpcFeature.getName() == feature.getName();
    grpcFeature.getDisplayOrder() == feature.getDisplayOrder();
    grpcFeature.getDescription() == feature.getDescription(); 
  }
}
