package io.reactivesw.catalog.infrastructure.mapper

import io.reactivesw.catalog.domain.entity.Feature
import io.reactivesw.catalog.grpc.GrpcFeature;

import spock.lang.Specification

class FeatureMapperTest extends Specification{
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
    FeatureMapper featureTransfer = new FeatureMapper();
    GrpcFeature grpcFeature = FeatureMapper.transferToFeatureInfo(feature);
    
    then:
    grpcFeature.getId() == feature.getId();
    grpcFeature.getName() == feature.getName();
    grpcFeature.getDisplayOrder() == feature.getDisplayOrder();
    grpcFeature.getDescription() == feature.getDescription(); 
  }
}
