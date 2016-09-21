package io.reactivesw.catalog.infrastructure.dto;

import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.grpc.CategoryList;
import io.reactivesw.catalog.grpc.GrpcCategory;

import org.modelmapper.ModelMapper;

import java.util.List;

/**
 * this is transfer class for category.
 *
 * @author Davis
 */
public final class CategoryTransfer {

  private CategoryTransfer() {
  }

  /**
   * transfer Category to GrpcCategory.
   *
   * @param category category
   * @return GrpcCategory
   */
  public static GrpcCategory transferToCategoryInfo(Category category) {
    final ModelMapper modelMapper = new ModelMapper();
    final GrpcCategory.Builder builder = modelMapper.map(category, GrpcCategory.Builder.class);
    return builder.build();
  }

  /**
   * transfer list category to CategoryList.
   *
   * @param categories set of category.
   * @return CategoryList
   */
  public static CategoryList transferToCategoryList(List<Category> categories) {
    final CategoryList.Builder builder = CategoryList.newBuilder();
    if (categories != null) {
      for (final Category category : categories) {
        builder.addCategory(transferToCategoryInfo(category));
      }
    }
    return builder.build();
  }
}
