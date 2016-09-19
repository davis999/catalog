package io.reactivesw.catelog.service;

import io.reactivesw.catelog.domain.Category;
import io.reactivesw.catelog.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * this is service class for category.
 * 
 * @author Davis
 *
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
  /**
   * depth to top category.
   */
  private static final int TOP_DEPTH = 0;

  /**
   * category repository.
   */
  @Autowired
  private transient CategoryRepository categoryRepository;

  /**
   * find all categories.
   * 
   * @return set of categories
   */
  @Override
  public List<Category> findAllCategories() {
    return categoryRepository.findAll();
  }

  /**
   * save a category.
   * 
   * @param category category to save
   * @return true for success and false for fail
   */
  @Override
  public Category saveCategory(Category category) {
    return categoryRepository.save(category);
  }

  /**
   * find some categories by it's name.
   * 
   * @param name name
   * @return list of categories.
   */
  @Override
  public Set<Category> findCategoryByName(String name) {
    return categoryRepository.findCategoryByName(name);
  }

  /**
   * find all top categories.
   * 
   * @return list of categories.
   */
  @Override
  public Set<Category> findAllTopCategories() {
    return categoryRepository.findCategoryByDepth(TOP_DEPTH);
  }

  /**
   * find a category by it's id.
   * 
   * @param id id
   * @return category
   */
  @Override
  public Category findCategoryById(long id) {
    return categoryRepository.findOne(id);
  }
}
