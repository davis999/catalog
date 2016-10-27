package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * this is service class for product.
 *
 * @author Davis
 */
@Service("productService")
public class ProductService {

  /**
   * log.
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
  public Product getProductDetail(long productId) {
    LOG.debug("enter getProductDetail, id is {}.", productId);
    final Product product = productRepository.findOne(productId);
    if (product == null) {
      LOG.debug("query product fail, no such product with id {}", productId);
      throw new NotFoundException("Product Not Exist");
    }
    LOG.debug("end getProductDetail, id is {}.", productId);
    return product;
  }

  /**
   * query list of Product by category id.
   * if result is null, should return new ArrayList.
   *
   * @param categoryId category id
   * @return list of Product
   */
  public List<Product> queryProductsByCategory(long categoryId) {
    LOG.debug("enter queryProductByCategoryId, id is {}.", categoryId);
    List<Product> products = productRepository.findProductByCategoryId(categoryId);
    if (products == null) {
      LOG.debug("fail to query product by catagory id {}, no result.", categoryId);
      products = new ArrayList<>();
    }
    products = setDefaultSku(products);
    LOG.debug("end queryProductByCategoryId, category id is {}, get {} products", categoryId,
        products.size());
    return products;
  }

  /**
   * set first additional sku be default sku.
   *
   * @param products list of product
   * @return list of product
   */
  private List<Product> setDefaultSku(List<Product> products) {
    for (Product product : products) {
      if (product.getAdditionalSkus() != null && !product.getAdditionalSkus().isEmpty()) {
        product.setDefaultSku(product.getAdditionalSkus().iterator().next());
      }
    }
    return products;
  }
}
