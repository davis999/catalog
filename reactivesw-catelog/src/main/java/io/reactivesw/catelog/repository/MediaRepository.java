package io.reactivesw.catelog.repository;

import io.reactivesw.catelog.domain.Media;

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
