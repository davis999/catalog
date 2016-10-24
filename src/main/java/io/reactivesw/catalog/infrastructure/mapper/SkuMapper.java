package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.AttributeValue;
import io.reactivesw.catalog.domain.entity.Feature;
import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.domain.entity.Variant;
import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.grpc.GrpcSku;

import io.reactivesw.catalog.grpc.GrpcSkuDetail;
import io.reactivesw.catalog.grpc.GrpcVariant;
import io.reactivesw.catalog.grpc.GrpcVariantValue;
import io.reactivesw.catalog.grpc.SkuInformation;
import io.reactivesw.catalog.grpc.SkuInformationList;
import io.reactivesw.catalog.infrastructure.utils.DecimalFormatUtils;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * this is transfer class for Sku.
 *
 * @author Davis
 */
public final class SkuMapper {
  /**
   * model mapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructro.
   */
  private SkuMapper() {
  }

  /**
   * transfer Sku to GrpcSku.
   *
   * @param sku sku
   * @return GrpcSku
   */
  public static GrpcSku transferToGrpcSku(Sku sku) {
    final GrpcSku.Builder builder = modelMapper.map(sku, GrpcSku.Builder.class);

    final Set<Media> medias = sku.getMedias();
    for (final Media media : medias) {
      builder.addMedia(MediaMapper.transferToMediaInfo(media));
    }

    final Set<VariantValue> variantValues = sku.getVariantValues();
    if (variantValues != null) {
      for (final VariantValue variantValue : variantValues) {
        builder.addVariantValue(VariantValueMapper.transferToVariantValue(variantValue));
      }
    }

    return builder.build();
  }

  /**
   * transfer Sku to SkuInformation.
   *
   * @param sku sku
   * @return SkuInformation SkuInformation
   */
  public static SkuInformation transferToSkuInformation(Sku sku) {

    final SkuInformation.Builder builder = modelMapper.map(sku, SkuInformation.Builder.class);
    Set<Media> medias = sku.getMedias();
    if (medias != null && !medias.isEmpty()) {
      Media media = medias.iterator().next();
      builder.setMediaUrl(media.getUrl());
    }
    builder.setSkuName(sku.getProduct().getName());
    builder.setPrice(DecimalFormatUtils.transferToShortString(sku.getPrice()));
    return builder.build();
  }

  /**
   * transfer list of Sku to SkuInformationList.
   *
   * @param skus list of Sku
   * @return SkuInformationList
   */
  public static SkuInformationList transferToSkuInformationList(List<Sku> skus) {
    final SkuInformationList.Builder builder = SkuInformationList.newBuilder();
    for (final Sku sku : skus) {
      builder.addSkuInformation(transferToSkuInformation(sku));
    }
    return builder.build();
  }

  /**
   * transfer Sku to GrpcSkuDetail.
   *
   * @param sku
   * @return
   */
  public static GrpcSkuDetail transferToGrpcSkuDetail(Sku sku) {
    final GrpcSkuDetail.Builder builder = GrpcSkuDetail.newBuilder();
    final boolean isDefaultSku = isDefaultSku(sku);
    Product product = null;
    if (isDefaultSku) {
      product = sku.getDefaultProduct();
    } else {
      product = sku.getProduct();
    }
    builder.setId(product.getId());
    builder.setManufacturer(product.getManufacturer());
    builder.setBrand(product.getBrand());
    builder.setModel(product.getModel());
    builder.setName(product.getName());
    BigDecimal defaultPrice = sku.getPrice();
    if (!isDefaultSku) {
      for (VariantValue value : sku.getVariantValues()) {
        defaultPrice = defaultPrice.add(value.getPriceAdjustment());
      }
    }
    builder.setPrice(DecimalFormatUtils.transferToShortString(defaultPrice));
    builder.setDescription(product.getDescription());
    builder.setDetail(product.getDetail());

    if (product.getFeatures() != null) {
      for (final Feature feature : product.getFeatures()) {
        builder.addFeature(FeatureMapper.transferToFeatureInfo(feature));
      }
    }

    if (product.getAttributeValues() != null) {
      for (final AttributeValue attributeValue : product.getAttributeValues()) {
        builder.addAttribute(AttributeMapper.transferToAttributeInfo(attributeValue));
      }
    }

    if (sku.getMedias() != null) {
      for (final Media media : sku.getMedias()) {
        builder.addMedia(MediaMapper.transferToMediaInfo(media));
      }
    }

    if (!isDefaultSku && product.getVariants() != null) {
      for (final Variant variant : product.getVariants()) {
        GrpcVariant.Builder variantBuilder = GrpcVariant.newBuilder();
        variantBuilder.setId(variant.getId());
        variantBuilder.setName(variant.getVariantName());
        variantBuilder.setDisplayOrder(variant.getDisplayOrder());
        for (final VariantValue value : variant.getVariantValues()) {
          GrpcVariantValue.Builder valueBuilder = GrpcVariantValue.newBuilder();
          valueBuilder.setId(value.getId());
          valueBuilder.setValue(value.getValue());
          String skuNumber = getSkuNumber(value, sku, product.getAdditionalSkus());
          valueBuilder.setSkuNumber(skuNumber);
          valueBuilder.setIsActive(isActiveSku(skuNumber, product.getAdditionalSkus()));
          valueBuilder.setDisplayOrder(value.getDisplayOrder());
          valueBuilder.setSelected(isSelectedSku(skuNumber, sku));
          variantBuilder.addVariantValue(valueBuilder);
        }
        builder.addVariant(variantBuilder);
      }
    }

    return builder.build();
  }

  /**
   * TODO
   *
   * @param value
   * @param seletedSku
   * @param skus
   * @return
   */
  private static String getSkuNumber(VariantValue value, Sku seletedSku, Set<Sku> skus) {
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

  /**
   * if sku is active.
   *
   * @param skuNumber skuNumber
   * @param skus      set of sku
   * @return
   */
  private static boolean isActiveSku(String skuNumber, Set<Sku> skus) {
    boolean result = false;
    for (Sku sku : skus) {
      if (StringUtils.equals(skuNumber, sku.getSkuNumber())) {
        result = sku.isActive() && sku.getQuantity() > 0;
        break;
      }
    }
    return result;
  }

  /**
   * if the sku is selected.
   *
   * @param skuNumber sku number
   * @param sku       sku
   * @return true if selected or false if not selected
   */
  private static boolean isSelectedSku(String skuNumber, Sku sku) {
    return StringUtils.equals(skuNumber, sku.getSkuNumber());
  }

  private static boolean isDefaultSku(Sku sku) {
    return sku.getDefaultProduct() != null;
  }
}
