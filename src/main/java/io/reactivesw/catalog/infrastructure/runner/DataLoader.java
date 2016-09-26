package io.reactivesw.catalog.infrastructure.runner;

import io.reactivesw.catalog.domain.entity.Category;
import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.domain.entity.Product;
import io.reactivesw.catalog.infrastructure.repository.CategoryRepository;
import io.reactivesw.catalog.infrastructure.repository.MediaRepository;
import io.reactivesw.catalog.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Davis on 16/9/23.
 */
//@Component
public class DataLoader implements ApplicationRunner {

  /**
   * category repository.
   */
  @Autowired
  private transient CategoryRepository categoryRepository;

  /**
   * media repository.
   */
  @Autowired
  private transient MediaRepository mediaRepository;

  /**
   * product repository.
   */
  @Autowired
  private transient ProductRepository productRepository;

  /**
   * run when system setup.
   *
   * @param args args.
   * @throws Exception exception.
   */
  @Override
  public void run(ApplicationArguments args) {
    //initial media.
    initialMedia();
    //initial category.
    final Category category = initialCategory();
    //initial product.
    final Product product = initialProduct();
    //add product to category.
    addProductToCategory(category, product);
  }

  /**
   * add product to category.
   *
   * @param category category
   * @param product  product
   */
  private void addProductToCategory(Category category, Product product) {
//    Set<Product> products = new HashSet<>();
//    products.add(product);
//    category.setProducts(products);
//    categoryRepository.save(category);
    product.setCategory(category);
    productRepository.save(product);
  }

  /**
   * initial media.
   */
  private void initialMedia() {
    final List<Media> medias = mediaRepository.findAll();
    if (medias == null || medias.isEmpty()) {
      final Media media = MediaDataInitial.initialMedia();
      mediaRepository.save(media);
    }
  }

  /**
   * initial category.
   */
  private Category initialCategory() {
    final List<Category> categories = categoryRepository.findAll();
    Category homeCategory = null;
    if (categories == null || categories.isEmpty()) {
      homeCategory = CategoryDataInitial.initialHomeCategory();
      final Category featureCategory = CategoryDataInitial.initialFeatureCategory();
      final List<Category> categoryList = new ArrayList<>();
      categoryList.add(homeCategory);
      categoryList.add(featureCategory);
      categoryRepository.save(categoryList);
    } else {
      homeCategory = categories.get(0);
    }
    return homeCategory;
  }

  /**
   * initial product.
   */
  private Product initialProduct() {
    final List<Product> products = productRepository.findAll();
    Product savedProduct = new Product();
    if (products == null || products.isEmpty()) {
      final Product product = ProductDataInitial.initialProduct();
      savedProduct = productRepository.save(product);
    }
    return savedProduct;
  }
}
