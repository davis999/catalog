package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.AttributeValue;
import io.reactivesw.catelog.domain.Feature;
import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.domain.Sku;
import io.reactivesw.catelog.grpc.infrastructure.ProductBriefInfo;
import io.reactivesw.catelog.grpc.infrastructure.ProductBriefList;
import io.reactivesw.catelog.grpc.infrastructure.ProductInfo;

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
  public static ProductInfo transferToProductInfo(Product product) {
    final ProductInfo.Builder builder = ProductInfo.newBuilder();

    builder.setId(product.getId());
    builder.setManufacturer(product.getManufacturer());
    builder.setBrand(product.getBrand());
    builder.setModel(product.getModel());
    builder.setName(product.getName());
    final Set<Sku> skus = product.getSkus();
    for (final Sku sku : skus) {
      builder.addSku(SkuTransfer.transferToSkuInfo(sku));
    }
    final Sku defaultSku = skus.iterator().next();
    builder.setPrice(defaultSku.getPrice().toString());
    builder.setDisplayOrder(product.getDisplayOrder());
    builder.setDescription(product.getDescription());
    builder.setDetail(product.getDetail());
    builder.setIsDisplayed(product.isDisplayed());
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
    // TODO: transfer work need other transfers
    final ProductBriefList.Builder builder = ProductBriefList.newBuilder();

    for (final Product product : products) {
      builder.addProductBriefInfo(transferToProductBriefInfo(product));
    }

    return builder.build();
  }

  /**
   * transfer Product to ProductBriefInfo.
   * 
   * @param product src product
   * @return ProductBriefInfo
   */
  public static ProductBriefInfo transferToProductBriefInfo(Product product) {
    final ProductBriefInfo.Builder builder = ProductBriefInfo.newBuilder();

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
