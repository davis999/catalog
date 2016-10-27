package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.grpc.GrpcProduct;
import io.reactivesw.catalog.grpc.GrpcProductBrief;
import io.reactivesw.catalog.grpc.ProductBriefList;

import io.reactivesw.catalog.infrastructure.utils.DecimalFormatUtils;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Set;

/**
 * this is transfer class for product.
 *
 * @author Davis
 */
public final class ProductMapper {

  /**
   * private constructor.
   */
  private ProductMapper() {
  }

  /**
   * transfer Product to GrpcProduct.
   *
   * @param product src product
   * @return GrpcProduct
   */
  public static GrpcProduct transferToGrpcProduct(Product product) {
    final ModelMapper modelMapper = new ModelMapper();
    final GrpcProduct.Builder builder = modelMapper.map(product, GrpcProduct.Builder.class);
    final Set<Sku> skus = product.getAdditionalSkus();
    final Sku defaultSku = product.getDefaultSku();
    final String price = DecimalFormatUtils.transferToShortString(defaultSku.getPrice());
    builder.setPrice(price);
    builder.setDefaultSku(SkuMapper.transferToGrpcSku(defaultSku));
    if (skus != null) {
      builder.addAllSku(SkuMapper.transferToGrpcSkuList(skus));
    }
    if (product.getFeatures() != null) {
      builder.addAllFeature(FeatureMapper.transferToGrpcFeatureList(product.getFeatures()));
    }
    if (product.getAttributeValues() != null) {
      builder.addAllAttribute(AttributeMapper.transferToGrpcAttributeList(product
          .getAttributeValues()));
    }
    if (product.getVariants() != null) {
      builder.addAllVariant(VariantMapper.transferToGrpcVariantList(product.getVariants()));
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
   * @return GrpcProductBrief GrpcProductBrief
   */
  public static GrpcProductBrief transferToGrpcProductBrief(Product product) {
    final GrpcProductBrief.Builder builder = GrpcProductBrief.newBuilder();

    final Sku defaultSku = product.getDefaultSku();
    final Media defaultMedia = defaultSku.getMedias().iterator().next();

    builder.setId(product.getId());
    builder.setDefaultSkuNumber(defaultSku.getSkuNumber());
    builder.setMediaURL(defaultMedia.getUrl());
    builder.setName(product.getName());
    builder.setDefaultSkuId(defaultSku.getId());

    final String price = DecimalFormatUtils.transferToShortString(defaultSku.getPrice());
    builder.setPrice(price);

    return builder.build();
  }
}
