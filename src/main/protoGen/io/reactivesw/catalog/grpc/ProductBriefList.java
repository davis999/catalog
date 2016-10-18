// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_proto/catalog_product_message.proto

package io.reactivesw.catalog.grpc;

/**
 * <pre>
 **
 *  response when call queryAllProductsByCategory.
 * </pre>
 *
 * Protobuf type {@code io.reactivesw.catalog.infrastructure.ProductBriefList}
 */
public  final class ProductBriefList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.reactivesw.catalog.infrastructure.ProductBriefList)
    ProductBriefListOrBuilder {
  // Use ProductBriefList.newBuilder() to construct.
  private ProductBriefList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductBriefList() {
    productBrief_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ProductBriefList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              productBrief_ = new java.util.ArrayList<io.reactivesw.catalog.grpc.GrpcProductBrief>();
              mutable_bitField0_ |= 0x00000001;
            }
            productBrief_.add(
                input.readMessage(io.reactivesw.catalog.grpc.GrpcProductBrief.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        productBrief_ = java.util.Collections.unmodifiableList(productBrief_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_ProductBriefList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_ProductBriefList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.reactivesw.catalog.grpc.ProductBriefList.class, io.reactivesw.catalog.grpc.ProductBriefList.Builder.class);
  }

  public static final int PRODUCT_BRIEF_FIELD_NUMBER = 1;
  private java.util.List<io.reactivesw.catalog.grpc.GrpcProductBrief> productBrief_;
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
   */
  public java.util.List<io.reactivesw.catalog.grpc.GrpcProductBrief> getProductBriefList() {
    return productBrief_;
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
   */
  public java.util.List<? extends io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder> 
      getProductBriefOrBuilderList() {
    return productBrief_;
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
   */
  public int getProductBriefCount() {
    return productBrief_.size();
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
   */
  public io.reactivesw.catalog.grpc.GrpcProductBrief getProductBrief(int index) {
    return productBrief_.get(index);
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
   */
  public io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder getProductBriefOrBuilder(
      int index) {
    return productBrief_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < productBrief_.size(); i++) {
      output.writeMessage(1, productBrief_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < productBrief_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, productBrief_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.reactivesw.catalog.grpc.ProductBriefList)) {
      return super.equals(obj);
    }
    io.reactivesw.catalog.grpc.ProductBriefList other = (io.reactivesw.catalog.grpc.ProductBriefList) obj;

    boolean result = true;
    result = result && getProductBriefList()
        .equals(other.getProductBriefList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getProductBriefCount() > 0) {
      hash = (37 * hash) + PRODUCT_BRIEF_FIELD_NUMBER;
      hash = (53 * hash) + getProductBriefList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.ProductBriefList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.reactivesw.catalog.grpc.ProductBriefList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   *  response when call queryAllProductsByCategory.
   * </pre>
   *
   * Protobuf type {@code io.reactivesw.catalog.infrastructure.ProductBriefList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.reactivesw.catalog.infrastructure.ProductBriefList)
      io.reactivesw.catalog.grpc.ProductBriefListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_ProductBriefList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_ProductBriefList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.reactivesw.catalog.grpc.ProductBriefList.class, io.reactivesw.catalog.grpc.ProductBriefList.Builder.class);
    }

    // Construct using io.reactivesw.catalog.grpc.ProductBriefList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getProductBriefFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (productBriefBuilder_ == null) {
        productBrief_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productBriefBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_ProductBriefList_descriptor;
    }

    public io.reactivesw.catalog.grpc.ProductBriefList getDefaultInstanceForType() {
      return io.reactivesw.catalog.grpc.ProductBriefList.getDefaultInstance();
    }

    public io.reactivesw.catalog.grpc.ProductBriefList build() {
      io.reactivesw.catalog.grpc.ProductBriefList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.reactivesw.catalog.grpc.ProductBriefList buildPartial() {
      io.reactivesw.catalog.grpc.ProductBriefList result = new io.reactivesw.catalog.grpc.ProductBriefList(this);
      int from_bitField0_ = bitField0_;
      if (productBriefBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          productBrief_ = java.util.Collections.unmodifiableList(productBrief_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.productBrief_ = productBrief_;
      } else {
        result.productBrief_ = productBriefBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.reactivesw.catalog.grpc.ProductBriefList) {
        return mergeFrom((io.reactivesw.catalog.grpc.ProductBriefList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.reactivesw.catalog.grpc.ProductBriefList other) {
      if (other == io.reactivesw.catalog.grpc.ProductBriefList.getDefaultInstance()) return this;
      if (productBriefBuilder_ == null) {
        if (!other.productBrief_.isEmpty()) {
          if (productBrief_.isEmpty()) {
            productBrief_ = other.productBrief_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductBriefIsMutable();
            productBrief_.addAll(other.productBrief_);
          }
          onChanged();
        }
      } else {
        if (!other.productBrief_.isEmpty()) {
          if (productBriefBuilder_.isEmpty()) {
            productBriefBuilder_.dispose();
            productBriefBuilder_ = null;
            productBrief_ = other.productBrief_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productBriefBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductBriefFieldBuilder() : null;
          } else {
            productBriefBuilder_.addAllMessages(other.productBrief_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.reactivesw.catalog.grpc.ProductBriefList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.reactivesw.catalog.grpc.ProductBriefList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.reactivesw.catalog.grpc.GrpcProductBrief> productBrief_ =
      java.util.Collections.emptyList();
    private void ensureProductBriefIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        productBrief_ = new java.util.ArrayList<io.reactivesw.catalog.grpc.GrpcProductBrief>(productBrief_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.reactivesw.catalog.grpc.GrpcProductBrief, io.reactivesw.catalog.grpc.GrpcProductBrief.Builder, io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder> productBriefBuilder_;

    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public java.util.List<io.reactivesw.catalog.grpc.GrpcProductBrief> getProductBriefList() {
      if (productBriefBuilder_ == null) {
        return java.util.Collections.unmodifiableList(productBrief_);
      } else {
        return productBriefBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public int getProductBriefCount() {
      if (productBriefBuilder_ == null) {
        return productBrief_.size();
      } else {
        return productBriefBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcProductBrief getProductBrief(int index) {
      if (productBriefBuilder_ == null) {
        return productBrief_.get(index);
      } else {
        return productBriefBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder setProductBrief(
        int index, io.reactivesw.catalog.grpc.GrpcProductBrief value) {
      if (productBriefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductBriefIsMutable();
        productBrief_.set(index, value);
        onChanged();
      } else {
        productBriefBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder setProductBrief(
        int index, io.reactivesw.catalog.grpc.GrpcProductBrief.Builder builderForValue) {
      if (productBriefBuilder_ == null) {
        ensureProductBriefIsMutable();
        productBrief_.set(index, builderForValue.build());
        onChanged();
      } else {
        productBriefBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder addProductBrief(io.reactivesw.catalog.grpc.GrpcProductBrief value) {
      if (productBriefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductBriefIsMutable();
        productBrief_.add(value);
        onChanged();
      } else {
        productBriefBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder addProductBrief(
        int index, io.reactivesw.catalog.grpc.GrpcProductBrief value) {
      if (productBriefBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductBriefIsMutable();
        productBrief_.add(index, value);
        onChanged();
      } else {
        productBriefBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder addProductBrief(
        io.reactivesw.catalog.grpc.GrpcProductBrief.Builder builderForValue) {
      if (productBriefBuilder_ == null) {
        ensureProductBriefIsMutable();
        productBrief_.add(builderForValue.build());
        onChanged();
      } else {
        productBriefBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder addProductBrief(
        int index, io.reactivesw.catalog.grpc.GrpcProductBrief.Builder builderForValue) {
      if (productBriefBuilder_ == null) {
        ensureProductBriefIsMutable();
        productBrief_.add(index, builderForValue.build());
        onChanged();
      } else {
        productBriefBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder addAllProductBrief(
        java.lang.Iterable<? extends io.reactivesw.catalog.grpc.GrpcProductBrief> values) {
      if (productBriefBuilder_ == null) {
        ensureProductBriefIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, productBrief_);
        onChanged();
      } else {
        productBriefBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder clearProductBrief() {
      if (productBriefBuilder_ == null) {
        productBrief_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productBriefBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public Builder removeProductBrief(int index) {
      if (productBriefBuilder_ == null) {
        ensureProductBriefIsMutable();
        productBrief_.remove(index);
        onChanged();
      } else {
        productBriefBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcProductBrief.Builder getProductBriefBuilder(
        int index) {
      return getProductBriefFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder getProductBriefOrBuilder(
        int index) {
      if (productBriefBuilder_ == null) {
        return productBrief_.get(index);  } else {
        return productBriefBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public java.util.List<? extends io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder> 
         getProductBriefOrBuilderList() {
      if (productBriefBuilder_ != null) {
        return productBriefBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(productBrief_);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcProductBrief.Builder addProductBriefBuilder() {
      return getProductBriefFieldBuilder().addBuilder(
          io.reactivesw.catalog.grpc.GrpcProductBrief.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcProductBrief.Builder addProductBriefBuilder(
        int index) {
      return getProductBriefFieldBuilder().addBuilder(
          index, io.reactivesw.catalog.grpc.GrpcProductBrief.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcProductBrief product_brief = 1;</code>
     */
    public java.util.List<io.reactivesw.catalog.grpc.GrpcProductBrief.Builder> 
         getProductBriefBuilderList() {
      return getProductBriefFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.reactivesw.catalog.grpc.GrpcProductBrief, io.reactivesw.catalog.grpc.GrpcProductBrief.Builder, io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder> 
        getProductBriefFieldBuilder() {
      if (productBriefBuilder_ == null) {
        productBriefBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.reactivesw.catalog.grpc.GrpcProductBrief, io.reactivesw.catalog.grpc.GrpcProductBrief.Builder, io.reactivesw.catalog.grpc.GrpcProductBriefOrBuilder>(
                productBrief_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        productBrief_ = null;
      }
      return productBriefBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.reactivesw.catalog.infrastructure.ProductBriefList)
  }

  // @@protoc_insertion_point(class_scope:io.reactivesw.catalog.infrastructure.ProductBriefList)
  private static final io.reactivesw.catalog.grpc.ProductBriefList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.reactivesw.catalog.grpc.ProductBriefList();
  }

  public static io.reactivesw.catalog.grpc.ProductBriefList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductBriefList>
      PARSER = new com.google.protobuf.AbstractParser<ProductBriefList>() {
    public ProductBriefList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductBriefList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductBriefList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductBriefList> getParserForType() {
    return PARSER;
  }

  public io.reactivesw.catalog.grpc.ProductBriefList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

