package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.grpc.GrpcSku;

import io.reactivesw.catalog.grpc.GrpcSkuDetail;
import io.reactivesw.catalog.grpc.SkuInformation;
import io.reactivesw.catalog.grpc.SkuInformationList;
import io.reactivesw.catalog.infrastructure.dto.SkuDetailDTO;
import io.reactivesw.catalog.infrastructure.utils.DecimalFormatUtils;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
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
   * transfer set of Sku to list of GrpcSku.
   * @param skus set of Sku
   * @return list of GrpcSku
   */
  public static List<GrpcSku> transferToGrpcSkuList(Set<Sku> skus) {
    List<GrpcSku> grpcSkus = new ArrayList<>();
    for (Sku sku : skus) {
      grpcSkus.add(transferToGrpcSku(sku));
    }
    return grpcSkus;
  }

  /**
   * transfer Sku to GrpcSku.
   *
   * @param sku sku
   * @return GrpcSku
   */
  public static GrpcSku transferToGrpcSku(Sku sku) {
    final GrpcSku.Builder builder = modelMapper.map(sku, GrpcSku.Builder.class);
    builder.setPrice(DecimalFormatUtils.transferToShortString(sku.getPrice()));
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
   * TODO refactor
   * transfer Sku to GrpcSkuDetail.
   *
   * @param sku
   * @return
   */
  public static GrpcSkuDetail transferToGrpcSkuDetail(SkuDetailDTO sku) {
    GrpcSkuDetail.Builder builder = GrpcSkuDetail.newBuilder();
    builder = modelMapper.map(sku, GrpcSkuDetail.Builder.class);
    builder.addAllFeature(FeatureMapper.transferToGrpcFeatureList(sku.getFeatures()));
    builder.addAllAttribute(AttributeMapper.transferToGrpcAttributeList(sku.getAttributes()));
    builder.addAllMedia(MediaMapper.transferToGrpcMediaList(sku.getMedias()));
    builder.addAllVariant(VariantMapper.transferToGrpcVariantList(sku.getVariants()));
    return builder.build();
  }
}
