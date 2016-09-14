package io.reactivesw.catelog.service;

import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this is service class for product.
 * 
 * @author Davis
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

  /**
   * product repository.
   */
  @Autowired
  private transient ProductRepository productRepository;

  /**
   * query product by id.
   * 
   * @param id id.
   * @return product.
   */
  @Override
  public Product queryProductById(long id) {
    return productRepository.findOne(id);
  }

  /**
   * query list of Product by category id.
   * 
   * @param categoryId category id
   * @return list of Product
   */
  @Override
  public List<Product> queryProductsByCategoryId(long categoryId) {
    return productRepository.findProductByCategoryId(categoryId);
  }
}
