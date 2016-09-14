package io.reactivesw.catelog.service;

import io.reactivesw.catelog.domain.Category;

import java.util.List;

/**
 * this is service interface for category.
 * 
 * @author Davis
 *
 */
public interface CategoryService {
  /**
   * save a category.
   * 
   * @param category category to save
   * @return true for success and false for fail
   */
  boolean saveCategory(Category category);

  /**
   * find some categories by it's name.
   * 
   * @param name name
   * @return list of categories.
   */
  List<Category> findCategoryByName(String name);

  /**
   * find all top categories.
   * 
   * @return list of categories.
   */
  List<Category> findAllTopCategories();

  /**
   * find a category by it's id.
   * 
   * @param id id
   * @return category
   */
  Category findCategoryById(long id);
  
  /**
   * find all categories.
   * @return set of categories.
   */
  List<Category> findAllCategories();
}
