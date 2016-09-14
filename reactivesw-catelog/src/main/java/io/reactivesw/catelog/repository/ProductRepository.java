package io.reactivesw.catelog.repository;

import io.reactivesw.catelog.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * this is repository interface for product.
 * @author Davis
 *
 */
@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
  
  /**
   * find product by category.
   * @param categoryId category id.
   * @return list of product.
   */
  List<Product> findProductByCategoryId(long categoryId);
}
