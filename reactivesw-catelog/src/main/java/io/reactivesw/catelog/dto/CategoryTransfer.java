package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Category;
import io.reactivesw.catelog.grpc.infrastructure.CategoryInfo;
import io.reactivesw.catelog.grpc.infrastructure.CategoryList;

import java.util.List;

/**
 * this is transfer class for category.
 * 
 * @author Davis
 *
 */
public final class CategoryTransfer {

  private CategoryTransfer() {}

  /**
   * transfer Category to CategoryInfo.
   * 
   * @param category category
   * @return CategoryInfo
   */
  public static CategoryInfo transferToCategoryInfo(Category category) {
    CategoryInfo.Builder builder = CategoryInfo.newBuilder();
    builder = builder.setDescription(category.getDescription()).setName(category.getName())
        .setId(category.getId()).setDisplayOrder(category.getDisplayOrder());

    if (category.getSubCategories() != null) {
      for (final Category subCategory : category.getSubCategories()) {
        builder = builder.addSubCategoryInfos(transferToCategoryInfo(subCategory));

      }
    }

    return builder.build();
  }

  /**
   * transfer list category to CategoryMap.
   * 
   * @param categories list of category.
   * @return CategoryMap category.
   */
  public static CategoryList transferToCategoryList(List<Category> categories) {
    CategoryList.Builder builder = CategoryList.newBuilder();
    if (categories != null) {
      for (int index = 0; index < categories.size(); index++) {
        builder = builder.addCategoryInfo(transferToCategoryInfo(categories.get(index)));
      }
    }
    return builder.build();
  }
}
