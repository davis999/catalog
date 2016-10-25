package io.reactivesw.catalog.infrastructure.mapper;

import io.reactivesw.catalog.domain.entity.Media;
import io.reactivesw.catalog.grpc.GrpcMedia;

import io.reactivesw.catalog.infrastructure.dto.MediaDTO;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * this is transfer class for Media.
 *
 * @author Davis
 */
public final class MediaMapper {
  /**
   * ModelMapper.
   */
  private static ModelMapper modelMapper = new ModelMapper();

  /**
   * private constructor.
   */
  private MediaMapper() {

  }

  /**
   * transfer Media to GrpcMedia.
   *
   * @param media media
   * @return GrpcMedia
   */
  public static GrpcMedia transferToMediaInfo(Media media) {
    final GrpcMedia.Builder builder = modelMapper.map(media, GrpcMedia.Builder.class);
    return builder.build();
  }

  /**
   * transfer list of MediaDTO to list of GrpcMedia.
   *
   * @param medias list of MediaDTO
   * @return list of GrpcMedia
   */
  public static List<GrpcMedia> transferToGrpcMediaList(List<MediaDTO> medias) {
    List<GrpcMedia> gRPCMedias = new ArrayList<>();
    for (MediaDTO media : medias) {
      gRPCMedias.add(transferToGrpcMedia(media));
    }
    return gRPCMedias;
  }

  /**
   * transfer MediaDTO to GrpcMedia.
   *
   * @param media MediaDTO
   * @return GrpcMedia
   */
  public static GrpcMedia transferToGrpcMedia(MediaDTO media) {
    final GrpcMedia.Builder builder = modelMapper.map(media, GrpcMedia.Builder.class);
    return builder.build();
  }
}
