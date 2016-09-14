package io.reactivesw.catelog.service;

import io.reactivesw.catelog.domain.VariantValue;
import io.reactivesw.catelog.repository.VariantValueRepository;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
  @Resource(name = "variantValueRepository")
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
