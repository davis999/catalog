package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Attribute;

import org.springframework.data.repository.CrudRepository;

/**
 * this is repository interface for attribute.
 * @author Davis
 *
 */
public interface AttributeRepository extends CrudRepository<Attribute, Long> {

}
