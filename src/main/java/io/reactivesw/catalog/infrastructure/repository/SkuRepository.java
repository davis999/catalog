package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Sku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * this is repository interface for sku.
 * @author Davis
 *
 */
public interface SkuRepository extends JpaRepository<Sku, Long> {

}
