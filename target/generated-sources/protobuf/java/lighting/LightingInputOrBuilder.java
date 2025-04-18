// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lighting.proto

package lighting;

public interface LightingInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lighting.LightingInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sensorType = 1;</code>
   * @return The sensorType.
   */
  java.lang.String getSensorType();
  /**
   * <code>string sensorType = 1;</code>
   * @return The bytes for sensorType.
   */
  com.google.protobuf.ByteString
      getSensorTypeBytes();

  /**
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>string timestamp = 3;</code>
   * @return The timestamp.
   */
  java.lang.String getTimestamp();
  /**
   * <code>string timestamp = 3;</code>
   * @return The bytes for timestamp.
   */
  com.google.protobuf.ByteString
      getTimestampBytes();

  /**
   * <code>.common.AuthInfo auth = 4;</code>
   * @return Whether the auth field is set.
   */
  boolean hasAuth();
  /**
   * <code>.common.AuthInfo auth = 4;</code>
   * @return The auth.
   */
  common.AuthInfo getAuth();
  /**
   * <code>.common.AuthInfo auth = 4;</code>
   */
  common.AuthInfoOrBuilder getAuthOrBuilder();
}
