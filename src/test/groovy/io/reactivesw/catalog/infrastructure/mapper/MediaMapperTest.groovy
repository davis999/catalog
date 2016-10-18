package io.reactivesw.catalog.infrastructure.mapper

import io.reactivesw.catalog.domain.entity.Media
import io.reactivesw.catalog.grpc.GrpcMedia;

import spock.lang.Specification

class MediaMapperTest extends Specification{
  Media media = null;
  
  def setup(){
    media = new Media();
    media.setId(1L);
    media.setTitle("product main");
    media.setType("main");
    media.setUrl("/usr/product/0001/0001.jpg");
  } 
  
  def "test transfer to GrpcMedia"(){
    when:
    MediaMapper mediaTransfer = new MediaMapper();
    GrpcMedia grpcMedia = MediaMapper.transferToMediaInfo(media);
    then:
    grpcMedia.getId() == media.getId();
    grpcMedia.getType() == media.getType();
    grpcMedia.getUrl() == media.getUrl();
    grpcMedia.getTitle() == media.getTitle();
  }
}
