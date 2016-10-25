package io.reactivesw.catalog.infrastructure.dto;

/**
 * DTO for attribute.
 * Created by Davis on 16/10/25.
 */
public class AttributeDTO {
  /**
   * id for attribute.
   */
  private long id;

  /**
   * name for attribute.
   */
  private String name;

  /**
   * value for attribute.
   */
  private String value;

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
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets value.
   *
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets value.
   *
   * @param value the value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * toString method.
   * @return String
   */
  @Override
  public String toString() {
    return "AttributeDTO{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", value='" + value + '\'' +
        '}';
  }
}
