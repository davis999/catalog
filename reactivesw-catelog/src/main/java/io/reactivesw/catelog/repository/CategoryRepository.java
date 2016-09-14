package io.reactivesw.catelog.repository;

import io.reactivesw.catelog.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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
  List<Category> findCategoryByName(String name);
  
  /**
   * find categories by depth.
   * @param depth depth
   * @return list of category
   */
  List<Category> findCategoryByDepth(int depth);
}
