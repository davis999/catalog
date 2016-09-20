package io.reactivesw.catalog.dto

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType
import io.reactivesw.catalog.dto.ProductTransfer;
import io.reactivesw.catalog.domain.Attribute
import io.reactivesw.catalog.domain.AttributeValue
import io.reactivesw.catalog.domain.Feature
import io.reactivesw.catalog.domain.Media
import io.reactivesw.catalog.domain.Product
import io.reactivesw.catalog.domain.Sku
import io.reactivesw.catalog.infrastructure.GrpcProduct
import io.reactivesw.catalog.infrastructure.GrpcProductBrief
import io.reactivesw.catalog.infrastructure.ProductBriefList;

import java.util.List;

import spock.lang.Specification

class ProductTransferTest extends Specification{
  Product product = null;
  Sku sku = null;
  Media media = null;

  def setup(){
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

  def "test transfer to product brief"(){
    when:
    ProductTransfer productTransfer = new ProductTransfer();
    GrpcProductBrief grpcProductBrief = ProductTransfer.transferToGrpcProductBrief(product);
    then:
    grpcProductBrief.getId() == product.getId();
    grpcProductBrief.getPrice() == product.getSkus().iterator().next().getPrice().toString();
    grpcProductBrief.getName() == product.getName();
    grpcProductBrief.getDisplayOrder() == product.getDisplayOrder();
    grpcProductBrief.getMediaURL() == product.getSkus().iterator().next().getMedias().iterator().next().getUrl();
  }

  def "test transfer to GrpcProduct"(){
    when:
    GrpcProduct grpcProduct = ProductTransfer.transferToGrpcProduct(product);
    then:
    grpcProduct.getId() == product.getId();
    grpcProduct.getName() == product.getName();
    grpcProduct.getManufacturer() == product.getManufacturer();
    grpcProduct.getModel() == product.getModel();
    grpcProduct.getBrand() == product.getBrand();
    grpcProduct.getDescription() == product.getDescription();
    grpcProduct.getDetail() == product.getDetail();
    grpcProduct.getSkuCount() == product.getSkus().size();
    grpcProduct.getFeatureCount() == product.getFeatures().size();
    grpcProduct.getAttributeCount() == product.getAttributeValues().size();
  }

  def "test transfer to ProductBriefList"(){
    given:
    List<Product> products = new ArrayList<Product>();
    products.add(product);
    products.add(product);

    when:"test list of product"
    ProductBriefList productBriefs = ProductTransfer.transferToProductBriefList(products);

    then:
    productBriefs.getProductBriefCount() == products.size();

    when:"test null list"
    products = null;
    productBriefs = ProductTransfer.transferToProductBriefList(products);

    then:
    productBriefs.getProductBriefCount() == 0;

    when:"test new list with nothing"
    products = new ArrayList<Product>();
    productBriefs = ProductTransfer.transferToProductBriefList(products);

    then:
    productBriefs.getProductBriefCount() == 0;
  }
}
