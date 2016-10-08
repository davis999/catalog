package io.reactivesw.catalog.service

import io.reactivesw.catalog.domain.service.CategoryService
import io.reactivesw.catalog.infrastructure.exception.NotFoundException
import io.reactivesw.catalog.infrastructure.repository.CategoryRepository
import io.reactivesw.catalog.domain.entity.Category

import spock.lang.Specification

import java.time.ZoneOffset
import java.time.ZonedDateTime

class CategoryServiceTest extends Specification {

    CategoryService categoryService = new CategoryService();
    CategoryRepository categoryRepository = Mock();
    Category savedCategory = new Category();
    List<Category> allCategories = new ArrayList<Category>();
    Set<Category> categorySet = new HashSet<Category>();

    def setup() {
        ZonedDateTime createdTime = ZonedDateTime.now(ZoneOffset.UTC)
        savedCategory.setId(10086L);
        savedCategory.setName("Feature");
        savedCategory.setDescription("this is feature product");
        savedCategory.setCreatedTime(createdTime);
        savedCategory.setModifiedTime(createdTime);
        savedCategory.setDisplayOrder(0);

        allCategories.add(savedCategory);
        categorySet.add(savedCategory);

        categoryRepository.save(_) >> savedCategory
        categoryRepository.findCategoryByName(_) >> categorySet;
        categoryService.categoryRepository = categoryRepository;
    }

    def "test add category"() {
        given:
        ZonedDateTime createdTime = ZonedDateTime.now(ZoneOffset.UTC)
        Category category = new Category();
        category.setName("Feature");
        category.setDescription("this is feature product");
        category.setCreatedTime(createdTime);
        category.setModifiedTime(createdTime);
        category.setDisplayOrder(0);

        when: "save category"
        Category categorySaved = categoryService.saveCategory(category);

        then:
        categorySaved == savedCategory;
    }

    def "test find a category by id"() {
        given:
        categoryRepository.findOne(_) >> savedCategory;

        when:
        Category category = categoryService.findCategoryById(10086L);
        then:
        category == savedCategory
        category.getId() == savedCategory.getId()
    }

    def "test find a category by id and no result"() {
        given:
        categoryRepository.findOne(_) >> null

        when:
        categoryService.findCategoryById(10086L)

        then:
        thrown(NotFoundException)
    }

    def "test find a category by name"() {
        when:
        Set<Category> categories = categoryService.findCategoryByName("category");
        then:
        categories == categorySet;
        categories.size() == categorySet.size()
    }

    def "test find all categories"() {
        given:
        categoryRepository.findAllCategoryByOrderByDisplayOrderAsc() >> allCategories
        when:
        List<Category> categories = categoryService.findAllCategories()
        then:
        categories == allCategories;
        categories.size() == allCategories.size()
    }

    def "test find all categories and get null"(){
        given:
        categoryRepository.findAll() >> null

        when:
        categoryService.findAllCategories()

        then:
        thrown(NotFoundException)
    }

    def "test find all categories and get empty result"(){
        given:
        categoryRepository.findAll() >> new ArrayList<Category>()

        when:
        categoryService.findAllCategories()

        then:
        thrown(NotFoundException)
    }
}
