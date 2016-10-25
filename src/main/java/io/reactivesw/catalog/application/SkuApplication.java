package io.reactivesw.catalog.application;

import io.reactivesw.catalog.domain.entity.AttributeValue;
import io.reactivesw.catalog.domain.entity.Feature;
import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.domain.entity.Variant;
import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.domain.service.SkuService;
import io.reactivesw.catalog.infrastructure.dto.AttributeDTO;
import io.reactivesw.catalog.infrastructure.dto.FeatureDTO;
import io.reactivesw.catalog.infrastructure.dto.MediaDTO;
import io.reactivesw.catalog.infrastructure.dto.SkuDetailDTO;
import io.reactivesw.catalog.infrastructure.dto.VariantDTO;
import io.reactivesw.catalog.infrastructure.dto.VariantValueDTO;
import io.reactivesw.catalog.infrastructure.utils.DecimalFormatUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Sku Application.
 * Created by Davis on 16/10/25.
 */
@Service
public class SkuApplication {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(SkuApplication.class);

  /**
   * sku service.
   */
  @Autowired
  private transient SkuService skuService;


  /**
   * Gets sku detail by number.
   *
   * @param skuNumber the sku number
   * @return the sku detail by number
   */
  public SkuDetailDTO getSkuDetailByNumber(String skuNumber) {
    LOG.debug("enter getSkuDetailByNumber, sku number is {}.", skuNumber);
    Sku sku = skuService.querySkuByNumber(skuNumber);
    return transferSkuToDTO(sku);
  }

  /**
   * TODO refactor
   * transfer Sku to GrpcSkuDetail.
   *
   * @param sku
   * @return
   */
  private SkuDetailDTO transferSkuToDTO(Sku sku) {
    LOG.debug("enter transferSkuToDTO, sku is {}.", sku.toString());

    final boolean isDefaultSku = isDefaultSku(sku);
    final Product product = getProduckBySku(sku, isDefaultSku);

    SkuDetailDTO skuDetailDTO = setGeneralInformationToDTO(sku, product, isDefaultSku);

    if (product.getFeatures() != null) {
      for (final Feature feature : product.getFeatures()) {
        skuDetailDTO.addFeature(transferToFeatureDTO(feature));
      }
    }

    if (product.getAttributeValues() != null) {
      for (final AttributeValue attributeValue : product.getAttributeValues()) {
        skuDetailDTO.addAttribute(transferToAttributeDTO(attributeValue));
      }
    }

    if (sku.getMedias() != null) {
      for (final Media media : sku.getMedias()) {
        skuDetailDTO.addMedia(transferMediaToMediaDTO(media));
      }
    }

    if (!isDefaultSku && product.getVariants() != null) {
      for (final Variant variant : product.getVariants()) {
        skuDetailDTO.addVariant(getVariantDTO(sku, product, variant));
      }
    }
    LOG.debug("end transferSkuToDTO, skuDetailDTO is {}.", skuDetailDTO.toString());
    return skuDetailDTO;
  }

  /**
   * get VariantDTO by sku, product and variant.
   *
   * @param sku     sku
   * @param product product
   * @param variant variant
   * @return VariantDTO
   */
  private VariantDTO getVariantDTO(Sku sku, Product product, Variant variant) {
    VariantDTO variantDTO = new VariantDTO();
    variantDTO.setId(variant.getId());
    variantDTO.setName(variant.getVariantName());
    variantDTO.setDisplayOrder(variant.getDisplayOrder());
    for (final VariantValue value : variant.getVariantValues()) {
      VariantValueDTO variantValueDTO = getVariantValueDTO(sku, product, value);
      variantDTO.addVariantValue(variantValueDTO);
    }
    return variantDTO;
  }

  /**
   * get VariantValueDTO by sku, product, variantvalue.
   *
   * @param sku     sku
   * @param product product
   * @param value   variant value
   * @return VariantValueDTO
   */
  private VariantValueDTO getVariantValueDTO(Sku sku, Product product, VariantValue value) {
    VariantValueDTO variantValueDTO = new VariantValueDTO();
    variantValueDTO.setId(value.getId());
    variantValueDTO.setValue(value.getValue());
    String skuNumber = getSkuNumber(value, sku, product.getAdditionalSkus());
    variantValueDTO.setSkuNumber(skuNumber);
    variantValueDTO.setActived(isActiveSku(skuNumber, product.getAdditionalSkus()));
    variantValueDTO.setDisplayOrder(value.getDisplayOrder());
    variantValueDTO.setSelected(isSelectedSku(skuNumber, sku));
    return variantValueDTO;
  }

  /**
   * transfer Media to MediaDTO.
   *
   * @param media media
   * @return MediaDTO
   */
  private MediaDTO transferMediaToMediaDTO(Media media) {
    MediaDTO mediaDTO = new MediaDTO();
    mediaDTO.setId(media.getId());
    mediaDTO.setDisplayOrder(media.getDisplayOrder());
    mediaDTO.setTitle(media.getTitle());
    mediaDTO.setType(media.getType());
    mediaDTO.setUrl(media.getUrl());
    return mediaDTO;
  }

  /**
   * transfer Feature to FeatureDTO.
   *
   * @param feature feature
   * @return FeatureDTO
   */
  private FeatureDTO transferToFeatureDTO(Feature feature) {
    FeatureDTO featureDTO = new FeatureDTO();
    featureDTO.setId(feature.getId());
    featureDTO.setDescription(feature.getDescription());
    return featureDTO;
  }

  /**
   * transfer Attribute to AttributeDTO.
   *
   * @param attributeValue attribute
   * @return AttributeDTO
   */
  private AttributeDTO transferToAttributeDTO(AttributeValue attributeValue) {
    AttributeDTO attributeDTO = new AttributeDTO();
    attributeDTO.setId(attributeValue.getId());
    attributeDTO.setName(attributeValue.getAttribute().getName());
    attributeDTO.setValue(attributeValue.getValue());
    return attributeDTO;
  }

  /**
   * set general information to SkuDetailDTO.
   *
   * @param sku sku
   * @return SkuDetailDTO
   */
  private SkuDetailDTO setGeneralInformationToDTO(Sku sku, Product product, boolean isDefaultSku) {
    SkuDetailDTO skuDetailDTO = new SkuDetailDTO();

    skuDetailDTO.setId(sku.getId());
    skuDetailDTO.setManufacturer(product.getManufacturer());
    skuDetailDTO.setBrand(product.getBrand());
    skuDetailDTO.setModel(product.getModel());
    skuDetailDTO.setName(product.getName());
    skuDetailDTO.setPrice(getSkuPrice(sku, isDefaultSku));
    skuDetailDTO.setDescription(product.getDescription());
    skuDetailDTO.setDetail(product.getDetail());
    skuDetailDTO.setActived(isActiveSku(sku));

    return skuDetailDTO;
  }

  /**
   * get sku price.
   *
   * @param sku          sku
   * @param isDefaultSku isDefaultSku
   * @return return price of sku when isDefaultSku is true, else return the sum of price and
   * variant's price adjustment
   */
  private String getSkuPrice(Sku sku, boolean isDefaultSku) {
    BigDecimal defaultPrice = sku.getPrice();
    if (!isDefaultSku) {
      for (VariantValue value : sku.getVariantValues()) {
        defaultPrice = defaultPrice.add(value.getPriceAdjustment());
      }
    }
    return DecimalFormatUtils.transferToShortString(defaultPrice);
  }

  /**
   * check if default sku.
   *
   * @param sku sku
   * @return true if defaultProduct not null and false if null.
   */
  private boolean isDefaultSku(Sku sku) {
    return sku.getDefaultProduct() != null;
  }

  /**
   * get product by sku.
   *
   * @param sku          Sku
   * @param isDefaultSku isDefaultSku
   * @return if isDefaultSku is true then return defaultProduct, else return product.
   */
  private Product getProduckBySku(Sku sku, boolean isDefaultSku) {
    Product product = null;
    if (isDefaultSku) {
      product = sku.getDefaultProduct();
    } else {
      product = sku.getProduct();
    }
    return product;
  }

  /**
   * check if the sku is selected.
   *
   * @param skuNumber sku number
   * @param sku       sku
   * @return true if selected or false if not selected
   */
  private static boolean isSelectedSku(String skuNumber, Sku sku) {
    return StringUtils.equals(skuNumber, sku.getSkuNumber());
  }

  /**
   * if sku is active.
   *
   * @param skuNumber skuNumber
   * @param skus      set of sku
   * @return
   */
  private boolean isActiveSku(String skuNumber, Set<Sku> skus) {
    boolean result = false;
    for (Sku sku : skus) {
      if (StringUtils.equals(skuNumber, sku.getSkuNumber())) {
        result = isActiveSku(sku);
        break;
      }
    }
    return result;
  }

  /**
   * check if active sku.
   *
   * @param sku sku
   * @return true if active and false if not active
   */
  private boolean isActiveSku(Sku sku) {
    return sku.isActive() && sku.getQuantity() > 0;
  }

  /**
   * TODO need optimization
   *
   * @param value
   * @param seletedSku
   * @param skus
   * @return
   */
  private String getSkuNumber(VariantValue value, Sku seletedSku, Set<Sku> skus) {
    String skuNumber = "";
    Set<VariantValue> values = new HashSet<>();
    values.add(value);
    for (VariantValue skuVariantValue :
        seletedSku.getVariantValues()) {
      if (skuVariantValue.getVariant().getId() != value.getVariant().getId()) {
        values.add(skuVariantValue);
      }
    }
    for (Sku sku : skus) {
      if (values.containsAll(sku.getVariantValues())) {
        skuNumber = sku.getSkuNumber();
        break;
      }
    }
    return skuNumber;
  }
}
