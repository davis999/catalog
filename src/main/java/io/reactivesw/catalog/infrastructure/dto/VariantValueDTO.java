package io.reactivesw.catalog.infrastructure.dto;

/**
 * Created by Davis on 16/10/25.
 */
public class VariantValueDTO {
  /**
   * id for variant value.
   */
  private long id;

  /**
   * value for variant value.
   */
  private String value;

  /**
   * is actived for varaint value.
   */
  private boolean actived;

  /**
   * display order for variant value.
   */
  private int displayOrder;

  /**
   * sku number for variant value.
   */
  private String skuNumber;

  /**
   * selected for variant value.
   */
  private boolean selected;

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
   * Is actived boolean.
   *
   * @return the boolean
   */
  public boolean isActived() {
    return actived;
  }

  /**
   * Sets actived.
   *
   * @param actived the actived
   */
  public void setActived(boolean actived) {
    this.actived = actived;
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
   * Gets sku number.
   *
   * @return the sku number
   */
  public String getSkuNumber() {
    return skuNumber;
  }

  /**
   * Sets sku number.
   *
   * @param skuNumber the sku number
   */
  public void setSkuNumber(String skuNumber) {
    this.skuNumber = skuNumber;
  }

  /**
   * Is selected boolean.
   *
   * @return the boolean
   */
  public boolean isSelected() {
    return selected;
  }

  /**
   * Sets selected.
   *
   * @param selected the selected
   */
  public void setSelected(boolean selected) {
    this.selected = selected;
  }

  /**
   * toString method.
   * @return String
   */
  @Override
  public String toString() {
    return "VariantValueDTO{" +
        "id=" + id +
        ", value='" + value + '\'' +
        ", actived=" + actived +
        ", displayOrder=" + displayOrder +
        ", skuNumber='" + skuNumber + '\'' +
        ", selected=" + selected +
        '}';
  }
}
