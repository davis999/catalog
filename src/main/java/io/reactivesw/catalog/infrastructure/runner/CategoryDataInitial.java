package io.reactivesw.catalog.infrastructure.runner;

import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.infrastructure.utils.ZonedDatetimeUtils;

/**
 * Initial category data when setup.
 * Created by Davis on 16/9/22.
 */
public final class CategoryDataInitial {

  /**
   * private constructor.
   */
  private CategoryDataInitial() {
  }

  /**
   * initial home category.
   *
   * @return Category home category.
   */
  public static Category initialHomeCategory() {
    final Category homeCategory = new Category();
    homeCategory.setName("home");
    homeCategory.setDescription("this is the home category");
    homeCategory.setCreatedTime(ZonedDatetimeUtils.getZonedDatetimeNow());
    homeCategory.setModifiedTime(ZonedDatetimeUtils.getZonedDatetimeNow());
    return homeCategory;
  }

  /**
   * initial feature category.
   *
   * @return Category feature category.
   */
  public static Category initialFeatureCategory() {
    final Category featureCategory = new Category();
    featureCategory.setName("Feature");
    featureCategory.setDescription("this is the feature category");
    featureCategory.setCreatedTime(ZonedDatetimeUtils.getZonedDatetimeNow());
    featureCategory.setModifiedTime(ZonedDatetimeUtils.getZonedDatetimeNow());
    return featureCategory;
  }
}
