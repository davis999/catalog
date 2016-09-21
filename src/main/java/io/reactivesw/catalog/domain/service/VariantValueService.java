package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.VariantValue;

/**
 * this is service interface for variant value.
 * 
 * @author Davis
 *
 */
public interface VariantValueService {
  /**
   * add variant value.
   * 
   * @param variantValue variant value.
   */
  void addVariantValue(VariantValue variantValue);

  /**
   * remove variant value by id.
   * 
   * @param id id.
   */
  void removeVariantValue(long id);

  /**
   * edit variant value.
   * 
   * @param variantValue variant value.
   */
  void editVariantValue(VariantValue variantValue);
}
