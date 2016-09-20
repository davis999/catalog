package io.reactivesw.catalog.repository;

import io.reactivesw.catalog.domain.Attribute;

import org.springframework.data.repository.CrudRepository;

/**
 * this is repository interface for attribute.
 * @author Davis
 *
 */
public interface AttributeRepository extends CrudRepository<Attribute, Long> {

}
