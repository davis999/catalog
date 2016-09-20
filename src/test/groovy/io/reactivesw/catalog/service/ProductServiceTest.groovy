package io.reactivesw.catalog.service

import io.reactivesw.catalog.exception.CatalogRuntimeException
import io.reactivesw.catalog.service.ProductServiceImpl;
import io.reactivesw.catalog.domain.Product;
import io.reactivesw.catalog.repository.ProductRepository;

import java.util.List;
import java.util.Set;

import spock.lang.Specification;

class ProductServiceTest extends Specification{

  ProductServiceImpl productService = new ProductServiceImpl();
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
    thrown(CatalogRuntimeException)
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
    productService.queryProductsByCategoryId(10086L)

    then:
    thrown(CatalogRuntimeException)
  }

  def "test query product by category id and get empty list"(){
    given:
    productRepository.findProductByCategoryId(_) >> new ArrayList<Product>()

    when:
    productService.queryProductsByCategoryId(10086L)

    then:
    thrown(CatalogRuntimeException)
  }
}
