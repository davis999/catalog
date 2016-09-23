package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.repository.ProductRepository;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * this is service class for product.
 * 
 * @author Davis
 *
 */
@Service("productService")
public class ProductService {

  /**
   *log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ProductService.class);

  /**
   * product repository.
   */
  @Autowired
  private transient ProductRepository productRepository;

  /**
   * query product by id.
   * 
   * @param productId id.
   * @return product.
   */
  public Product queryProductById(long productId) {
    LOG.info("enter queryProductById, id is {}.", productId);
    final Product product = productRepository.findOne(productId);
    if (product == null) {
      LOG.debug("query product fail, no such product with id {}", productId);
      throw new NotFoundException("Product Not Exist.");
    }
    LOG.info("end queryProductById, id is {}.", productId);
    return product;
  }

  /**
   * query list of Product by category id.
   * 
   * @param categoryId category id
   * @return list of Product
   */
  public List<Product> queryProductsByCategoryId(long categoryId) {
    LOG.info("enter queryProductByCategoryId, id is {}.", categoryId);
    final List<Product> products = productRepository.findProductByCategoryId(categoryId);
    if (products == null || products.isEmpty()) {
      LOG.debug("fail to query product by catagory id {}, no result.", categoryId);
      throw new NotFoundException();
    }
    LOG.info("end queryProductByCategoryId, id is {}.", categoryId);
    return products;
  }
}
