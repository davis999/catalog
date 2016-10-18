// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog_proto/catalog_product_message.proto

package io.reactivesw.catalog.grpc;

/**
 * Protobuf type {@code io.reactivesw.catalog.infrastructure.GrpcVariant}
 */
public  final class GrpcVariant extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.reactivesw.catalog.infrastructure.GrpcVariant)
    GrpcVariantOrBuilder {
  // Use GrpcVariant.newBuilder() to construct.
  private GrpcVariant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GrpcVariant() {
    id_ = 0L;
    name_ = "";
    displayOrder_ = 0;
    variantValue_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GrpcVariant(
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            displayOrder_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              variantValue_ = new java.util.ArrayList<io.reactivesw.catalog.grpc.GrpcVariantValue>();
              mutable_bitField0_ |= 0x00000008;
            }
            variantValue_.add(
                input.readMessage(io.reactivesw.catalog.grpc.GrpcVariantValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        variantValue_ = java.util.Collections.unmodifiableList(variantValue_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_GrpcVariant_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_GrpcVariant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.reactivesw.catalog.grpc.GrpcVariant.class, io.reactivesw.catalog.grpc.GrpcVariant.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_ORDER_FIELD_NUMBER = 3;
  private int displayOrder_;
  /**
   * <code>optional int32 display_order = 3;</code>
   */
  public int getDisplayOrder() {
    return displayOrder_;
  }

  public static final int VARIANT_VALUE_FIELD_NUMBER = 4;
  private java.util.List<io.reactivesw.catalog.grpc.GrpcVariantValue> variantValue_;
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
   */
  public java.util.List<io.reactivesw.catalog.grpc.GrpcVariantValue> getVariantValueList() {
    return variantValue_;
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
   */
  public java.util.List<? extends io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder> 
      getVariantValueOrBuilderList() {
    return variantValue_;
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
   */
  public int getVariantValueCount() {
    return variantValue_.size();
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
   */
  public io.reactivesw.catalog.grpc.GrpcVariantValue getVariantValue(int index) {
    return variantValue_.get(index);
  }
  /**
   * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
   */
  public io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder getVariantValueOrBuilder(
      int index) {
    return variantValue_.get(index);
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (displayOrder_ != 0) {
      output.writeInt32(3, displayOrder_);
    }
    for (int i = 0; i < variantValue_.size(); i++) {
      output.writeMessage(4, variantValue_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (displayOrder_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, displayOrder_);
    }
    for (int i = 0; i < variantValue_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, variantValue_.get(i));
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
    if (!(obj instanceof io.reactivesw.catalog.grpc.GrpcVariant)) {
      return super.equals(obj);
    }
    io.reactivesw.catalog.grpc.GrpcVariant other = (io.reactivesw.catalog.grpc.GrpcVariant) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getName()
        .equals(other.getName());
    result = result && (getDisplayOrder()
        == other.getDisplayOrder());
    result = result && getVariantValueList()
        .equals(other.getVariantValueList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_ORDER_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayOrder();
    if (getVariantValueCount() > 0) {
      hash = (37 * hash) + VARIANT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getVariantValueList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catalog.grpc.GrpcVariant parseFrom(
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
  public static Builder newBuilder(io.reactivesw.catalog.grpc.GrpcVariant prototype) {
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
   * Protobuf type {@code io.reactivesw.catalog.infrastructure.GrpcVariant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.reactivesw.catalog.infrastructure.GrpcVariant)
      io.reactivesw.catalog.grpc.GrpcVariantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_GrpcVariant_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_GrpcVariant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.reactivesw.catalog.grpc.GrpcVariant.class, io.reactivesw.catalog.grpc.GrpcVariant.Builder.class);
    }

    // Construct using io.reactivesw.catalog.grpc.GrpcVariant.newBuilder()
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
        getVariantValueFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      name_ = "";

      displayOrder_ = 0;

      if (variantValueBuilder_ == null) {
        variantValue_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        variantValueBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.reactivesw.catalog.grpc.CatalogProductMessage.internal_static_io_reactivesw_catalog_infrastructure_GrpcVariant_descriptor;
    }

    public io.reactivesw.catalog.grpc.GrpcVariant getDefaultInstanceForType() {
      return io.reactivesw.catalog.grpc.GrpcVariant.getDefaultInstance();
    }

    public io.reactivesw.catalog.grpc.GrpcVariant build() {
      io.reactivesw.catalog.grpc.GrpcVariant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.reactivesw.catalog.grpc.GrpcVariant buildPartial() {
      io.reactivesw.catalog.grpc.GrpcVariant result = new io.reactivesw.catalog.grpc.GrpcVariant(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.name_ = name_;
      result.displayOrder_ = displayOrder_;
      if (variantValueBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          variantValue_ = java.util.Collections.unmodifiableList(variantValue_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.variantValue_ = variantValue_;
      } else {
        result.variantValue_ = variantValueBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.reactivesw.catalog.grpc.GrpcVariant) {
        return mergeFrom((io.reactivesw.catalog.grpc.GrpcVariant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.reactivesw.catalog.grpc.GrpcVariant other) {
      if (other == io.reactivesw.catalog.grpc.GrpcVariant.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getDisplayOrder() != 0) {
        setDisplayOrder(other.getDisplayOrder());
      }
      if (variantValueBuilder_ == null) {
        if (!other.variantValue_.isEmpty()) {
          if (variantValue_.isEmpty()) {
            variantValue_ = other.variantValue_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureVariantValueIsMutable();
            variantValue_.addAll(other.variantValue_);
          }
          onChanged();
        }
      } else {
        if (!other.variantValue_.isEmpty()) {
          if (variantValueBuilder_.isEmpty()) {
            variantValueBuilder_.dispose();
            variantValueBuilder_ = null;
            variantValue_ = other.variantValue_;
            bitField0_ = (bitField0_ & ~0x00000008);
            variantValueBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVariantValueFieldBuilder() : null;
          } else {
            variantValueBuilder_.addAllMessages(other.variantValue_);
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
      io.reactivesw.catalog.grpc.GrpcVariant parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.reactivesw.catalog.grpc.GrpcVariant) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>optional int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int displayOrder_ ;
    /**
     * <code>optional int32 display_order = 3;</code>
     */
    public int getDisplayOrder() {
      return displayOrder_;
    }
    /**
     * <code>optional int32 display_order = 3;</code>
     */
    public Builder setDisplayOrder(int value) {
      
      displayOrder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 display_order = 3;</code>
     */
    public Builder clearDisplayOrder() {
      
      displayOrder_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.reactivesw.catalog.grpc.GrpcVariantValue> variantValue_ =
      java.util.Collections.emptyList();
    private void ensureVariantValueIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        variantValue_ = new java.util.ArrayList<io.reactivesw.catalog.grpc.GrpcVariantValue>(variantValue_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.reactivesw.catalog.grpc.GrpcVariantValue, io.reactivesw.catalog.grpc.GrpcVariantValue.Builder, io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder> variantValueBuilder_;

    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public java.util.List<io.reactivesw.catalog.grpc.GrpcVariantValue> getVariantValueList() {
      if (variantValueBuilder_ == null) {
        return java.util.Collections.unmodifiableList(variantValue_);
      } else {
        return variantValueBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public int getVariantValueCount() {
      if (variantValueBuilder_ == null) {
        return variantValue_.size();
      } else {
        return variantValueBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcVariantValue getVariantValue(int index) {
      if (variantValueBuilder_ == null) {
        return variantValue_.get(index);
      } else {
        return variantValueBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder setVariantValue(
        int index, io.reactivesw.catalog.grpc.GrpcVariantValue value) {
      if (variantValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantValueIsMutable();
        variantValue_.set(index, value);
        onChanged();
      } else {
        variantValueBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder setVariantValue(
        int index, io.reactivesw.catalog.grpc.GrpcVariantValue.Builder builderForValue) {
      if (variantValueBuilder_ == null) {
        ensureVariantValueIsMutable();
        variantValue_.set(index, builderForValue.build());
        onChanged();
      } else {
        variantValueBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder addVariantValue(io.reactivesw.catalog.grpc.GrpcVariantValue value) {
      if (variantValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantValueIsMutable();
        variantValue_.add(value);
        onChanged();
      } else {
        variantValueBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder addVariantValue(
        int index, io.reactivesw.catalog.grpc.GrpcVariantValue value) {
      if (variantValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVariantValueIsMutable();
        variantValue_.add(index, value);
        onChanged();
      } else {
        variantValueBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder addVariantValue(
        io.reactivesw.catalog.grpc.GrpcVariantValue.Builder builderForValue) {
      if (variantValueBuilder_ == null) {
        ensureVariantValueIsMutable();
        variantValue_.add(builderForValue.build());
        onChanged();
      } else {
        variantValueBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder addVariantValue(
        int index, io.reactivesw.catalog.grpc.GrpcVariantValue.Builder builderForValue) {
      if (variantValueBuilder_ == null) {
        ensureVariantValueIsMutable();
        variantValue_.add(index, builderForValue.build());
        onChanged();
      } else {
        variantValueBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder addAllVariantValue(
        java.lang.Iterable<? extends io.reactivesw.catalog.grpc.GrpcVariantValue> values) {
      if (variantValueBuilder_ == null) {
        ensureVariantValueIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, variantValue_);
        onChanged();
      } else {
        variantValueBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder clearVariantValue() {
      if (variantValueBuilder_ == null) {
        variantValue_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        variantValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public Builder removeVariantValue(int index) {
      if (variantValueBuilder_ == null) {
        ensureVariantValueIsMutable();
        variantValue_.remove(index);
        onChanged();
      } else {
        variantValueBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcVariantValue.Builder getVariantValueBuilder(
        int index) {
      return getVariantValueFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder getVariantValueOrBuilder(
        int index) {
      if (variantValueBuilder_ == null) {
        return variantValue_.get(index);  } else {
        return variantValueBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public java.util.List<? extends io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder> 
         getVariantValueOrBuilderList() {
      if (variantValueBuilder_ != null) {
        return variantValueBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(variantValue_);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcVariantValue.Builder addVariantValueBuilder() {
      return getVariantValueFieldBuilder().addBuilder(
          io.reactivesw.catalog.grpc.GrpcVariantValue.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public io.reactivesw.catalog.grpc.GrpcVariantValue.Builder addVariantValueBuilder(
        int index) {
      return getVariantValueFieldBuilder().addBuilder(
          index, io.reactivesw.catalog.grpc.GrpcVariantValue.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catalog.infrastructure.GrpcVariantValue variant_value = 4;</code>
     */
    public java.util.List<io.reactivesw.catalog.grpc.GrpcVariantValue.Builder> 
         getVariantValueBuilderList() {
      return getVariantValueFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.reactivesw.catalog.grpc.GrpcVariantValue, io.reactivesw.catalog.grpc.GrpcVariantValue.Builder, io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder> 
        getVariantValueFieldBuilder() {
      if (variantValueBuilder_ == null) {
        variantValueBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.reactivesw.catalog.grpc.GrpcVariantValue, io.reactivesw.catalog.grpc.GrpcVariantValue.Builder, io.reactivesw.catalog.grpc.GrpcVariantValueOrBuilder>(
                variantValue_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        variantValue_ = null;
      }
      return variantValueBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.reactivesw.catalog.infrastructure.GrpcVariant)
  }

  // @@protoc_insertion_point(class_scope:io.reactivesw.catalog.infrastructure.GrpcVariant)
  private static final io.reactivesw.catalog.grpc.GrpcVariant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.reactivesw.catalog.grpc.GrpcVariant();
  }

  public static io.reactivesw.catalog.grpc.GrpcVariant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GrpcVariant>
      PARSER = new com.google.protobuf.AbstractParser<GrpcVariant>() {
    public GrpcVariant parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GrpcVariant(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GrpcVariant> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GrpcVariant> getParserForType() {
    return PARSER;
  }

  public io.reactivesw.catalog.grpc.GrpcVariant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

