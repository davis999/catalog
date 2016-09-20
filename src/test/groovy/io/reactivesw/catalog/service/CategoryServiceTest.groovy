package io.reactivesw.catalog.service

import io.reactivesw.catalog.exception.CatalogRuntimeException
import io.reactivesw.catalog.repository.CategoryRepository
import javafx.beans.binding.When
import org.mockito.internal.matchers.Null

import java.util.List

import io.reactivesw.catalog.service.CategoryServiceImpl;
import io.reactivesw.catalog.domain.Category

import spock.lang.Specification

class CategoryServiceTest extends Specification{

  CategoryServiceImpl categoryService = new CategoryServiceImpl();
  CategoryRepository categoryRepository = Mock();
  Category savedCategory = new Category();
  List<Category> allCategories = new ArrayList<Category>();
  Set<Category> categorySet = new HashSet<Category>();

  def setup(){
    savedCategory.setId(10086L);
    savedCategory.setName("Feature");
    savedCategory.setDescription("this is feature product");
    savedCategory.setCreateTime(new Date());
    savedCategory.setLastModifiedTime(new Date());
    savedCategory.setDisplayOrder(0);
    savedCategory.setDepth(0);

    allCategories.add(savedCategory);
    categorySet.add(savedCategory);

    categoryRepository.save(_) >> savedCategory
    categoryRepository.findCategoryByName(_) >> categorySet;
    categoryRepository.findAll() >> allCategories
    categoryService.categoryRepository = categoryRepository;
  }

  def "test add category"(){
    given:
    Category category = new Category();
    category.setName("Feature");
    category.setDescription("this is feature product");
    category.setCreateTime(new Date());
    category.setLastModifiedTime(new Date());
    category.setDisplayOrder(0);
    category.setDepth(0);

    when: "save category"
    Category categorySaved = categoryService.saveCategory(category);

    then:
    categorySaved == savedCategory;
  }

  def "test find a category by id"(){
    given:
    categoryRepository.findOne(_) >> savedCategory;

    when:
    Category category = categoryService.findCategoryById(10086L);
    then:
    category == savedCategory
    category.getId() == savedCategory.getId()
  }

  def "test find a category by id and no result"(){
    given:
    categoryRepository.findOne(_) >> null

    when:
    categoryService.findCategoryById(10086L)

    then:
    thrown(CatalogRuntimeException)
  }
  
  def "test find a category by name"(){
    when:
    Set<Category> categories = categoryService.findCategoryByName("category");
    then:
    categories == categorySet;
    categories.size() == categorySet.size()
  }

  def "test find top categories"(){
    given:
    categoryRepository.findCategoryByDepth(_) >> categorySet;
    when:
    Set<Category> categories = categoryService.findAllTopCategories();
    then:
    categories == categorySet;
    categories.size() == categorySet.size()
  }

  def "test find top categories and no result"(){
    given:
    categoryRepository.findCategoryByDepth(_) >> null

    when:
    categoryService.findAllTopCategories();

    then:
    thrown(CatalogRuntimeException)
   }

  def "test find top categories and get empty set"(){
    given:
    categoryRepository.findCategoryByDepth(_) >> new HashSet<Category>()

    when:
    categoryService.findAllTopCategories();

    then:
    thrown(CatalogRuntimeException)
  }
  
  def "test find all categories"(){
    when:
    List<Category> categories = categoryService.findAllCategories();
    then:
    categories == allCategories;
    categories.size() == allCategories.size()
  }
}
