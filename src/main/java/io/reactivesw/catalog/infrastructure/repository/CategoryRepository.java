package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * this is repository interface for category.
 * 
 * @author Davis
 *
 */
@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long> {

  /**
   * find categories by name.
   * 
   * @param name category name.
   * @return list of categories.
   */
  Set<Category> findCategoryByName(String name);

  /**
   * find all category order by displayOrder.
   * @return list of category.
   */
  List<Category> findAllCategoryByOrderByDisplayOrderAsc();
}
