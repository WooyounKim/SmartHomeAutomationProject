// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lighting.proto

package lighting;

/**
 * Protobuf type {@code lighting.LightingDecision}
 */
public final class LightingDecision extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lighting.LightingDecision)
    LightingDecisionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LightingDecision.newBuilder() to construct.
  private LightingDecision(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LightingDecision() {
    lightingMode_ = "";
    reason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LightingDecision();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lighting.LightingProto.internal_static_lighting_LightingDecision_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lighting.LightingProto.internal_static_lighting_LightingDecision_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lighting.LightingDecision.class, lighting.LightingDecision.Builder.class);
  }

  public static final int LIGHTINGMODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object lightingMode_ = "";
  /**
   * <code>string lightingMode = 1;</code>
   * @return The lightingMode.
   */
  @java.lang.Override
  public java.lang.String getLightingMode() {
    java.lang.Object ref = lightingMode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lightingMode_ = s;
      return s;
    }
  }
  /**
   * <code>string lightingMode = 1;</code>
   * @return The bytes for lightingMode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLightingModeBytes() {
    java.lang.Object ref = lightingMode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lightingMode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REASON_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object reason_ = "";
  /**
   * <code>string reason = 2;</code>
   * @return The reason.
   */
  @java.lang.Override
  public java.lang.String getReason() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reason_ = s;
      return s;
    }
  }
  /**
   * <code>string reason = 2;</code>
   * @return The bytes for reason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReasonBytes() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reason_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lightingMode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lightingMode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lightingMode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lightingMode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof lighting.LightingDecision)) {
      return super.equals(obj);
    }
    lighting.LightingDecision other = (lighting.LightingDecision) obj;

    if (!getLightingMode()
        .equals(other.getLightingMode())) return false;
    if (!getReason()
        .equals(other.getReason())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LIGHTINGMODE_FIELD_NUMBER;
    hash = (53 * hash) + getLightingMode().hashCode();
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + getReason().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lighting.LightingDecision parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lighting.LightingDecision parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lighting.LightingDecision parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lighting.LightingDecision parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lighting.LightingDecision parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lighting.LightingDecision parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lighting.LightingDecision parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lighting.LightingDecision parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lighting.LightingDecision parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lighting.LightingDecision parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lighting.LightingDecision parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lighting.LightingDecision parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(lighting.LightingDecision prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code lighting.LightingDecision}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lighting.LightingDecision)
      lighting.LightingDecisionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lighting.LightingProto.internal_static_lighting_LightingDecision_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lighting.LightingProto.internal_static_lighting_LightingDecision_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lighting.LightingDecision.class, lighting.LightingDecision.Builder.class);
    }

    // Construct using lighting.LightingDecision.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      lightingMode_ = "";
      reason_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lighting.LightingProto.internal_static_lighting_LightingDecision_descriptor;
    }

    @java.lang.Override
    public lighting.LightingDecision getDefaultInstanceForType() {
      return lighting.LightingDecision.getDefaultInstance();
    }

    @java.lang.Override
    public lighting.LightingDecision build() {
      lighting.LightingDecision result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public lighting.LightingDecision buildPartial() {
      lighting.LightingDecision result = new lighting.LightingDecision(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(lighting.LightingDecision result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lightingMode_ = lightingMode_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reason_ = reason_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lighting.LightingDecision) {
        return mergeFrom((lighting.LightingDecision)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lighting.LightingDecision other) {
      if (other == lighting.LightingDecision.getDefaultInstance()) return this;
      if (!other.getLightingMode().isEmpty()) {
        lightingMode_ = other.lightingMode_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getReason().isEmpty()) {
        reason_ = other.reason_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              lightingMode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              reason_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object lightingMode_ = "";
    /**
     * <code>string lightingMode = 1;</code>
     * @return The lightingMode.
     */
    public java.lang.String getLightingMode() {
      java.lang.Object ref = lightingMode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lightingMode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lightingMode = 1;</code>
     * @return The bytes for lightingMode.
     */
    public com.google.protobuf.ByteString
        getLightingModeBytes() {
      java.lang.Object ref = lightingMode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lightingMode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lightingMode = 1;</code>
     * @param value The lightingMode to set.
     * @return This builder for chaining.
     */
    public Builder setLightingMode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      lightingMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string lightingMode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLightingMode() {
      lightingMode_ = getDefaultInstance().getLightingMode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string lightingMode = 1;</code>
     * @param value The bytes for lightingMode to set.
     * @return This builder for chaining.
     */
    public Builder setLightingModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      lightingMode_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object reason_ = "";
    /**
     * <code>string reason = 2;</code>
     * @return The reason.
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reason = 2;</code>
     * @return The bytes for reason.
     */
    public com.google.protobuf.ByteString
        getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reason = 2;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      reason_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string reason = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      reason_ = getDefaultInstance().getReason();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string reason = 2;</code>
     * @param value The bytes for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      reason_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lighting.LightingDecision)
  }

  // @@protoc_insertion_point(class_scope:lighting.LightingDecision)
  private static final lighting.LightingDecision DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lighting.LightingDecision();
  }

  public static lighting.LightingDecision getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LightingDecision>
      PARSER = new com.google.protobuf.AbstractParser<LightingDecision>() {
    @java.lang.Override
    public LightingDecision parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LightingDecision> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LightingDecision> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public lighting.LightingDecision getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

