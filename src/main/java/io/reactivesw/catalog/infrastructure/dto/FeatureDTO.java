package io.reactivesw.catalog.infrastructure.dto;

/**
 * feature dto.
 * Created by Davis on 16/10/25.
 */
public class FeatureDTO {
  /**
   * id for feature.
   */
  private long id;

  /**
   * description for feature.
   */
  private String description;

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
   * Gets description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets description.
   *
   * @param description the description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * toString method.
   * @return String
   */
  @Override
  public String toString() {
    return "FeatureDTO{" +
        "id=" + id +
        ", description='" + description + '\'' +
        '}';
  }
}
