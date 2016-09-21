package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Sku;

import org.springframework.data.repository.CrudRepository;

/**
 * this is repository interface for sku.
 * @author Davis
 *
 */
public interface SkuRepository extends CrudRepository<Sku, Long> {

}
