// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catelog-message.proto

package io.reactivesw.catelog.infrastructure;

/**
 * <pre>
 **
 * response when call getProductAttribute.
 * </pre>
 *
 * Protobuf type {@code io.reactivesw.catelog.infrastructure.AttributeList}
 */
public  final class AttributeList extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:io.reactivesw.catelog.infrastructure.AttributeList)
    AttributeListOrBuilder {
  // Use AttributeList.newBuilder() to construct.
  private AttributeList(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AttributeList() {
    attribute_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AttributeList(
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
              attribute_ = new java.util.ArrayList<io.reactivesw.catelog.infrastructure.GrpcAttribute>();
              mutable_bitField0_ |= 0x00000001;
            }
            attribute_.add(input.readMessage(io.reactivesw.catelog.infrastructure.GrpcAttribute.parser(), extensionRegistry));
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
        attribute_ = java.util.Collections.unmodifiableList(attribute_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.reactivesw.catelog.infrastructure.CatelogMessage.internal_static_io_reactivesw_catelog_infrastructure_AttributeList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.reactivesw.catelog.infrastructure.CatelogMessage.internal_static_io_reactivesw_catelog_infrastructure_AttributeList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.reactivesw.catelog.infrastructure.AttributeList.class, io.reactivesw.catelog.infrastructure.AttributeList.Builder.class);
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 1;
  private java.util.List<io.reactivesw.catelog.infrastructure.GrpcAttribute> attribute_;
  /**
   * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
   */
  public java.util.List<io.reactivesw.catelog.infrastructure.GrpcAttribute> getAttributeList() {
    return attribute_;
  }
  /**
   * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
   */
  public java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder> 
      getAttributeOrBuilderList() {
    return attribute_;
  }
  /**
   * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
   */
  public int getAttributeCount() {
    return attribute_.size();
  }
  /**
   * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
   */
  public io.reactivesw.catelog.infrastructure.GrpcAttribute getAttribute(int index) {
    return attribute_.get(index);
  }
  /**
   * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
   */
  public io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder getAttributeOrBuilder(
      int index) {
    return attribute_.get(index);
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
    for (int i = 0; i < attribute_.size(); i++) {
      output.writeMessage(1, attribute_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < attribute_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, attribute_.get(i));
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
    if (!(obj instanceof io.reactivesw.catelog.infrastructure.AttributeList)) {
      return super.equals(obj);
    }
    io.reactivesw.catelog.infrastructure.AttributeList other = (io.reactivesw.catelog.infrastructure.AttributeList) obj;

    boolean result = true;
    result = result && getAttributeList()
        .equals(other.getAttributeList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getAttributeCount() > 0) {
      hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getAttributeList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static io.reactivesw.catelog.infrastructure.AttributeList parseFrom(
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
  public static Builder newBuilder(io.reactivesw.catelog.infrastructure.AttributeList prototype) {
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
   * <pre>
   **
   * response when call getProductAttribute.
   * </pre>
   *
   * Protobuf type {@code io.reactivesw.catelog.infrastructure.AttributeList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.reactivesw.catelog.infrastructure.AttributeList)
      io.reactivesw.catelog.infrastructure.AttributeListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.reactivesw.catelog.infrastructure.CatelogMessage.internal_static_io_reactivesw_catelog_infrastructure_AttributeList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.reactivesw.catelog.infrastructure.CatelogMessage.internal_static_io_reactivesw_catelog_infrastructure_AttributeList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.reactivesw.catelog.infrastructure.AttributeList.class, io.reactivesw.catelog.infrastructure.AttributeList.Builder.class);
    }

    // Construct using io.reactivesw.catelog.infrastructure.AttributeList.newBuilder()
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
        getAttributeFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (attributeBuilder_ == null) {
        attribute_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        attributeBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.reactivesw.catelog.infrastructure.CatelogMessage.internal_static_io_reactivesw_catelog_infrastructure_AttributeList_descriptor;
    }

    public io.reactivesw.catelog.infrastructure.AttributeList getDefaultInstanceForType() {
      return io.reactivesw.catelog.infrastructure.AttributeList.getDefaultInstance();
    }

    public io.reactivesw.catelog.infrastructure.AttributeList build() {
      io.reactivesw.catelog.infrastructure.AttributeList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.reactivesw.catelog.infrastructure.AttributeList buildPartial() {
      io.reactivesw.catelog.infrastructure.AttributeList result = new io.reactivesw.catelog.infrastructure.AttributeList(this);
      int from_bitField0_ = bitField0_;
      if (attributeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          attribute_ = java.util.Collections.unmodifiableList(attribute_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.attribute_ = attribute_;
      } else {
        result.attribute_ = attributeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.reactivesw.catelog.infrastructure.AttributeList) {
        return mergeFrom((io.reactivesw.catelog.infrastructure.AttributeList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.reactivesw.catelog.infrastructure.AttributeList other) {
      if (other == io.reactivesw.catelog.infrastructure.AttributeList.getDefaultInstance()) return this;
      if (attributeBuilder_ == null) {
        if (!other.attribute_.isEmpty()) {
          if (attribute_.isEmpty()) {
            attribute_ = other.attribute_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAttributeIsMutable();
            attribute_.addAll(other.attribute_);
          }
          onChanged();
        }
      } else {
        if (!other.attribute_.isEmpty()) {
          if (attributeBuilder_.isEmpty()) {
            attributeBuilder_.dispose();
            attributeBuilder_ = null;
            attribute_ = other.attribute_;
            bitField0_ = (bitField0_ & ~0x00000001);
            attributeBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getAttributeFieldBuilder() : null;
          } else {
            attributeBuilder_.addAllMessages(other.attribute_);
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
      io.reactivesw.catelog.infrastructure.AttributeList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.reactivesw.catelog.infrastructure.AttributeList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.reactivesw.catelog.infrastructure.GrpcAttribute> attribute_ =
      java.util.Collections.emptyList();
    private void ensureAttributeIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        attribute_ = new java.util.ArrayList<io.reactivesw.catelog.infrastructure.GrpcAttribute>(attribute_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        io.reactivesw.catelog.infrastructure.GrpcAttribute, io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder, io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder> attributeBuilder_;

    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public java.util.List<io.reactivesw.catelog.infrastructure.GrpcAttribute> getAttributeList() {
      if (attributeBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attribute_);
      } else {
        return attributeBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public int getAttributeCount() {
      if (attributeBuilder_ == null) {
        return attribute_.size();
      } else {
        return attributeBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public io.reactivesw.catelog.infrastructure.GrpcAttribute getAttribute(int index) {
      if (attributeBuilder_ == null) {
        return attribute_.get(index);
      } else {
        return attributeBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder setAttribute(
        int index, io.reactivesw.catelog.infrastructure.GrpcAttribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributeIsMutable();
        attribute_.set(index, value);
        onChanged();
      } else {
        attributeBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder setAttribute(
        int index, io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        ensureAttributeIsMutable();
        attribute_.set(index, builderForValue.build());
        onChanged();
      } else {
        attributeBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder addAttribute(io.reactivesw.catelog.infrastructure.GrpcAttribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributeIsMutable();
        attribute_.add(value);
        onChanged();
      } else {
        attributeBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder addAttribute(
        int index, io.reactivesw.catelog.infrastructure.GrpcAttribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributeIsMutable();
        attribute_.add(index, value);
        onChanged();
      } else {
        attributeBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder addAttribute(
        io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        ensureAttributeIsMutable();
        attribute_.add(builderForValue.build());
        onChanged();
      } else {
        attributeBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder addAttribute(
        int index, io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        ensureAttributeIsMutable();
        attribute_.add(index, builderForValue.build());
        onChanged();
      } else {
        attributeBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder addAllAttribute(
        java.lang.Iterable<? extends io.reactivesw.catelog.infrastructure.GrpcAttribute> values) {
      if (attributeBuilder_ == null) {
        ensureAttributeIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attribute_);
        onChanged();
      } else {
        attributeBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder clearAttribute() {
      if (attributeBuilder_ == null) {
        attribute_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        attributeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public Builder removeAttribute(int index) {
      if (attributeBuilder_ == null) {
        ensureAttributeIsMutable();
        attribute_.remove(index);
        onChanged();
      } else {
        attributeBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder getAttributeBuilder(
        int index) {
      return getAttributeFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder getAttributeOrBuilder(
        int index) {
      if (attributeBuilder_ == null) {
        return attribute_.get(index);  } else {
        return attributeBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public java.util.List<? extends io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder> 
         getAttributeOrBuilderList() {
      if (attributeBuilder_ != null) {
        return attributeBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attribute_);
      }
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder addAttributeBuilder() {
      return getAttributeFieldBuilder().addBuilder(
          io.reactivesw.catelog.infrastructure.GrpcAttribute.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder addAttributeBuilder(
        int index) {
      return getAttributeFieldBuilder().addBuilder(
          index, io.reactivesw.catelog.infrastructure.GrpcAttribute.getDefaultInstance());
    }
    /**
     * <code>repeated .io.reactivesw.catelog.infrastructure.GrpcAttribute attribute = 1;</code>
     */
    public java.util.List<io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder> 
         getAttributeBuilderList() {
      return getAttributeFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        io.reactivesw.catelog.infrastructure.GrpcAttribute, io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder, io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder> 
        getAttributeFieldBuilder() {
      if (attributeBuilder_ == null) {
        attributeBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            io.reactivesw.catelog.infrastructure.GrpcAttribute, io.reactivesw.catelog.infrastructure.GrpcAttribute.Builder, io.reactivesw.catelog.infrastructure.GrpcAttributeOrBuilder>(
                attribute_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        attribute_ = null;
      }
      return attributeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:io.reactivesw.catelog.infrastructure.AttributeList)
  }

  // @@protoc_insertion_point(class_scope:io.reactivesw.catelog.infrastructure.AttributeList)
  private static final io.reactivesw.catelog.infrastructure.AttributeList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.reactivesw.catelog.infrastructure.AttributeList();
  }

  public static io.reactivesw.catelog.infrastructure.AttributeList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributeList>
      PARSER = new com.google.protobuf.AbstractParser<AttributeList>() {
    public AttributeList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttributeList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttributeList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributeList> getParserForType() {
    return PARSER;
  }

  public io.reactivesw.catelog.infrastructure.AttributeList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

