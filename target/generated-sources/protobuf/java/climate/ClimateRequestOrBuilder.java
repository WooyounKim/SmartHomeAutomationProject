// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: climate.proto

package climate;

public interface ClimateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:climate.ClimateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string deviceId = 1;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <code>string deviceId = 1;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <code>.common.AuthInfo auth = 2;</code>
   * @return Whether the auth field is set.
   */
  boolean hasAuth();
  /**
   * <code>.common.AuthInfo auth = 2;</code>
   * @return The auth.
   */
  common.AuthInfo getAuth();
  /**
   * <code>.common.AuthInfo auth = 2;</code>
   */
  common.AuthInfoOrBuilder getAuthOrBuilder();
}
