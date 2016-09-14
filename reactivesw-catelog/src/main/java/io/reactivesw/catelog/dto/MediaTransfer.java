package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.grpc.infrastructure.MediaInfo;

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
   * transfer Media to MediaInfo.
   * 
   * @param media media
   * @return MediaInfo
   */
  public static MediaInfo transferToMediaInfo(Media media) {
    final MediaInfo.Builder builder = MediaInfo.newBuilder();

    builder.setId(media.getId());
    builder.setType(media.getType());
    builder.setTitle(media.getTitle());
    builder.setUrl(media.getUrl());
    builder.setDisplayOrder(media.getDisplayOrder());

    return builder.build();
  }
}
