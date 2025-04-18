package climate;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: climate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClimateServiceGrpc {

  private ClimateServiceGrpc() {}

  public static final String SERVICE_NAME = "climate.ClimateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<climate.ClimateRequest,
      climate.ClimateStatus> getStreamClimateStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamClimateStatus",
      requestType = climate.ClimateRequest.class,
      responseType = climate.ClimateStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<climate.ClimateRequest,
      climate.ClimateStatus> getStreamClimateStatusMethod() {
    io.grpc.MethodDescriptor<climate.ClimateRequest, climate.ClimateStatus> getStreamClimateStatusMethod;
    if ((getStreamClimateStatusMethod = ClimateServiceGrpc.getStreamClimateStatusMethod) == null) {
      synchronized (ClimateServiceGrpc.class) {
        if ((getStreamClimateStatusMethod = ClimateServiceGrpc.getStreamClimateStatusMethod) == null) {
          ClimateServiceGrpc.getStreamClimateStatusMethod = getStreamClimateStatusMethod =
              io.grpc.MethodDescriptor.<climate.ClimateRequest, climate.ClimateStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamClimateStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  climate.ClimateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  climate.ClimateStatus.getDefaultInstance()))
              .setSchemaDescriptor(new ClimateServiceMethodDescriptorSupplier("StreamClimateStatus"))
              .build();
        }
      }
    }
    return getStreamClimateStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClimateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateServiceStub>() {
        @java.lang.Override
        public ClimateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateServiceStub(channel, callOptions);
        }
      };
    return ClimateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClimateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateServiceBlockingStub>() {
        @java.lang.Override
        public ClimateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateServiceBlockingStub(channel, callOptions);
        }
      };
    return ClimateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClimateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClimateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClimateServiceFutureStub>() {
        @java.lang.Override
        public ClimateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClimateServiceFutureStub(channel, callOptions);
        }
      };
    return ClimateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void streamClimateStatus(climate.ClimateRequest request,
        io.grpc.stub.StreamObserver<climate.ClimateStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamClimateStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ClimateService.
   */
  public static abstract class ClimateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ClimateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ClimateService.
   */
  public static final class ClimateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ClimateServiceStub> {
    private ClimateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamClimateStatus(climate.ClimateRequest request,
        io.grpc.stub.StreamObserver<climate.ClimateStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamClimateStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ClimateService.
   */
  public static final class ClimateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ClimateServiceBlockingStub> {
    private ClimateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<climate.ClimateStatus> streamClimateStatus(
        climate.ClimateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamClimateStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ClimateService.
   */
  public static final class ClimateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ClimateServiceFutureStub> {
    private ClimateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClimateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClimateServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_CLIMATE_STATUS = 0;

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
        case METHODID_STREAM_CLIMATE_STATUS:
          serviceImpl.streamClimateStatus((climate.ClimateRequest) request,
              (io.grpc.stub.StreamObserver<climate.ClimateStatus>) responseObserver);
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
          getStreamClimateStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              climate.ClimateRequest,
              climate.ClimateStatus>(
                service, METHODID_STREAM_CLIMATE_STATUS)))
        .build();
  }

  private static abstract class ClimateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClimateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return climate.ClimateProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClimateService");
    }
  }

  private static final class ClimateServiceFileDescriptorSupplier
      extends ClimateServiceBaseDescriptorSupplier {
    ClimateServiceFileDescriptorSupplier() {}
  }

  private static final class ClimateServiceMethodDescriptorSupplier
      extends ClimateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClimateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClimateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClimateServiceFileDescriptorSupplier())
              .addMethod(getStreamClimateStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
