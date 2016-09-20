package io.reactivesw.catalog.dto;

import io.reactivesw.catalog.domain.AttributeValue;
import io.reactivesw.catalog.domain.Feature;
import io.reactivesw.catalog.domain.Media;
import io.reactivesw.catalog.domain.Product;
import io.reactivesw.catalog.domain.Sku;
import io.reactivesw.catalog.infrastructure.GrpcProduct;
import io.reactivesw.catalog.infrastructure.GrpcProductBrief;
import io.reactivesw.catalog.infrastructure.ProductBriefList;

import org.modelmapper.ModelMapper;

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
   * transfer Product to GrpcProduct.
   * 
   * @param product src product
   * @return GrpcProduct
   */
  public static GrpcProduct transferToGrpcProduct(Product product) {
    final ModelMapper modelMapper = new ModelMapper();
    final GrpcProduct.Builder builder = modelMapper.map(product, GrpcProduct.Builder.class);

    final Set<Sku> skus = product.getSkus();
    final Sku defaultSku = product.getDefaultSku();
    if (defaultSku != null) {
      builder.setPrice(defaultSku.getPrice().toString());
    }
    if (skus != null) {
      for (final Sku sku : skus) {
        builder.addSku(SkuTransfer.transferToGrpcSku(sku));
      }
    }
    if (product.getFeatures() != null) {
      for (final Feature feature : product.getFeatures()) {
        builder.addFeature(FeatureTransfer.transferToFeatureInfo(feature));
      }
    }
    if (product.getAttributeValues() != null) {
      for (final AttributeValue attributeValue : product.getAttributeValues()) {
        builder.addAttribute(AttributeTransfer.transferToAttributeInfo(attributeValue));
      }
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

    if (products != null) {
      for (final Product product : products) {
        builder.addProductBrief(transferToGrpcProductBrief(product));
      }
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

    final Sku defaultSku = product.getDefaultSku();
    final Media defaultMedia = defaultSku.getMedias().iterator().next();

    builder.setId(product.getId());
    builder.setDisplayOrder(product.getDisplayOrder());
    builder.setMediaURL(defaultMedia.getUrl());
    builder.setName(product.getName());
    builder.setPrice(defaultSku.getPrice().toString());

    return builder.build();
  }
}