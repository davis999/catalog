package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.VariantValue;
import io.reactivesw.catalog.infrastructure.repository.VariantValueRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * this is service class for variant value.
 * 
 * @author Davis
 *
 */
@Service("variantValueService")
public class VariantValueServiceImpl implements VariantValueService {
  /**
   * variant value repository.
   */
  @Autowired
  private transient VariantValueRepository variantValueRepository;

  /**
   * add variant value.
   * 
   * @param variantValue variant value.
   */
  @Override
  public void addVariantValue(VariantValue variantValue) {
    variantValueRepository.save(variantValue);
  }

  /**
   * edit variant value.
   * 
   * @param variantValue variant value.
   */
  @Override
  public void editVariantValue(VariantValue variantValue) {
    variantValueRepository.save(variantValue);
  }

  /**
   * remove variant value by id.
   * 
   * @param id id.
   */
  @Override
  public void removeVariantValue(long id) {
    variantValueRepository.delete(id);
  }
}
