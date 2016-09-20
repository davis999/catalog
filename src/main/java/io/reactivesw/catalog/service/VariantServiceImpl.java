package io.reactivesw.catalog.service;

import io.reactivesw.catalog.domain.Variant;
import io.reactivesw.catalog.repository.VariantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this is service class for variant.
 * 
 * @author Davis
 *
 */
@Service("variantService")
public class VariantServiceImpl implements VariantService {
  /**
   * variant repository.
   */
  @Autowired
  private transient VariantRepository variantRepository;

  /**
   * save variant.
   * 
   * @param variant variant
   * @return variant
   */
  @Override
  public Variant saveVariant(Variant variant) {
    return variantRepository.save(variant);
  }

  /**
   * edit variant.
   * 
   * @param variant variant
   * @return variant
   */
  @Override
  public Variant editVariant(Variant variant) {
    return variantRepository.save(variant);
  }

  /**
   * find a variant by id.
   * 
   * @param id id
   * @return variant
   */
  @Override
  public Variant findVariantById(long id) {
    return variantRepository.findOne(id);
  }

  /**
   * find some variant by name.
   * 
   * @param name name
   * @return list of variant
   */
  @Override
  public List<Variant> findVariantsByName(String name) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * remove variant.
   * 
   * @param id id
   */
  @Override
  public void removeVariant(long id) {
    // TODO Auto-generated method stub
    variantRepository.delete(id);
  }


}
