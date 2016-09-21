package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.infrastructure.exception.CatalogRuntimeException;
import io.reactivesw.catalog.infrastructure.repository.ProductRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
   *log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

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
    final Product product = productRepository.findOne(id);
    if (product == null) {
      LOG.debug("query product fail, no such product with id {}", id);
      throw new CatalogRuntimeException();
    }
    return product;
  }

  /**
   * query list of Product by category id.
   * 
   * @param categoryId category id
   * @return list of Product
   */
  @Override
  public List<Product> queryProductsByCategoryId(long categoryId) {
    final List<Product> products = productRepository.findProductByCategoryId(categoryId);
    if (products == null || products.isEmpty()) {
      LOG.debug("fail to query product by catagory id {}, no result.", categoryId);
      throw new CatalogRuntimeException();
    }
    return products;
  }
}
