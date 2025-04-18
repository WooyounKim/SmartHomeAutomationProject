// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package security;

/**
 * Protobuf type {@code security.SecurityEvent}
 */
public final class SecurityEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:security.SecurityEvent)
    SecurityEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SecurityEvent.newBuilder() to construct.
  private SecurityEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SecurityEvent() {
    deviceId_ = "";
    eventType_ = "";
    timestamp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SecurityEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return security.SecurityProto.internal_static_security_SecurityEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return security.SecurityProto.internal_static_security_SecurityEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            security.SecurityEvent.class, security.SecurityEvent.Builder.class);
  }

  public static final int DEVICEID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceId_ = "";
  /**
   * <code>string deviceId = 1;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceId_ = s;
      return s;
    }
  }
  /**
   * <code>string deviceId = 1;</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENTTYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventType_ = "";
  /**
   * <pre>
   * "motion", "door_open", "window_broken"
   * </pre>
   *
   * <code>string eventType = 2;</code>
   * @return The eventType.
   */
  @java.lang.Override
  public java.lang.String getEventType() {
    java.lang.Object ref = eventType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * "motion", "door_open", "window_broken"
   * </pre>
   *
   * <code>string eventType = 2;</code>
   * @return The bytes for eventType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventTypeBytes() {
    java.lang.Object ref = eventType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object timestamp_ = "";
  /**
   * <code>string timestamp = 3;</code>
   * @return The timestamp.
   */
  @java.lang.Override
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timestamp = 3;</code>
   * @return The bytes for timestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTH_FIELD_NUMBER = 4;
  private common.AuthInfo auth_;
  /**
   * <code>.common.AuthInfo auth = 4;</code>
   * @return Whether the auth field is set.
   */
  @java.lang.Override
  public boolean hasAuth() {
    return auth_ != null;
  }
  /**
   * <code>.common.AuthInfo auth = 4;</code>
   * @return The auth.
   */
  @java.lang.Override
  public common.AuthInfo getAuth() {
    return auth_ == null ? common.AuthInfo.getDefaultInstance() : auth_;
  }
  /**
   * <code>.common.AuthInfo auth = 4;</code>
   */
  @java.lang.Override
  public common.AuthInfoOrBuilder getAuthOrBuilder() {
    return auth_ == null ? common.AuthInfo.getDefaultInstance() : auth_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deviceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eventType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timestamp_);
    }
    if (auth_ != null) {
      output.writeMessage(4, getAuth());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deviceId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, eventType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timestamp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timestamp_);
    }
    if (auth_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAuth());
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
    if (!(obj instanceof security.SecurityEvent)) {
      return super.equals(obj);
    }
    security.SecurityEvent other = (security.SecurityEvent) obj;

    if (!getDeviceId()
        .equals(other.getDeviceId())) return false;
    if (!getEventType()
        .equals(other.getEventType())) return false;
    if (!getTimestamp()
        .equals(other.getTimestamp())) return false;
    if (hasAuth() != other.hasAuth()) return false;
    if (hasAuth()) {
      if (!getAuth()
          .equals(other.getAuth())) return false;
    }
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
    hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId().hashCode();
    hash = (37 * hash) + EVENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEventType().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    if (hasAuth()) {
      hash = (37 * hash) + AUTH_FIELD_NUMBER;
      hash = (53 * hash) + getAuth().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static security.SecurityEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static security.SecurityEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static security.SecurityEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static security.SecurityEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static security.SecurityEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static security.SecurityEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static security.SecurityEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static security.SecurityEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static security.SecurityEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static security.SecurityEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static security.SecurityEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static security.SecurityEvent parseFrom(
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
  public static Builder newBuilder(security.SecurityEvent prototype) {
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
   * Protobuf type {@code security.SecurityEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:security.SecurityEvent)
      security.SecurityEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return security.SecurityProto.internal_static_security_SecurityEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return security.SecurityProto.internal_static_security_SecurityEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              security.SecurityEvent.class, security.SecurityEvent.Builder.class);
    }

    // Construct using security.SecurityEvent.newBuilder()
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
      deviceId_ = "";
      eventType_ = "";
      timestamp_ = "";
      auth_ = null;
      if (authBuilder_ != null) {
        authBuilder_.dispose();
        authBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return security.SecurityProto.internal_static_security_SecurityEvent_descriptor;
    }

    @java.lang.Override
    public security.SecurityEvent getDefaultInstanceForType() {
      return security.SecurityEvent.getDefaultInstance();
    }

    @java.lang.Override
    public security.SecurityEvent build() {
      security.SecurityEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public security.SecurityEvent buildPartial() {
      security.SecurityEvent result = new security.SecurityEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(security.SecurityEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deviceId_ = deviceId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventType_ = eventType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timestamp_ = timestamp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.auth_ = authBuilder_ == null
            ? auth_
            : authBuilder_.build();
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
      if (other instanceof security.SecurityEvent) {
        return mergeFrom((security.SecurityEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(security.SecurityEvent other) {
      if (other == security.SecurityEvent.getDefaultInstance()) return this;
      if (!other.getDeviceId().isEmpty()) {
        deviceId_ = other.deviceId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEventType().isEmpty()) {
        eventType_ = other.eventType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasAuth()) {
        mergeAuth(other.getAuth());
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
              deviceId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              eventType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              timestamp_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getAuthFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object deviceId_ = "";
    /**
     * <code>string deviceId = 1;</code>
     * @return The deviceId.
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deviceId = 1;</code>
     * @return The bytes for deviceId.
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deviceId = 1;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deviceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string deviceId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      deviceId_ = getDefaultInstance().getDeviceId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string deviceId = 1;</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deviceId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object eventType_ = "";
    /**
     * <pre>
     * "motion", "door_open", "window_broken"
     * </pre>
     *
     * <code>string eventType = 2;</code>
     * @return The eventType.
     */
    public java.lang.String getEventType() {
      java.lang.Object ref = eventType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * "motion", "door_open", "window_broken"
     * </pre>
     *
     * <code>string eventType = 2;</code>
     * @return The bytes for eventType.
     */
    public com.google.protobuf.ByteString
        getEventTypeBytes() {
      java.lang.Object ref = eventType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * "motion", "door_open", "window_broken"
     * </pre>
     *
     * <code>string eventType = 2;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "motion", "door_open", "window_broken"
     * </pre>
     *
     * <code>string eventType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      eventType_ = getDefaultInstance().getEventType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * "motion", "door_open", "window_broken"
     * </pre>
     *
     * <code>string eventType = 2;</code>
     * @param value The bytes for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 3;</code>
     * @return The timestamp.
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timestamp = 3;</code>
     * @return The bytes for timestamp.
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timestamp = 3;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      timestamp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      timestamp_ = getDefaultInstance().getTimestamp();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 3;</code>
     * @param value The bytes for timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      timestamp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private common.AuthInfo auth_;
    private com.google.protobuf.SingleFieldBuilderV3<
        common.AuthInfo, common.AuthInfo.Builder, common.AuthInfoOrBuilder> authBuilder_;
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     * @return Whether the auth field is set.
     */
    public boolean hasAuth() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     * @return The auth.
     */
    public common.AuthInfo getAuth() {
      if (authBuilder_ == null) {
        return auth_ == null ? common.AuthInfo.getDefaultInstance() : auth_;
      } else {
        return authBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    public Builder setAuth(common.AuthInfo value) {
      if (authBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        auth_ = value;
      } else {
        authBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    public Builder setAuth(
        common.AuthInfo.Builder builderForValue) {
      if (authBuilder_ == null) {
        auth_ = builderForValue.build();
      } else {
        authBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    public Builder mergeAuth(common.AuthInfo value) {
      if (authBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          auth_ != null &&
          auth_ != common.AuthInfo.getDefaultInstance()) {
          getAuthBuilder().mergeFrom(value);
        } else {
          auth_ = value;
        }
      } else {
        authBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    public Builder clearAuth() {
      bitField0_ = (bitField0_ & ~0x00000008);
      auth_ = null;
      if (authBuilder_ != null) {
        authBuilder_.dispose();
        authBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    public common.AuthInfo.Builder getAuthBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAuthFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    public common.AuthInfoOrBuilder getAuthOrBuilder() {
      if (authBuilder_ != null) {
        return authBuilder_.getMessageOrBuilder();
      } else {
        return auth_ == null ?
            common.AuthInfo.getDefaultInstance() : auth_;
      }
    }
    /**
     * <code>.common.AuthInfo auth = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        common.AuthInfo, common.AuthInfo.Builder, common.AuthInfoOrBuilder> 
        getAuthFieldBuilder() {
      if (authBuilder_ == null) {
        authBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            common.AuthInfo, common.AuthInfo.Builder, common.AuthInfoOrBuilder>(
                getAuth(),
                getParentForChildren(),
                isClean());
        auth_ = null;
      }
      return authBuilder_;
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


    // @@protoc_insertion_point(builder_scope:security.SecurityEvent)
  }

  // @@protoc_insertion_point(class_scope:security.SecurityEvent)
  private static final security.SecurityEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new security.SecurityEvent();
  }

  public static security.SecurityEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityEvent>
      PARSER = new com.google.protobuf.AbstractParser<SecurityEvent>() {
    @java.lang.Override
    public SecurityEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public security.SecurityEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

