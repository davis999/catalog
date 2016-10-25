package io.reactivesw.catalog.infrastructure.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * DTO for variant.
 * Created by Davis on 16/10/25.
 */
public class VariantDTO {
  /**
   * id for variant.
   */
  private long id;

  /**
   * name for variant.
   */
  private String name;

  /**
   * display order for variant.
   */
  private int displayOrder;

  /**
   * variant value for variant.
   */
  private List<VariantValueDTO> variantValues;

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
   * Gets variant values.
   *
   * @return the variant values
   */
  public List<VariantValueDTO> getVariantValues() {
    return variantValues;
  }

  /**
   * Sets variant values.
   *
   * @param variantValues the variant values
   */
  public void setVariantValues(List<VariantValueDTO> variantValues) {
    this.variantValues = variantValues;
  }

  /**
   * add variantValue.
   * @param variantValue variantValue
   */
  public void addVariantValue(VariantValueDTO variantValue) {
    if (variantValues == null) {
      variantValues = new ArrayList<>();
    }
    variantValues.add(variantValue);
  }

  /**
   * toString method.
   * @return String
   */
  @Override
  public String toString() {
    return "VariantDTO{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", displayOrder=" + displayOrder +
        ", variantValues=" + variantValues +
        '}';
  }
}
