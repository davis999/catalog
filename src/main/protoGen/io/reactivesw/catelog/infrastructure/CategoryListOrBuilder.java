// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reactivesw-catelog.proto

package io.reactivesw.catelog.infrastructure;

public interface CategoryListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.reactivesw.catelog.grpc.CategoryList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcCategory category = 1;</code>
   */
  java.util.List<io.reactivesw.catelog.infrastructure.GrpcCategory> 
      getCategoryList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcCategory category = 1;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcCategory getCategory(int index);
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcCategory category = 1;</code>
   */
  int getCategoryCount();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcCategory category = 1;</code>
   */
  java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcCategoryOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <code>repeated .io.reactivesw.catelog.grpc.GrpcCategory category = 1;</code>
   */
  io.reactivesw.catelog.infrastructure.GrpcCategoryOrBuilder getCategoryOrBuilder(
      int index);
}
