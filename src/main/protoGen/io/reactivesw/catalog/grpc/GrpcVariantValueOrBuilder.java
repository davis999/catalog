// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_proto/catalog_product_message.proto

package io.reactivesw.catalog.grpc;

public interface GrpcVariantValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catalog.infrastructure.GrpcVariantValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string value = 2;</code>
   */
  java.lang.String getValue();
  /**
   * <code>optional string value = 2;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>optional bool actived = 3;</code>
   */
  boolean getActived();

  /**
   * <code>optional int32 displayOrder = 4;</code>
   */
  int getDisplayOrder();

  /**
   * <code>optional string sku_number = 5;</code>
   */
  java.lang.String getSkuNumber();
  /**
   * <code>optional string sku_number = 5;</code>
   */
  com.google.protobuf.ByteString
      getSkuNumberBytes();

  /**
   * <code>optional bool selected = 6;</code>
   */
  boolean getSelected();
}
