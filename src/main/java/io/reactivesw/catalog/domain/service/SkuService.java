package io.reactivesw.catalog.domain.service;

import io.reactivesw.catalog.domain.entity.Sku;
import io.reactivesw.catalog.infrastructure.exception.NotFoundException;
import io.reactivesw.catalog.infrastructure.exception.NullParameterException;
import io.reactivesw.catalog.infrastructure.exception.SkuNotActiveException;
import io.reactivesw.catalog.infrastructure.repository.SkuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * this is service class for sku.
 * Created by Davis on 16/9/26.
 */
@Service("skuService")
public class SkuService {
  /**
   * log.
   */
  private static final Logger LOG = LoggerFactory.getLogger(SkuService.class);

  /**
   * sku repository.
   */
  @Autowired
  private transient SkuRepository skuRepository;

  /**
   * query inventory by sku id.
   *
   * @param skuId sku id.
   * @return int sku inventory.
   */
  public int queryQuantity(long skuId) {
    LOG.debug("query sku quantity by it's id {}.", skuId);
    final Sku sku = skuRepository.findOne(skuId);
    if (sku == null) {
      LOG.debug("can not find sku with id {}.", skuId);
      throw new NotFoundException("sku is not exist.");
    } else if (!sku.isActived()) {
      LOG.debug("sku is not active, id is {}.", skuId);
      throw new SkuNotActiveException("sku is not active");
    }
    final int quantity = sku.getQuantity();
    LOG.debug("end query sku quantity, id is {}, quantity is {}", skuId, quantity);
    return quantity;
  }

  /**
   * query sku by sku id.
   *
   * @param skuId id of sku
   * @return Sku Sku
   */
  public Sku querySkuById(long skuId) {
    LOG.debug("query sku by id {}.", skuId);
    final Sku sku = skuRepository.findOne(skuId);

    if (sku == null) {
      LOG.debug("can not find sku with id {}.", skuId);
      throw new NotFoundException("sku is not exist.");
    } else if (!sku.isActived()) {
      LOG.debug("sku is not active, id is {}.", skuId);
      throw new SkuNotActiveException("sku is not active");
    }

    LOG.debug("end query sku, get sku: {}", sku.toString());
    return sku;
  }

  /**
   * query list of sku by ids.
   *
   * @param skuIds list of id.
   * @return list of sku.
   */
  public List<Sku> queryListSku(List<Long> skuIds) {
    if (skuIds == null || skuIds.isEmpty()) {
      LOG.debug("query list sku with null id");
      throw new NullParameterException("sku id is null");
    }
    List<Sku> skus = skuRepository.findAll(skuIds);
    //remove not active sku.
    return removeNotActiveSku(skus);
  }

  /**
   * query sku by sku number.
   * @param number sku number
   * @return sku
   */
  public Sku querySkuByNumber(String number){
    LOG.debug("enter querySkuByNumber, sku number is {}.", number);
    Sku sku = skuRepository.findOneBySkuNumber(number);
    if (sku == null) {
      LOG.debug("can not find any sku by number {}.", number);
      throw new NotFoundException("Sku is not exist");
    }
    LOG.debug("end querySkuByNumber");
    return sku;
  }

  /**
   * remove not active sku.
   *
   * @param skus list of sku.
   * @return list of sku.
   */
  private List<Sku> removeNotActiveSku(List<Sku> skus) {
    final List<Sku> removedSkus = new ArrayList<>();
    if (skus != null) {
      LOG.debug("start remove not active sku, {} skus.", skus.size());
      for (Sku sku : skus) {
        if (sku.isActived()) {
          removedSkus.add(sku);
        }
      }
    }
    LOG.debug("end remove not active sku, get {} active skus.", removedSkus.size());
    return removedSkus;
  }
}
