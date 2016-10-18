package io.reactivesw.catalog.infrastructure.mapper

import io.reactivesw.catalog.domain.entity.Category
import io.reactivesw.catalog.grpc.CategoryList
import io.reactivesw.catalog.grpc.GrpcCategory
import spock.lang.Specification

import java.time.ZoneOffset
import java.time.ZonedDateTime

class CategoryMapperTest extends Specification {
  Category category
  Category annothreCategory
  List<Category> categories

  def setup() {
    category = new Category()
    annothreCategory = new  Category()
    ZonedDateTime createdTime = ZonedDateTime.now(ZoneOffset.UTC)
    category.setId(1001L);
    category.setName("Feature");
    category.setDescription("this is feature product");
    category.setCreatedTime(createdTime);
    category.setModifiedTime(createdTime);
    category.setDisplayOrder(0);

    annothreCategory.setId(2002L);
    annothreCategory.setName("Feature T-Shirt");
    annothreCategory.setDescription("this is feature T-Shirt product");
    annothreCategory.setCreatedTime(createdTime);
    annothreCategory.setModifiedTime(createdTime);
    annothreCategory.setDisplayOrder(1);

    categories = new ArrayList<Category>()
    categories.add(category);
    categories.add(annothreCategory);

  }

  def "test transfer to GrpcCategory"(){
    when:
    CategoryMapper categoryTransfer = new CategoryMapper();
    GrpcCategory grpcCategory = CategoryMapper.transferToCategoryInfo(category);

    then:
    grpcCategory.getName() == category.getName();
    grpcCategory.getId() == category.getId();
  }

  def "test transfer to CategoryList"(){
    when: "test sub categories"
    CategoryList categoryList = CategoryMapper.transferToCategoryList(categories);
    then:
    categoryList.getCategoryCount() == categories.size();

    when: "test new hashset without nothing"
    categoryList = CategoryMapper.transferToCategoryList(new ArrayList<Category>());
    then:
    categoryList.getCategoryCount() == 0;

    when:"test null"
    categoryList = CategoryMapper.transferToCategoryList(null);
    then:
    categoryList.getCategoryCount() == 0;
  }
}
