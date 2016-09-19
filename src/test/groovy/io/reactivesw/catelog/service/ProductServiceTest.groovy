package io.reactivesw.catelog.service

import io.reactivesw.catelog.domain.Product;
import io.reactivesw.catelog.repository.ProductRepository;

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
    productRepository.findOne(_) >> savedProduct
    productRepository.findProductByCategoryId(_) >> allPoducts
    productService.productRepository = productRepository
  }

  def "test query product by id"(){
    when:
    Product product = productService.queryProductById(10086L)
    then:
    product == savedProduct
  }

  def "test query product by category id"(){
    when:
    List<Product> products = productService.queryProductsByCategoryId(10086L)
    then:
    products == allPoducts
  }
}
