package io.reactivesw.catelog.dto

import spock.lang.Specification
import io.reactivesw.catelog.domain.Category
import io.reactivesw.catelog.infrastructure.CategoryList;
import io.reactivesw.catelog.infrastructure.GrpcCategory;

class CategoryTransferTest extends Specification {
  Category category = null;
  Category firstSubCategory = null;
  Category secondSubCategory = null;
  Category grandsonCategory = null;
  Set<Category> grandsonCategorys = null;
  Set<Category> subCategories = null;

  def setup() {
    category = new Category();
    firstSubCategory = new Category();
    secondSubCategory = new Category();
    grandsonCategory = new Category();

    category.setId(1001L);
    category.setName("Feature");
    category.setDescription("this is feature product");
    category.setCreateTime(new Date());
    category.setLastModifiedTime(new Date());
    category.setDisplayOrder(0);
    category.setDisplayed(true);
    category.setDepth(0);

    firstSubCategory.setId(2002L);
    firstSubCategory.setName("Feature T-Shirt");
    firstSubCategory.setDescription("this is feature T-Shirt product");
    firstSubCategory.setCreateTime(new Date());
    firstSubCategory.setLastModifiedTime(new Date());
    firstSubCategory.setDisplayOrder(0);
    firstSubCategory.setDisplayed(true);
    firstSubCategory.setDepth(category.getDepth() + 1);

    grandsonCategory.setId(3001L);
    grandsonCategory.setName("grandsonCategoryName");
    grandsonCategory.setDescription("this is new feature product");
    grandsonCategory.setCreateTime(new Date());
    grandsonCategory.setLastModifiedTime(new Date());
    grandsonCategory.setDisplayOrder(0);
    grandsonCategory.setDisplayed(true);
    grandsonCategory.setDepth(firstSubCategory.getDepth() + 1);

    grandsonCategorys = new HashSet<Category>();
    grandsonCategorys.add(grandsonCategory);
    firstSubCategory.setSubCategories(grandsonCategorys);

    secondSubCategory.setName("Feature Shirt");
    secondSubCategory.setDescription("this is feature Shirt product");
    secondSubCategory.setCreateTime(new Date());
    secondSubCategory.setLastModifiedTime(new Date());
    secondSubCategory.setDisplayOrder(1);
    secondSubCategory.setDisplayed(true);
    secondSubCategory.setDepth(category.getDepth() + 1);

    subCategories = new HashSet<Category>();
    subCategories.add(firstSubCategory);
    subCategories.add(secondSubCategory);

    category.setSubCategories(subCategories);
  }

  def "test transfer to GrpcCategory"(){
    when:
    CategoryTransfer categoryTransfer = new CategoryTransfer();
    GrpcCategory grpcCategory = CategoryTransfer.transferToCategoryInfo(category);

    then:
    grpcCategory.getName() == category.getName();
    grpcCategory.getId() == category.getId();
    grpcCategory.getDescription() == category.getDescription();
    grpcCategory.getSubCategoryCount() == category.getSubCategories().size();
  }

  def "test transfer to CategoryList"(){
    when: "test sub categories"
    CategoryList categories = CategoryTransfer.transferToCategoryList(subCategories);
    then:
    categories.getCategoryCount() == subCategories.size();

    when: "test new hashset without nothing"
    categories = CategoryTransfer.transferToCategoryList(new HashSet<Category>());
    then:
    categories.getCategoryCount() == 0;

    when:"test null"
    categories = CategoryTransfer.transferToCategoryList(null);
    then:
    categories.getCategoryCount() == 0;
  }
}
