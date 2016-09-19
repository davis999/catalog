package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.domain.Sku;
import io.reactivesw.catelog.domain.VariantValue;
import io.reactivesw.catelog.infrastructure.GrpcSku;

import org.modelmapper.ModelMapper;

import java.util.Set;

/**
 * this is transfer class for Sku.
 * 
 * @author Davis
 *
 */
public final class SkuTransfer {

  /**
   * private constructro.
   */
  private SkuTransfer() {}

  /**
   * transfer Sku to GrpcSku.
   * 
   * @param sku sku
   * @return GrpcSku
   */
  public static GrpcSku transferToGrpcSku(Sku sku) {
    final ModelMapper modelMapper = new ModelMapper();
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
}
