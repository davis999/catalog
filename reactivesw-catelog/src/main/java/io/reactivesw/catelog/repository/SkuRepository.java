package io.reactivesw.catelog.repository;

import io.reactivesw.catelog.domain.Sku;

import org.springframework.data.repository.CrudRepository;

/**
 * this is repository interface for sku.
 * @author Davis
 *
 */
public interface SkuRepository extends CrudRepository<Sku, Long> {

}
