// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reactivesw-catelog.proto

package io.reactivesw.catelog.grpc.infrastructure;

/**
 * Protobuf type {@code io.reactivesw.catelog.grpc.VariantValueInfo}
 */
public  final class VariantValueInfo extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.reactivesw.catelog.grpc.VariantValueInfo)
    VariantValueInfoOrBuilder {
  // Use VariantValueInfo.newBuilder() to construct.
  private VariantValueInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private VariantValueInfo() {
    id_ = 0L;
    value_ = "";
    displayOrder_ = 0;
    priceAdjustment_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private VariantValueInfo(
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

            value_ = s;
            break;
          }
          case 24: {

            displayOrder_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            priceAdjustment_ = s;
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.reactivesw.catelog.grpc.infrastructure.ReactiveswCatelog.internal_static_io_reactivesw_catelog_grpc_VariantValueInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.reactivesw.catelog.grpc.infrastructure.ReactiveswCatelog.internal_static_io_reactivesw_catelog_grpc_VariantValueInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.class, io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object value_;
  /**
   * <code>optional string value = 2;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>optional string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAYORDER_FIELD_NUMBER = 3;
  private int displayOrder_;
  /**
   * <code>optional int32 displayOrder = 3;</code>
   */
  public int getDisplayOrder() {
    return displayOrder_;
  }

  public static final int PRICEADJUSTMENT_FIELD_NUMBER = 4;
  private volatile java.lang.Object priceAdjustment_;
  /**
   * <code>optional string priceAdjustment = 4;</code>
   */
  public java.lang.String getPriceAdjustment() {
    java.lang.Object ref = priceAdjustment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      priceAdjustment_ = s;
      return s;
    }
  }
  /**
   * <code>optional string priceAdjustment = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPriceAdjustmentBytes() {
    java.lang.Object ref = priceAdjustment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      priceAdjustment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, value_);
    }
    if (displayOrder_ != 0) {
      output.writeInt32(3, displayOrder_);
    }
    if (!getPriceAdjustmentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, priceAdjustment_);
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
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, value_);
    }
    if (displayOrder_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, displayOrder_);
    }
    if (!getPriceAdjustmentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, priceAdjustment_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.reactivesw.catelog.grpc.VariantValueInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.reactivesw.catelog.grpc.VariantValueInfo)
      io.reactivesw.catelog.grpc.infrastructure.VariantValueInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.reactivesw.catelog.grpc.infrastructure.ReactiveswCatelog.internal_static_io_reactivesw_catelog_grpc_VariantValueInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.reactivesw.catelog.grpc.infrastructure.ReactiveswCatelog.internal_static_io_reactivesw_catelog_grpc_VariantValueInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.class, io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.Builder.class);
    }

    // Construct using io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      value_ = "";

      displayOrder_ = 0;

      priceAdjustment_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.reactivesw.catelog.grpc.infrastructure.ReactiveswCatelog.internal_static_io_reactivesw_catelog_grpc_VariantValueInfo_descriptor;
    }

    public io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo getDefaultInstanceForType() {
      return io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.getDefaultInstance();
    }

    public io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo build() {
      io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo buildPartial() {
      io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo result = new io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo(this);
      result.id_ = id_;
      result.value_ = value_;
      result.displayOrder_ = displayOrder_;
      result.priceAdjustment_ = priceAdjustment_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo) {
        return mergeFrom((io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo other) {
      if (other == io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (other.getDisplayOrder() != 0) {
        setDisplayOrder(other.getDisplayOrder());
      }
      if (!other.getPriceAdjustment().isEmpty()) {
        priceAdjustment_ = other.priceAdjustment_;
        onChanged();
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
      io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private java.lang.Object value_ = "";
    /**
     * <code>optional string value = 2;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 2;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private int displayOrder_ ;
    /**
     * <code>optional int32 displayOrder = 3;</code>
     */
    public int getDisplayOrder() {
      return displayOrder_;
    }
    /**
     * <code>optional int32 displayOrder = 3;</code>
     */
    public Builder setDisplayOrder(int value) {
      
      displayOrder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 displayOrder = 3;</code>
     */
    public Builder clearDisplayOrder() {
      
      displayOrder_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object priceAdjustment_ = "";
    /**
     * <code>optional string priceAdjustment = 4;</code>
     */
    public java.lang.String getPriceAdjustment() {
      java.lang.Object ref = priceAdjustment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        priceAdjustment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string priceAdjustment = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPriceAdjustmentBytes() {
      java.lang.Object ref = priceAdjustment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        priceAdjustment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string priceAdjustment = 4;</code>
     */
    public Builder setPriceAdjustment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      priceAdjustment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string priceAdjustment = 4;</code>
     */
    public Builder clearPriceAdjustment() {
      
      priceAdjustment_ = getDefaultInstance().getPriceAdjustment();
      onChanged();
      return this;
    }
    /**
     * <code>optional string priceAdjustment = 4;</code>
     */
    public Builder setPriceAdjustmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      priceAdjustment_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.reactivesw.catelog.grpc.VariantValueInfo)
  }

  // @@protoc_insertion_point(class_scope:io.reactivesw.catelog.grpc.VariantValueInfo)
  private static final io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo();
  }

  public static io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VariantValueInfo>
      PARSER = new com.google.protobuf.AbstractParser<VariantValueInfo>() {
    public VariantValueInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VariantValueInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VariantValueInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VariantValueInfo> getParserForType() {
    return PARSER;
  }

  public io.reactivesw.catelog.grpc.infrastructure.VariantValueInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

