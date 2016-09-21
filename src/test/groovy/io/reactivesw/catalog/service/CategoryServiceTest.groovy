package io.reactivesw.catalog.service

import io.reactivesw.catalog.domain.service.CategoryServiceImpl
import io.reactivesw.catalog.infrastructure.exception.CatalogRuntimeException
import io.reactivesw.catalog.infrastructure.repository.CategoryRepository
import io.reactivesw.catalog.domain.entity.Category

import spock.lang.Specification

class CategoryServiceTest extends Specification {

    CategoryServiceImpl categoryService = new CategoryServiceImpl();
    CategoryRepository categoryRepository = Mock();
    Category savedCategory = new Category();
    List<Category> allCategories = new ArrayList<Category>();
    Set<Category> categorySet = new HashSet<Category>();

    def setup() {
        savedCategory.setId(10086L);
        savedCategory.setName("Feature");
        savedCategory.setDescription("this is feature product");
        savedCategory.setCreatedTime(new Date());
        savedCategory.setModifiedTime(new Date());
        savedCategory.setDisplayOrder(0);

        allCategories.add(savedCategory);
        categorySet.add(savedCategory);

        categoryRepository.save(_) >> savedCategory
        categoryRepository.findCategoryByName(_) >> categorySet;
        categoryRepository.findAll() >> allCategories
        categoryService.categoryRepository = categoryRepository;
    }

    def "test add category"() {
        given:
        Category category = new Category();
        category.setName("Feature");
        category.setDescription("this is feature product");
        category.setCreatedTime(new Date());
        category.setModifiedTime(new Date());
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
        thrown(CatalogRuntimeException)
    }

    def "test find a category by name"() {
        when:
        Set<Category> categories = categoryService.findCategoryByName("category");
        then:
        categories == categorySet;
        categories.size() == categorySet.size()
    }

    def "test find all categories"() {
        when:
        List<Category> categories = categoryService.findAllCategories();
        then:
        categories == allCategories;
        categories.size() == allCategories.size()
    }
}
