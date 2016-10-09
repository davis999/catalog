package io.reactivesw.catalog.service

import io.reactivesw.catalog.domain.service.ProductService

import io.reactivesw.catalog.domain.entity.Product
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.repository.ProductRepository
import spock.lang.Specification;

class ProductServiceTest extends Specification{

  ProductService productService = new ProductService();
  ProductRepository productRepository = Mock();
  Product savedProduct = new Product();
  List<Product> allPoducts = new ArrayList<Product>();
  Set<Product> productSet = new HashSet<Product>();

  def setup(){
    allPoducts.add(savedProduct);
    productService.productRepository = productRepository
  }

  def "test query product by id"(){
    given:
    productRepository.findOne(_) >> savedProduct
    when:
    Product product = productService.queryProductById(10086L)
    then:
    product == savedProduct
  }

  def "test query product by id and no result"(){
    given:
    productRepository.findOne(_) >> null

    when:
    productService.queryProductById(10086L)

    then:
    thrown(NotFoundException)
  }

  def "test query product by category id"(){
    given:
    productRepository.findProductByCategoryId(_) >> allPoducts
    when:
    List<Product> products = productService.queryProductsByCategoryId(10086L)
    then:
    products == allPoducts
  }

  def "test query product by category id and get null result"(){
    given:
    productRepository.findProductByCategoryId(_) >> null

    when:
    List<Product> products = productService.queryProductsByCategoryId(10086L)

    then:
    products != null
    products.size() == 0
  }

  def "test query product by category id and get empty list"(){
    given:
    productRepository.findProductByCategoryId(_) >> new ArrayList<Product>()

    when:
    List<Product> products = productService.queryProductsByCategoryId(10086L)

    then:
    products != null
    products.size() == 0
  }
}
