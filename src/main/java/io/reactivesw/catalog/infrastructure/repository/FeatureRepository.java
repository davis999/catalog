package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Feature;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * this is repository interface for feature.
 * @author Davis
 *
 */
@Repository("featureRepository")
public interface FeatureRepository extends CrudRepository<Feature, Long> {

}
