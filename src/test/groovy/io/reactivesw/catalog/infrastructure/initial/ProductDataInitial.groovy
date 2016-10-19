package io.reactivesw.catalog.infrastructure.initial

import io.reactivesw.catalog.domain.entity.Attribute
import io.reactivesw.catalog.domain.entity.AttributeValue
import io.reactivesw.catalog.domain.entity.Feature
import io.reactivesw.catalog.domain.entity.Media
import io.reactivesw.catalog.domain.entity.Product
import io.reactivesw.catalog.domain.entity.Sku

/**
 * Created by Davis on 16/10/19.
 */
class ProductDataInitial {
    public static List<Product> getProducts(){
        List<Product> products = new ArrayList<>()
        products.add(getProduct())
        products.add(getProductWithoutAdditionalSku())
        return products
    }

    public static Product getProduct(){
        Product product = new Product();
        product.setId(1L);
        product.setName("product");
        product.setBrand("brand");
        product.setDisplayed(true);
        product.setDescription("this is a product");
        product.setDetail("this is product detail");
        product.setManufacturer("product manufacturer");
        product.setModel("product model");

        Sku sku = new Sku();
        def price = "19.99"
        sku.setPrice(new BigDecimal(price));
        sku.setSkuNumber("sku number");
        sku.setUpc("sku upc");

        Media media = new Media();
        media.setUrl("/usr/product/0001/0001.jpg");
        media.setTitle("product main");
        media.setType("main");

        Set<Media> medias = new HashSet<Media>();
        medias.add(media);
        sku.setMedias(medias);

        Set<Sku> skus = new HashSet<>();
        skus.add(sku);
        product.setAdditionalSkus(skus);

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
        product.setAttributeValues(attributeValues)

        return product
    }
    static Product getProductWithoutAdditionalSku(){
        Product product = new Product();
        product.setId(1L);
        product.setName("product");
        product.setBrand("brand");
        product.setDisplayed(true);
        product.setDescription("this is a product");
        product.setDetail("this is product detail");
        product.setManufacturer("product manufacturer");
        product.setModel("product model");

        Sku sku = new Sku();
        def price = "19.99"
        sku.setPrice(new BigDecimal(price));
        sku.setSkuNumber("sku number");
        sku.setUpc("sku upc");

        Media media = new Media();
        media.setUrl("/usr/product/0001/0001.jpg");
        media.setTitle("product main");
        media.setType("main");

        product.setDefaultSku(sku);

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
        product.setAttributeValues(attributeValues)

        return product
    }
}
