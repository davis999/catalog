package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Product;

import java.util.List;

/**
 * this is service interface for product.
 * 
 * @author Davis
 *
 */
public interface ProductService {
  /**
   * query product by id.
   * 
   * @param id id.
   * @return product.
   */
  Product queryProductById(long id);
  
  /**
   * query list of Product by category id.
   * 
   * @param categoryId category id
   * @return list of Product
   */
  List<Product> queryProductsByCategoryId(long categoryId);
}
