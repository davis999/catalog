package io.reactivesw.catalog.infrastructure.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * dto for sku detail.
 * Created by Davis on 16/10/25.
 */
public class SkuDetailDTO {
  /**
   * id for sku.
   */
  private long id;

  /**
   * manufacturer for sku.
   */
  private String manufacturer;

  /**
   * brand for sku.
   */
  private String brand;

  /**
   * model for sku.
   */
  private String model;

  /**
   * name for sku.
   */
  private String name;

  /**
   * price for sku.
   */
  private String price;

  /**
   * description for sku.
   */
  private String description;

  /**
   * detail for sku.
   */
  private String detail;

  /**
   * is active for sku.
   */
  private boolean actived;

  /**
   * feature for sku.
   */
  private List<FeatureDTO> features;

  /**
   * attribute for sku.
   */
  private List<AttributeDTO> attributes;

  /**
   * variant for sku.
   */
  private List<VariantDTO> variants;

  /**
   * media for sku.
   */
  private List<MediaDTO> medias;

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
   * Gets manufacturer.
   *
   * @return the manufacturer
   */
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * Sets manufacturer.
   *
   * @param manufacturer the manufacturer
   */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * Gets brand.
   *
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Sets brand.
   *
   * @param brand the brand
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Gets model.
   *
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * Sets model.
   *
   * @param model the model
   */
  public void setModel(String model) {
    this.model = model;
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
   * Gets price.
   *
   * @return the price
   */
  public String getPrice() {
    return price;
  }

  /**
   * Sets price.
   *
   * @param price the price
   */
  public void setPrice(String price) {
    this.price = price;
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
   * Gets detail.
   *
   * @return the detail
   */
  public String getDetail() {
    return detail;
  }

  /**
   * Sets detail.
   *
   * @param detail the detail
   */
  public void setDetail(String detail) {
    this.detail = detail;
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
   * Gets features.
   *
   * @return the features
   */
  public List<FeatureDTO> getFeatures() {
    return features;
  }

  /**
   * Sets features.
   *
   * @param features the features
   */
  public void setFeatures(List<FeatureDTO> features) {
    this.features = features;
  }

  /**
   * Gets attributes.
   *
   * @return the attributes
   */
  public List<AttributeDTO> getAttributes() {
    return attributes;
  }

  /**
   * Sets attributes.
   *
   * @param attributes the attributes
   */
  public void setAttributes(List<AttributeDTO> attributes) {
    this.attributes = attributes;
  }

  /**
   * Gets variants.
   *
   * @return the variants
   */
  public List<VariantDTO> getVariants() {
    return variants;
  }

  /**
   * Sets variants.
   *
   * @param variants the variants
   */
  public void setVariants(List<VariantDTO> variants) {
    this.variants = variants;
  }

  /**
   * Gets medias.
   *
   * @return the medias
   */
  public List<MediaDTO> getMedias() {
    return medias;
  }

  /**
   * Sets medias.
   *
   * @param medias the medias
   */
  public void setMedias(List<MediaDTO> medias) {
    this.medias = medias;
  }

  /**
   * add feature.
   * @param feature feature
   */
  public void addFeature(FeatureDTO feature){
    if (features == null){
      features = new ArrayList<>();
    }
    features.add(feature);
  }

  /**
   * add attribute.
   * @param attribute attribute
   */
  public void addAttribute(AttributeDTO attribute){
    if (attributes == null) {
      attributes = new ArrayList<>();
    }
    attributes.add(attribute);
  }

  /**
   * add variant.
   * @param variant vairnat.
   */
  public void addVariant(VariantDTO variant) {
    if (variants == null) {
      variants = new ArrayList<>();
    }
    variants.add(variant);
  }

  /**
   * add media.
   * @param media media
   */
  public void addMedia(MediaDTO media) {
    if (medias == null) {
      medias = new ArrayList<>();
    }
    medias.add(media);
  }

  /**
   * toString method.
   * @return String
   */
  @Override
  public String toString() {
    return "SkuDetailDTO{" +
        "id=" + id +
        ", manufacturer='" + manufacturer + '\'' +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", name='" + name + '\'' +
        ", price='" + price + '\'' +
        ", description='" + description + '\'' +
        ", detail='" + detail + '\'' +
        ", actived=" + actived +
        ", features=" + features +
        ", attributes=" + attributes +
        ", variants=" + variants +
        ", medias=" + medias +
        '}';
  }
}
