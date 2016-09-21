package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.infrastructure.exception.CatalogRuntimeException;
import io.reactivesw.catalog.infrastructure.repository.CategoryRepository;

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
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CategoryServiceImpl.class);

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
    final List<Category> categories = categoryRepository.findAll();
    if (categories == null || categories.isEmpty()) {
      LOG.debug("query all categories fail, no result");
      throw new CatalogRuntimeException("query categories fail, no result.");
    }
    return categories;
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
   * find a category by it's id.
   *
   * @param id id
   * @return category
   */
  @Override
  public Category findCategoryById(long id) {
    final Category category = categoryRepository.findOne(id);
    if (category == null) {
      LOG.debug("find category by id fail, not such category with id {}", id);
      throw new CatalogRuntimeException("");
    }
    return category;
  }
}
