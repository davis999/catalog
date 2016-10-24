package io.reactivesw.catalog.domain.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * this is entity class for variant.
 * 
 * @author Davis
 *
 */
@Entity
@Table(name = "sw_variant")
public class Variant implements Serializable {
  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = -2741886346091945554L;

  /**
   * id for variant.
   */
  @Id
  @Column(name = "variant_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  /**
   * name for variant.
   */
  @Column(name = "variant_name", length = 255, nullable = false)
  private String variantName;

  /**
   * display order for variant.
   */
  @Column(name = "display_order")
  private int displayOrder;

  /**
   * values for variant.
   */
  @OneToMany(mappedBy = "variant", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @OrderBy("displayOrder asc")
  private Set<VariantValue> variantValues;

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
   * get variantName.
   * 
   * @return the variantName
   */
  public String getVariantName() {
    return variantName;
  }

  /**
   * set variantName.
   * 
   * @param variantName the variantName to set
   */
  public void setVariantName(String variantName) {
    this.variantName = variantName;
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
   * get variantValues.
   * 
   * @return the variantValues
   */
  public Set<VariantValue> getVariantValues() {
    return variantValues;
  }

  /**
   * set variantValues.
   * 
   * @param variantValues the variantValues to set
   */
  public void setVariantValues(Set<VariantValue> variantValues) {
    this.variantValues = variantValues;
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
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, variantName, displayOrder);
  }

  /**
   * equals.
   */
  @Override
  public boolean equals(Object obj) {
    boolean equalsResult = false;
    if (this == obj) {
      equalsResult = true;
    } else if (obj instanceof Variant) {
      final Variant other = (Variant) obj;
      equalsResult = Objects.equals(id, other.id) && Objects.equals(variantName, other.variantName)
          && Objects.equals(displayOrder, other.displayOrder);
    }
    return equalsResult;
  }


}
