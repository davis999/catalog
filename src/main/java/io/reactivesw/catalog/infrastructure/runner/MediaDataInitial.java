package io.reactivesw.catalog.infrastructure.runner;

import io.reactivesw.catalog.domain.entity.Media;

/**
 * media data initial.
 * Created by Davis on 16/9/23.
 */
public final class MediaDataInitial {

  /**
   * private constructor.
   */
  private MediaDataInitial() {
  }

  /**
   * initial media.
   *
   * @return Media.
   */
  public static Media initialMedia() {
    final Media media = new Media();

    media.setTitle("media title");
    media.setType("main");
    media.setUrl("/sku/0001/main-0001.jpg");
    media.setDisplayOrder(0);

    return media;
  }
}
