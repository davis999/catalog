// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_proto/catalog_category_service.proto

package io.reactivesw.catalog.grpc;

public final class CatalogCategoryService {
  private CatalogCategoryService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,catalog_proto/catalog_category_service" +
      ".proto\022$io.reactivesw.catalog.infrastruc" +
      "ture\032(catalog_proto/catalog_data_message" +
      ".proto\032,catalog_proto/catalog_category_m" +
      "essage.proto2\373\001\n\017CategoryService\022p\n\rgetC" +
      "ategories\022+.io.reactivesw.catalog.infras" +
      "tructure.Empty\0322.io.reactivesw.catalog.i" +
      "nfrastructure.CategoryList\022v\n\017getCategor" +
      "yById\022/.io.reactivesw.catalog.infrastruc" +
      "ture.LongValue\0322.io.reactivesw.catalog.i",
      "nfrastructure.GrpcCategoryB\036\n\032io.reactiv" +
      "esw.catalog.grpcP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.reactivesw.catalog.grpc.CatalogDataMessage.getDescriptor(),
          io.reactivesw.catalog.grpc.CatalogCategoryMessage.getDescriptor(),
        }, assigner);
    io.reactivesw.catalog.grpc.CatalogDataMessage.getDescriptor();
    io.reactivesw.catalog.grpc.CatalogCategoryMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
