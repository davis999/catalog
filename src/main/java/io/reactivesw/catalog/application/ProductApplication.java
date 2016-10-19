package io.reactivesw.catalog.application;

import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.service.CategoryService;
import io.reactivesw.catalog.domain.service.ProductService;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Application class for product.
 * Created by Davis on 16/10/9.
 */
@Service
public class ProductApplication {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(ProductApplication.class);

  /**
   * CategoryService.
   */
  @Autowired
  private transient CategoryService categoryService;

  /**
   * ProductService.
   */
  @Autowired
  private transient ProductService productService;

  /**
   * query products by category id.
   *
   * @param categoryId category id
   * @return list of product
   */
  public List<Product> queryProductsByCategoryId(long categoryId) {
    LOG.debug("enter queryProductsByCategoryId, category id is {}.", categoryId);
    boolean existCategory = categoryService.existCategory(categoryId);
    if (!existCategory) {
      LOG.debug("can not query product by a not exist category with id {}.", categoryId);
      throw new NotFoundException("Category is not exist");
    }
    List<Product> products = productService.queryProductsByCategoryId(categoryId);
    products = setDefaultSku(products);
    LOG.info("end queryProductByCategoryId, category id is {}, get {} products", categoryId,
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
