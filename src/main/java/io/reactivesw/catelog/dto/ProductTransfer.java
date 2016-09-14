package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.AttributeValue;
import io.reactivesw.catelog.domain.Feature;
import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.domain.Sku;
import io.reactivesw.catelog.infrastructure.GrpcProduct;
import io.reactivesw.catelog.infrastructure.GrpcProductBrief;
import io.reactivesw.catelog.infrastructure.ProductBriefList;

import java.util.List;
import java.util.Set;

/**
 * this is transfer class for product.
 * 
 * @author Davis
 *
 */
public final class ProductTransfer {

  /**
   * private constructor.
   */
  private ProductTransfer() {}

  /**
   * transfer Product to ProductInfo.
   * 
   * @param product src product
   * @return ProductInfo
   */
  public static GrpcProduct transferToProductInfo(Product product) {
    final GrpcProduct.Builder builder = GrpcProduct.newBuilder();

    builder.setId(product.getId());
    builder.setManufacturer(product.getManufacturer());
    builder.setBrand(product.getBrand());
    builder.setModel(product.getModel());
    builder.setName(product.getName());
    builder.setDisplayOrder(product.getDisplayOrder());
    builder.setDescription(product.getDescription());
    builder.setDetail(product.getDetail());
    builder.setIsDisplayed(product.isDisplayed());
    final Set<Sku> skus = product.getSkus();
    final Sku defaultSku = skus.iterator().next();
    builder.setPrice(defaultSku.getPrice().toString());
    for (final Sku sku : skus) {
      builder.addSku(SkuTransfer.transferToSkuInfo(sku));
    }
    for (final Feature feature : product.getFeatures()) {
      builder.addFeature(FeatureTransfer.transferToFeatureInfo(feature));
    }
    for (final AttributeValue attributeValue : product.getAttributeValues()) {
      builder.addAttribute(AttributeTransfer.transferToAttributeInfo(attributeValue));
    }

    return builder.build();
  }

  /**
   * transfer list of products to ProductBriefList.
   * 
   * @param products src products.
   * @return ProductBriefList
   */
  public static ProductBriefList transferToProductBriefList(List<Product> products) {
    final ProductBriefList.Builder builder = ProductBriefList.newBuilder();

    for (final Product product : products) {
      builder.addProductBrief(transferToGrpcProductBrief(product));
    }

    return builder.build();
  }

  /**
   * transfer Product to GrpcProductBrief.
   * 
   * @param product src product
   * @return GrpcProductBrief
   */
  public static GrpcProductBrief transferToGrpcProductBrief(Product product) {
    final GrpcProductBrief.Builder builder = GrpcProductBrief.newBuilder();

    final Sku defaultSku = product.getSkus().iterator().next();
    final Media defaultMedia = defaultSku.getMedias().iterator().next();

    builder.setId(product.getId());
    builder.setDisplayOrder(product.getDisplayOrder());
    builder.setMediaURL(defaultMedia.getUrl());
    builder.setName(product.getName());
    builder.setPrice(defaultSku.getPrice().toString());

    return builder.build();
  }
}
