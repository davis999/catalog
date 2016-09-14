package io.reactivesw.catelog.repository;

import io.reactivesw.catelog.domain.Template;

import org.springframework.data.repository.CrudRepository;

/**
 * this is repository interface for template.
 * @author Davis
 *
 */
public interface TemplateRepository extends CrudRepository<Template, Long> {

}
