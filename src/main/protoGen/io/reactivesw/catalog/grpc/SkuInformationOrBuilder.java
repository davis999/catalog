// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_proto/catalog_sku_message.proto

package io.reactivesw.catalog.grpc;

public interface SkuInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catalog.infrastructure.SkuInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 sku_id = 1;</code>
   */
  long getSkuId();

  /**
   * <code>optional string sku_number = 2;</code>
   */
  java.lang.String getSkuNumber();
  /**
   * <code>optional string sku_number = 2;</code>
   */
  com.google.protobuf.ByteString
      getSkuNumberBytes();

  /**
   * <code>optional string sku_name = 3;</code>
   */
  java.lang.String getSkuName();
  /**
   * <code>optional string sku_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getSkuNameBytes();

  /**
   * <code>optional string media_url = 4;</code>
   */
  java.lang.String getMediaUrl();
  /**
   * <code>optional string media_url = 4;</code>
   */
  com.google.protobuf.ByteString
      getMediaUrlBytes();

  /**
   * <code>optional string price = 5;</code>
   */
  java.lang.String getPrice();
  /**
   * <code>optional string price = 5;</code>
   */
  com.google.protobuf.ByteString
      getPriceBytes();
}
