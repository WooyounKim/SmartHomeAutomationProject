package security;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: security.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SecurityServiceGrpc {

  private SecurityServiceGrpc() {}

  public static final String SERVICE_NAME = "security.SecurityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<security.SecurityEvent,
      security.SecurityResponse> getMonitorSecurityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorSecurity",
      requestType = security.SecurityEvent.class,
      responseType = security.SecurityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<security.SecurityEvent,
      security.SecurityResponse> getMonitorSecurityMethod() {
    io.grpc.MethodDescriptor<security.SecurityEvent, security.SecurityResponse> getMonitorSecurityMethod;
    if ((getMonitorSecurityMethod = SecurityServiceGrpc.getMonitorSecurityMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getMonitorSecurityMethod = SecurityServiceGrpc.getMonitorSecurityMethod) == null) {
          SecurityServiceGrpc.getMonitorSecurityMethod = getMonitorSecurityMethod =
              io.grpc.MethodDescriptor.<security.SecurityEvent, security.SecurityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorSecurity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  security.SecurityEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  security.SecurityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("MonitorSecurity"))
              .build();
        }
      }
    }
    return getMonitorSecurityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceStub>() {
        @java.lang.Override
        public SecurityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceStub(channel, callOptions);
        }
      };
    return SecurityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceBlockingStub>() {
        @java.lang.Override
        public SecurityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceBlockingStub(channel, callOptions);
        }
      };
    return SecurityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecurityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecurityServiceFutureStub>() {
        @java.lang.Override
        public SecurityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecurityServiceFutureStub(channel, callOptions);
        }
      };
    return SecurityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<security.SecurityEvent> monitorSecurity(
        io.grpc.stub.StreamObserver<security.SecurityResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorSecurityMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SecurityService.
   */
  public static abstract class SecurityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SecurityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SecurityService.
   */
  public static final class SecurityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SecurityServiceStub> {
    private SecurityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<security.SecurityEvent> monitorSecurity(
        io.grpc.stub.StreamObserver<security.SecurityResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorSecurityMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SecurityService.
   */
  public static final class SecurityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SecurityServiceBlockingStub> {
    private SecurityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SecurityService.
   */
  public static final class SecurityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SecurityServiceFutureStub> {
    private SecurityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecurityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_MONITOR_SECURITY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_SECURITY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorSecurity(
              (io.grpc.stub.StreamObserver<security.SecurityResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMonitorSecurityMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              security.SecurityEvent,
              security.SecurityResponse>(
                service, METHODID_MONITOR_SECURITY)))
        .build();
  }

  private static abstract class SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return security.SecurityProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityService");
    }
  }

  private static final class SecurityServiceFileDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier {
    SecurityServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityServiceMethodDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityServiceFileDescriptorSupplier())
              .addMethod(getMonitorSecurityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
