package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.infrastructure.GrpcMedia;

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
  private MediaTransfer(){}

  /**
   * transfer Media to GrpcMedia.
   * 
   * @param media media
   * @return GrpcMedia
   */
  public static GrpcMedia transferToMediaInfo(Media media) {
    final GrpcMedia.Builder builder = GrpcMedia.newBuilder();

    builder.setId(media.getId());
    builder.setType(media.getType());
    builder.setTitle(media.getTitle());
    builder.setUrl(media.getUrl());
    builder.setDisplayOrder(media.getDisplayOrder());

    return builder.build();
  }
}
