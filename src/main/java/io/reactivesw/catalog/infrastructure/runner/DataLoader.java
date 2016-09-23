package io.reactivesw.catalog.infrastructure.runner;

import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.infrastructure.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Initial category data when setup.
 * Created by Davis on 16/9/22.
 */
@Component
public class DataLoader implements ApplicationRunner {
  /**
   * category repository.
   */
  @Autowired
  private transient CategoryRepository categoryRepository;

  /**
   * run when setup.
   * insert a home category if cann't find any category.
   *
   * @param args args.
   * @throws Exception exception.
   */
  @Override
  public void run(ApplicationArguments args) throws Exception {
    final List<Category> categories = categoryRepository.findAll();
    if (categories == null || categories.isEmpty()) {
      initialCategory();
    }
  }

  /**
   * initial category data.
   * insert home category and feature category.
   */
  private void initialCategory() {
    final Category category = initialHomeCategory();

    final Category featureCategory = initialFeatureCategory();

    final List<Category> categoryList = new ArrayList<Category>();
    categoryList.add(category);
    categoryList.add(featureCategory);

    categoryRepository.save(categoryList);
  }

  /**
   * initial home category.
   *
   * @return Category home category.
   */
  private Category initialHomeCategory() {
    final Category homeCategory = new Category();
    homeCategory.setName("home");
    homeCategory.setDescription("this is the home category");
    final ZonedDateTime createdTime = ZonedDateTime.now(ZoneOffset.UTC);
    homeCategory.setCreatedTime(createdTime);
    homeCategory.setModifiedTime(createdTime);
    return homeCategory;
  }

  /**
   * initial feature category.
   *
   * @return Category feature category.
   */
  private Category initialFeatureCategory() {
    final Category featureCategory = new Category();
    featureCategory.setName("Feature");
    featureCategory.setDescription("this is the feature category");
    final ZonedDateTime createdTime = ZonedDateTime.now(ZoneOffset.UTC);
    featureCategory.setCreatedTime(createdTime);
    featureCategory.setModifiedTime(createdTime);
    return featureCategory;
  }
}
