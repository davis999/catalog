package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Category;
import io.reactivesw.catelog.infrastructure.CategoryList;
import io.reactivesw.catelog.infrastructure.GrpcCategory;

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
   * transfer Category to GrpcCategory.
   * 
   * @param category category
   * @return GrpcCategory
   */
  public static GrpcCategory transferToCategoryInfo(Category category) {
    GrpcCategory.Builder builder = GrpcCategory.newBuilder();
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
   * transfer list category to CategoryList.
   * 
   * @param categories list of category.
   * @return CategoryList
   */
  public static CategoryList transferToCategoryList(List<Category> categories) {
    CategoryList.Builder builder = CategoryList.newBuilder();
    if (categories != null) {
      for (int index = 0; index < categories.size(); index++) {
        builder = builder.addCategory(transferToCategoryInfo(categories.get(index)));
      }
    }
    return builder.build();
  }
}
