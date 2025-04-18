package discovery;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: discovery.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiscoveryServiceGrpc {

  private DiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "discovery.DiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<discovery.ServiceInfo,
      discovery.RegisterResponse> getRegisterServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterService",
      requestType = discovery.ServiceInfo.class,
      responseType = discovery.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<discovery.ServiceInfo,
      discovery.RegisterResponse> getRegisterServiceMethod() {
    io.grpc.MethodDescriptor<discovery.ServiceInfo, discovery.RegisterResponse> getRegisterServiceMethod;
    if ((getRegisterServiceMethod = DiscoveryServiceGrpc.getRegisterServiceMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getRegisterServiceMethod = DiscoveryServiceGrpc.getRegisterServiceMethod) == null) {
          DiscoveryServiceGrpc.getRegisterServiceMethod = getRegisterServiceMethod =
              io.grpc.MethodDescriptor.<discovery.ServiceInfo, discovery.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  discovery.ServiceInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  discovery.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryServiceMethodDescriptorSupplier("RegisterService"))
              .build();
        }
      }
    }
    return getRegisterServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<discovery.ServiceQuery,
      discovery.ServiceInfo> getFindServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindService",
      requestType = discovery.ServiceQuery.class,
      responseType = discovery.ServiceInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<discovery.ServiceQuery,
      discovery.ServiceInfo> getFindServiceMethod() {
    io.grpc.MethodDescriptor<discovery.ServiceQuery, discovery.ServiceInfo> getFindServiceMethod;
    if ((getFindServiceMethod = DiscoveryServiceGrpc.getFindServiceMethod) == null) {
      synchronized (DiscoveryServiceGrpc.class) {
        if ((getFindServiceMethod = DiscoveryServiceGrpc.getFindServiceMethod) == null) {
          DiscoveryServiceGrpc.getFindServiceMethod = getFindServiceMethod =
              io.grpc.MethodDescriptor.<discovery.ServiceQuery, discovery.ServiceInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  discovery.ServiceQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  discovery.ServiceInfo.getDefaultInstance()))
              .setSchemaDescriptor(new DiscoveryServiceMethodDescriptorSupplier("FindService"))
              .build();
        }
      }
    }
    return getFindServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscoveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceStub>() {
        @java.lang.Override
        public DiscoveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryServiceStub(channel, callOptions);
        }
      };
    return DiscoveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceBlockingStub>() {
        @java.lang.Override
        public DiscoveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryServiceBlockingStub(channel, callOptions);
        }
      };
    return DiscoveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscoveryServiceFutureStub>() {
        @java.lang.Override
        public DiscoveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscoveryServiceFutureStub(channel, callOptions);
        }
      };
    return DiscoveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void registerService(discovery.ServiceInfo request,
        io.grpc.stub.StreamObserver<discovery.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServiceMethod(), responseObserver);
    }

    /**
     */
    default void findService(discovery.ServiceQuery request,
        io.grpc.stub.StreamObserver<discovery.ServiceInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindServiceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DiscoveryService.
   */
  public static abstract class DiscoveryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DiscoveryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DiscoveryService.
   */
  public static final class DiscoveryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DiscoveryServiceStub> {
    private DiscoveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerService(discovery.ServiceInfo request,
        io.grpc.stub.StreamObserver<discovery.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findService(discovery.ServiceQuery request,
        io.grpc.stub.StreamObserver<discovery.ServiceInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DiscoveryService.
   */
  public static final class DiscoveryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DiscoveryServiceBlockingStub> {
    private DiscoveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public discovery.RegisterResponse registerService(discovery.ServiceInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public discovery.ServiceInfo findService(discovery.ServiceQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DiscoveryService.
   */
  public static final class DiscoveryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DiscoveryServiceFutureStub> {
    private DiscoveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscoveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<discovery.RegisterResponse> registerService(
        discovery.ServiceInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<discovery.ServiceInfo> findService(
        discovery.ServiceQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SERVICE = 0;
  private static final int METHODID_FIND_SERVICE = 1;

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
        case METHODID_REGISTER_SERVICE:
          serviceImpl.registerService((discovery.ServiceInfo) request,
              (io.grpc.stub.StreamObserver<discovery.RegisterResponse>) responseObserver);
          break;
        case METHODID_FIND_SERVICE:
          serviceImpl.findService((discovery.ServiceQuery) request,
              (io.grpc.stub.StreamObserver<discovery.ServiceInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              discovery.ServiceInfo,
              discovery.RegisterResponse>(
                service, METHODID_REGISTER_SERVICE)))
        .addMethod(
          getFindServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              discovery.ServiceQuery,
              discovery.ServiceInfo>(
                service, METHODID_FIND_SERVICE)))
        .build();
  }

  private static abstract class DiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return discovery.DiscoveryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiscoveryService");
    }
  }

  private static final class DiscoveryServiceFileDescriptorSupplier
      extends DiscoveryServiceBaseDescriptorSupplier {
    DiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class DiscoveryServiceMethodDescriptorSupplier
      extends DiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscoveryServiceFileDescriptorSupplier())
              .addMethod(getRegisterServiceMethod())
              .addMethod(getFindServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
