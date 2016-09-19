package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.infrastructure.GrpcMedia;

import org.modelmapper.ModelMapper;

/**
 * this is transfer class for Media.
 * 
 * @author Davis
 *
 */
public final class MediaTransfer {

  /**
   * private constructor.
   */
  private MediaTransfer() {
    
  }

  /**
   * transfer Media to GrpcMedia.
   * 
   * @param media media
   * @return GrpcMedia
   */
  public static GrpcMedia transferToMediaInfo(Media media) {
    final ModelMapper modelMapper = new ModelMapper();
    final GrpcMedia.Builder builder = modelMapper.map(media, GrpcMedia.Builder.class);
    return builder.build();
  }
}
