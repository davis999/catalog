package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Variant;

import java.util.List;

/**
 * this is service interface for variant.
 * 
 * @author Davis
 *
 */
public interface VariantService {
  /**
   * save variant.
   * 
   * @param variant variant
   * @return variant
   */
  Variant saveVariant(Variant variant);

  /**
   * edit variant.
   * 
   * @param variant variant
   * @return variant
   */
  Variant editVariant(Variant variant);

  /**
   * find a variant by id.
   * 
   * @param id id
   * @return variant
   */
  Variant findVariantById(long id);

  /**
   * find some variant by name.
   * 
   * @param name name
   * @return list of variant
   */
  List<Variant> findVariantsByName(String name);

  /**
   * remove variant.
   * 
   * @param id id
   */
  void removeVariant(long id);
}
