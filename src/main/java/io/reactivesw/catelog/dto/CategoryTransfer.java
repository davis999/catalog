package io.reactivesw.catelog.dto;

import io.reactivesw.catelog.domain.Category;
import io.reactivesw.catelog.infrastructure.CategoryList;
import io.reactivesw.catelog.infrastructure.GrpcCategory;

import org.modelmapper.ModelMapper;

import java.util.Set;

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
    final ModelMapper modelMapper = new ModelMapper();
    GrpcCategory.Builder builder = modelMapper.map(category, GrpcCategory.Builder.class);

    if (category.getSubCategories() != null) {
      for (final Category subCategory : category.getSubCategories()) {
        builder = builder.addSubCategory(transferToCategoryInfo(subCategory));
      }
    }

    return builder.build();
  }

  /**
   * transfer list category to CategoryList.
   * 
   * @param categories set of category.
   * @return CategoryList
   */
  public static CategoryList transferToCategoryList(Set<Category> categories) {
    CategoryList.Builder builder = CategoryList.newBuilder();
    if (categories != null) {
      for (final Category category : categories) {
        builder = builder.addCategory(transferToCategoryInfo(category));
      }
    }
    return builder.build();
  }
}
