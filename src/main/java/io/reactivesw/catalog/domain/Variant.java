package io.reactivesw.catalog.domain;

import java.io.Serializable;
import java.util.Date;
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
  private Set<VariantValue> variantValues;

  /**
   * create time for variant.
   */
  @Column(name = "create_time")
  private Date createTime;

  /**
   * last modified time for variant.
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
