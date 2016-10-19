package io.reactivesw.catalog.application

import io.reactivesw.catalog.domain.entity.Product
import io.reactivesw.catalog.domain.service.CategoryService
import io.reactivesw.catalog.domain.service.ProductService
import io.reactivesw.catalog.infrastructure.exception.NotFoundException
import io.reactivesw.catalog.infrastructure.initial.ProductDataInitial
import spock.lang.Specification

/**
 * Created by Davis on 16/10/9.
 */
class ProductApplicationTest extends Specification{
    def productService = Mock(ProductService)
    def categoryService = Mock(CategoryService)
    def productApplication = new ProductApplication(productService: productService, categoryService: categoryService)
    def categoryId = 1L
    List<Product> allProducts = new ArrayList<Product>();

    def "test query products by category id and category not exist"(){
        given:
        categoryService.existCategory(_) >> false

        when:
        productApplication.queryProductsByCategoryId(categoryId)

        then:
        thrown(NotFoundException)
    }

    def "test query products by category and category is exist"(){
        given:
        categoryService.existCategory(_) >> true
        productService.queryProductsByCategoryId(_) >> allProducts

        when:
        def result = productApplication.queryProductsByCategoryId(categoryId)

        then:
        result == allProducts
    }

    def "test setDefaultSku"(){
        given:
        allProducts = ProductDataInitial.getProducts()
        categoryService.existCategory(_) >> true
        productService.queryProductsByCategoryId(_) >> allProducts

        when:
        def result = productApplication.queryProductsByCategoryId(categoryId)

        then:
        result.get(0).getDefaultSku() != null
        result.get(0).getDefaultSku() == result.get(0).getAdditionalSkus().iterator().next()
    }

    def "test setDefaultSku without additional sku"(){
        given:
        allProducts = ProductDataInitial.getProducts()
        categoryService.existCategory(_) >> true
        productService.queryProductsByCategoryId(_) >> allProducts

        when:
        def result = productApplication.queryProductsByCategoryId(categoryId)

        then:
        result.get(0).getDefaultSku() != null
        result.get(0).getDefaultSku() == result.get(0).getAdditionalSkus().iterator().next()
    }
}
