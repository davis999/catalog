package io.reactivesw.catelog.dto

import io.reactivesw.catelog.domain.Media
import io.reactivesw.catelog.infrastructure.GrpcMedia;

import spock.lang.Specification

class MediaTransferTest extends Specification{
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
    MediaTransfer mediaTransfer = new MediaTransfer();
    GrpcMedia grpcMedia = MediaTransfer.transferToMediaInfo(media);
    then:
    grpcMedia.getId() == media.getId();
    grpcMedia.getType() == media.getType();
    grpcMedia.getUrl() == media.getUrl();
    grpcMedia.getTitle() == media.getTitle();
  }
}
