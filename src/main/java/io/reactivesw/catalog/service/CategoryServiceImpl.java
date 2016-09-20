package io.reactivesw.catalog.service;

import io.reactivesw.catalog.domain.Category;
import io.reactivesw.catalog.exception.CatalogRuntimeException;
import io.reactivesw.catalog.repository.CategoryRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CategoryServiceImpl.class);

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
    final Set<Category> categories = categoryRepository.findCategoryByDepth(TOP_DEPTH);
    if (categories == null || categories.isEmpty()) {
      LOG.debug("query top categories fail, no result");
      throw new CatalogRuntimeException();
    }
    return categories;
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
