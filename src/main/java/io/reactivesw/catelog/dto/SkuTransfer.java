package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Media;
import io.reactivesw.catelog.domain.Sku;
import io.reactivesw.catelog.domain.VariantValue;
import io.reactivesw.catelog.infrastructure.SkuInfo;

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
  private SkuTransfer(){}

  /**
   * transfer Sku to SkuInfo.
   * 
   * @param sku sku
   * @return SkuInfo
   */
  public static SkuInfo transferToSkuInfo(Sku sku) {
    final SkuInfo.Builder builder = SkuInfo.newBuilder();

    builder.setId(sku.getId());
    builder.setSkuNumber(sku.getSkuNumber());
    builder.setIsActive(sku.isActive());
    builder.setQuatity(sku.getQuantity());
    builder.setUpc(sku.getUpc());
    builder.setDisplayOrder(sku.getDisplayOrder());

    final Set<Media> medias = sku.getMedias();
    for (final Media media : medias) {
      builder.addMedia(MediaTransfer.transferToMediaInfo(media));
    }

    final Set<VariantValue> variantValues = sku.getVariantValues();
    for (final VariantValue variantValue : variantValues) {
      builder.addVariantValue(VariantValueTransfer.transferToVariantValue(variantValue));
    }

    return builder.build();
  }
}
