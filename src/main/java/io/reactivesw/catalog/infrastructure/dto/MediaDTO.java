package io.reactivesw.catalog.infrastructure.dto;

/**
 * Created by Davis on 16/10/25.
 */
public class MediaDTO {
  /**
   * id for media.
   */
  private long id;

  /**
   * type for media.
   */
  private String type;

  /**
   * title for media.
   */
  private String title;

  /**
   * url for media.
   */
  private String url;

  /**
   * display order for media.
   */
  private int displayOrder;

  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * Gets type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Sets type.
   *
   * @param type the type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Gets title.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets title.
   *
   * @param title the title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets url.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets url.
   *
   * @param url the url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Gets display order.
   *
   * @return the display order
   */
  public int getDisplayOrder() {
    return displayOrder;
  }

  /**
   * Sets display order.
   *
   * @param displayOrder the display order
   */
  public void setDisplayOrder(int displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * toString method.
   * @return String
   */
  @Override
  public String toString() {
    return "MediaDTO{" +
        "id=" + id +
        ", type='" + type + '\'' +
        ", title='" + title + '\'' +
        ", url='" + url + '\'' +
        ", displayOrder=" + displayOrder +
        '}';
  }
}
