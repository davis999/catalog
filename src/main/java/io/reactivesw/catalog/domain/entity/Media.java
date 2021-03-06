package io.reactivesw.catalog.domain.entity;

import com.google.common.base.Objects;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * this is the entity class for media.
 *
 * @author Davis
 */
@Entity
@Table(name = "sw_media")
public class Media implements Serializable {

  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = 6073264883810050661L;

  /**
   * id for media. auto generated by database.
   */
  @Id
  @Column(name = "media_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * type for media. max length is 16, not null. amazon media type.
   */
  @Size(max = 16)
  @Column(name = "type", length = 16, nullable = false)
  private String type;

  /**
   * title for media.
   */
  @Size(max = 64)
  @Column(name = "title", length = 64, nullable = false)
  private String title;

  /**
   * url for media.
   */
  @Size(max = 1024)
  @Column(name = "url", length = 1024, nullable = false)
  private String url;

  /**
   * display order for media.
   */
  @Column(name = "display_order")
  private int displayOrder;

  /**
   * create time.
   */
  @Column(name = "created_time")
  private ZonedDateTime createdTime;

  /**
   * last modified time.
   */
  @Column(name = "modified_time")
  private ZonedDateTime modifiedTime;

  /**
   * get id.
   *
   * @return id
   */
  public long getId() {
    return id;
  }

  /**
   * set id.
   *
   * @param id id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * get type.
   *
   * @return type.
   */
  public String getType() {
    return type;
  }

  /**
   * set type.
   *
   * @param type type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * get title.
   *
   * @return title.
   */
  public String getTitle() {
    return title;
  }

  /**
   * set title.
   *
   * @param title title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * get url.
   *
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * set url.
   *
   * @param url url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * get displayOrder.
   *
   * @return displayOrder.
   */
  public int getDisplayOrder() {
    return displayOrder;
  }

  /**
   * set displayOrder.
   *
   * @param displayOrder displayOrder
   */
  public void setDisplayOrder(int displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * get create time.
   *
   * @return create time.
   */
  public ZonedDateTime getCreatedTime() {
    return createdTime;
  }

  /**
   * set create time.
   *
   * @param createdTime create time.
   */
  public void setCreatedTime(ZonedDateTime createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * get last modified time.
   *
   * @return modifiedTime.
   */
  public ZonedDateTime getModifiedTime() {
    return modifiedTime;
  }

  /**
   * set last modified time.
   *
   * @param modifiedTime last modified time.
   */
  public void setModifiedTime(ZonedDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  /**
   * hashCode.
   *
   * @return int hashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hashCode(id, type, url, displayOrder);
  }

  /**
   * equals.
   *
   * @param obj other Object
   * @return boolean
   */
  @Override
  public boolean equals(Object obj) {
    boolean equalsResult = false;
    if (this == obj) {
      equalsResult = true;
    } else if (obj instanceof Media) {
      final Media other = (Media) obj;
      equalsResult = Objects.equal(id, other.id) && Objects.equal(type, other.type)
          && Objects.equal(url, other.url) && Objects.equal(displayOrder, other.displayOrder);
    }
    return equalsResult;
  }
}
