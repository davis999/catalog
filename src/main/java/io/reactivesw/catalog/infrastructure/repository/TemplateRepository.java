package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Template;

import org.springframework.data.repository.CrudRepository;

/**
 * this is repository interface for template.
 * @author Davis
 *
 */
public interface TemplateRepository extends CrudRepository<Template, Long> {

}
