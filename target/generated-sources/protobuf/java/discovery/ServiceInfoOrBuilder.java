// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: discovery.proto

package discovery;

public interface ServiceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:discovery.ServiceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string serviceName = 1;</code>
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   * <code>string serviceName = 1;</code>
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <code>string host = 2;</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <code>string host = 2;</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>int32 port = 3;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.common.AuthInfo auth = 5;</code>
   * @return Whether the auth field is set.
   */
  boolean hasAuth();
  /**
   * <code>.common.AuthInfo auth = 5;</code>
   * @return The auth.
   */
  common.AuthInfo getAuth();
  /**
   * <code>.common.AuthInfo auth = 5;</code>
   */
  common.AuthInfoOrBuilder getAuthOrBuilder();
}
