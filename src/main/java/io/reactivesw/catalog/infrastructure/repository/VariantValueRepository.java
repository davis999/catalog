package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.VariantValue;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * this is repository interface for variant value.
 * @author Davis
 *
 */
@Repository("variantValueRepository")
public interface VariantValueRepository extends CrudRepository<VariantValue, Long> {

}
