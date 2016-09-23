package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
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
public class CategoryService {

  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);

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
  public List<Category> findAllCategories() {
    LOG.info("find all category.");
    final List<Category> categories = categoryRepository.findAll();
    if (categories == null || categories.isEmpty()) {
      LOG.debug("query all categories fail, no result");
      throw new NotFoundException("Not Category Exist");
    }
    LOG.info("end find all category, get {} category.", categories.size());
    return categories;
  }

  /**
   * save a category.
   *
   * @param category category to save
   * @return true for success and false for fail
   */
  public Category saveCategory(Category category) {
    return categoryRepository.save(category);
  }

  /**
   * find some categories by it's name.
   *
   * @param name name
   * @return list of categories.
   */
  public Set<Category> findCategoryByName(String name) {
    return categoryRepository.findCategoryByName(name);
  }

  /**
   * find a category by it's id.
   *
   * @param categoryId id.
   * @return Category category.
   */
  public Category findCategoryById(long categoryId) {
    LOG.info("enter findCategoryById, id is {}.", categoryId);
    final Category category = categoryRepository.findOne(categoryId);
    if (category == null) {
      LOG.debug("find category by id fail, not such category with id {}", categoryId);
      throw new NotFoundException("No Category Exist");
    }
    LOG.info("end findCategoryById, id is {}.", categoryId);
    return category;
  }
}
