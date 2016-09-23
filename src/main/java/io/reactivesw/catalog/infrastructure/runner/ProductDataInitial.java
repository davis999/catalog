package io.reactivesw.catalog.infrastructure.runner;

import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.infrastructure.utils.ZonedDatetimeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Product Data Loader.
 * Created by Davis on 16/9/23.
 */
public final class ProductDataInitial {

  /**
   * private constructor.
   */
  private ProductDataInitial(){}

  /**
   * initial product.
   *
   * @return Product.
   */
  public static Product initialProduct() {
    final Product product = new Product();

    product.setName("product");
    product.setBrand("brand");
    product.setDisplayed(true);
    product.setDescription("this is a product");
    product.setDetail("this is product detail");
    product.setManufacturer("product manufacturer");
    product.setModel("product model");
    product.setCreatedTime(ZonedDatetimeUtils.getZonedDatetimeNow());
    product.setModifiedTime(ZonedDatetimeUtils.getZonedDatetimeNow());

    final Sku defaultSku = SkuDataInitial.initialSku();
    defaultSku.setDefaultProduct(product);
    product.setDefaultSku(defaultSku);

    final Sku sku = SkuDataInitial.initialSku();
    sku.setProduct(product);
    final List<Sku> skus = new ArrayList<>();
    skus.add(sku);

    product.setAdditionalSkus(skus);

    return product;
  }
}
