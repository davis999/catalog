package io.reactivesw.catalog.infrastructure.repository;

import io.reactivesw.catalog.domain.entity.Media;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * this is repository interface for media.
 * @author Davis
 *
 */
@Repository("mediaRepository")
public interface MediaRepository extends JpaRepository<Media, Long> {

}
