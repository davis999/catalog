package io.reactivesw.catalog.rpcserver

import com.google.protobuf.Int64Value

import io.grpc.StatusRuntimeException
import io.grpc.stub.StreamObserver
import io.reactivesw.catalog.domain.Attribute
import io.reactivesw.catalog.domain.AttributeValue
import io.reactivesw.catalog.domain.Feature
import io.reactivesw.catalog.domain.Media
import io.reactivesw.catalog.domain.Product
import io.reactivesw.catalog.domain.Sku
import io.reactivesw.catalog.exception.CatalogRuntimeException
import io.reactivesw.catalog.service.ProductService

import spock.lang.Specification

class ProductRpcServerTest extends Specification{
  def productService = Mock(ProductService)
  def productRpcServer = new ProductRpcServer(productService:productService)
  Set<Product> products
  def product
  Sku sku
  Media media
  def inputData
  def outputData

  def setup(){
    inputData = Int64Value.newBuilder().setValue(10086L).build()
    outputData = Mock(StreamObserver)
    
    product = new Product();
    product.setId(1L);
    product.setName("product");
    product.setBrand("brand");
    product.setDisplayed(true);
    product.setDescription("this is a product");
    product.setDetail("this is product detail");
    product.setManufacturer("product manufacturer");
    product.setModel("product model");

    sku = new Sku();
    sku.setPrice(new BigDecimal(19.99));
    sku.setSkuNumber("sku number");
    sku.setUpc("sku upc");

    media = new Media();
    media.setUrl("/usr/product/0001/0001.jpg");
    media.setTitle("product main");
    media.setType("main");

    Set<Media> medias = new HashSet<Media>();
    medias.add(media);
    sku.setMedias(medias);

    Set<Sku> skus = new HashSet<Sku>();
    skus.add(sku);
    product.setSkus(skus);

    Feature feature = new Feature();
    feature.setId(10086L);
    feature.setDisplayOrder(11);
    feature.setName("feature for product");
    feature.setDescription("this is product feature");

    Set<Feature> features = new HashSet<Feature>();
    features.add(feature);
    product.setFeatures(features);

    Attribute attribute = new Attribute();
    attribute.setId(10010L);
    attribute.setName("product attribute");
    attribute.setDescription("this is product attribute");
    attribute.setDisplayOrder(101);
    attribute.setType("String");

    AttributeValue attributeValue = new AttributeValue();
    attributeValue.setId(10000L);
    attributeValue.setValue("the true value of attribute");
    attributeValue.setAttribute(attribute);

    Set<AttributeValue> attributeValues = new HashSet<AttributeValue>();
    attributeValues.add(attributeValue);
    product.setAttributeValues(attributeValues);
    product.setDefaultSku(sku);
  }

  def "test query products by category id"(){
    given:
    productService.queryProductsByCategoryId(_) >> products

    when:
    productRpcServer.getProductsByCategory(inputData, outputData)
    then:
    noExceptionThrown()
  }

  def "test query products by category id and no result"(){
    given:
    productService.queryProductsByCategoryId(_) >> {throw new CatalogRuntimeException()}

    when:
    productRpcServer.getProductsByCategory(inputData, outputData)
    then:
    thrown(StatusRuntimeException)
  }

  def "test query product by product id"(){
    given:
    productService.queryProductById(_) >> product

    when:
    productRpcServer.getProductDetial(inputData, outputData)

    then:
    noExceptionThrown()
  }
  
  def "test query product by product id and no result return"(){
    given:
    productService.queryProductById(_) >> {throw new CatalogRuntimeException()}

    when:
    productRpcServer.getProductDetial(inputData, outputData)

    then:
    thrown(StatusRuntimeException)
  }
}
