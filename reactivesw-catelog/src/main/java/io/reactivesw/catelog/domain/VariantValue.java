package io.reactivesw.catelog.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * this is entity class for variant value.
 * 
 * @author Davis
 *
 */
@Entity
@Table(name = "sw_variant_value")
public class VariantValue implements Serializable {

  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = 3645345257179119693L;

  /**
   * id for variant value. auto generated by database.
   */
  @Id
  @Column(name = "variant_value_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * value for variant.
   */
  @Column(name = "variant_value", nullable = false, length = 255)
  private String value;

  /**
   * display order for variant value.
   */
  @Column(name = "display_order")
  private int displayOrder;

  /**
   * price adjustment for variant value.
   */
  @Column(name = "PRICE_ADJUSTMENT", precision = 19, scale = 5)
  private BigDecimal priceAdjustment;

  /**
   * variant for variant value.
   */
  @ManyToOne(targetEntity = Variant.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "variant_id")
  protected Variant variant;

  /**
   * create time for variant value.
   */
  @Column(name = "create_time")
  private Date createTime;

  /**
   * lst modified time for variant value.
   */
  @Column(name = "last_modified_time")
  private Date lastModifiedTime;

  /**
   * get id.
   * 
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * set id.
   * 
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * get value.
   * 
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * set value.
   * 
   * @param value the value to set
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * get displayOrder.
   * 
   * @return the displayOrder
   */
  public int getDisplayOrder() {
    return displayOrder;
  }

  /**
   * set displayOrder.
   * 
   * @param displayOrder the displayOrder to set
   */
  public void setDisplayOrder(int displayOrder) {
    this.displayOrder = displayOrder;
  }

  /**
   * get priceAdjustment.
   * 
   * @return the priceAdjustment
   */
  public BigDecimal getPriceAdjustment() {
    return priceAdjustment;
  }

  /**
   * set priceAdjustment.
   * 
   * @param priceAdjustment the priceAdjustment to set
   */
  public void setPriceAdjustment(BigDecimal priceAdjustment) {
    this.priceAdjustment = priceAdjustment;
  }

  /**
   * get variant.
   * 
   * @return the variant
   */
  public Variant getVariant() {
    return variant;
  }

  /**
   * set variant.
   * 
   * @param variant the variant to set
   */
  public void setVariant(Variant variant) {
    this.variant = variant;
  }

  /**
   * get createTime.
   * 
   * @return the createTime
   */
  public Date getCreateTime() {
    return new Date(createTime.getTime());
  }

  /**
   * set createTime.
   * 
   * @param createTime the createTime to set
   */
  public void setCreateTime(Date createTime) {
    this.createTime = new Date(createTime.getTime());
  }

  /**
   * get lastModifiedTime.
   * 
   * @return the lastModifiedTime
   */
  public Date getLastModifiedTime() {
    return new Date(lastModifiedTime.getTime());
  }

  /**
   * set lastModifiedTime.
   * 
   * @param lastModifiedTime the lastModifiedTime to set
   */
  public void setLastModifiedTime(Date lastModifiedTime) {
    this.lastModifiedTime = new Date(lastModifiedTime.getTime());
  }

  /**
   * hashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, value, displayOrder, priceAdjustment);
  }

  /**
   * equals.
   */
  @Override
  public boolean equals(Object obj) {
    boolean equalsResult = false;
    if (this == obj) {
      equalsResult = true;
    } else if (obj instanceof VariantValue) {
      final VariantValue other = (VariantValue) obj;
      equalsResult = Objects.equals(id, other.id) && Objects.equals(value, other.value)
          && Objects.equals(displayOrder, other.displayOrder)
          && Objects.equals(priceAdjustment, other.priceAdjustment);
    }
    return equalsResult;
  }


}
