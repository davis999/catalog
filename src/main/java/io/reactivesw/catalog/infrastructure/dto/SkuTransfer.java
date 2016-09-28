package io.reactivesw.catalog.infrastructure.dto;

import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.grpc.GrpcSku;

import io.reactivesw.catalog.grpc.SkuInformation;
import io.reactivesw.catalog.grpc.SkuInformationList;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Set;

/**
 * this is transfer class for Sku.
 *
 * @author Davis
 */
public final class SkuTransfer {
  /**
   * model mapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructro.
   */
  private SkuTransfer() {
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
      builder.addMedia(MediaTransfer.transferToMediaInfo(media));
    }

    final Set<VariantValue> variantValues = sku.getVariantValues();
    if (variantValues != null) {
      for (final VariantValue variantValue : variantValues) {
        builder.addVariantValue(VariantValueTransfer.transferToVariantValue(variantValue));
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
}
