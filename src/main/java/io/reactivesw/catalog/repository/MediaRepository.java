package io.reactivesw.catalog.repository;

import io.reactivesw.catalog.domain.Media;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * this is repository interface for media.
 * @author Davis
 *
 */
@Repository("mediaRepository")
public interface MediaRepository extends CrudRepository<Media, Long> {

}
