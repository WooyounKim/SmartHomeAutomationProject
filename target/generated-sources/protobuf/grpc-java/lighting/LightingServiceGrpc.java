package lighting;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: lighting.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LightingServiceGrpc {

  private LightingServiceGrpc() {}

  public static final String SERVICE_NAME = "lighting.LightingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lighting.LightingInput,
      lighting.LightingDecision> getConfigureLightingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConfigureLighting",
      requestType = lighting.LightingInput.class,
      responseType = lighting.LightingDecision.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<lighting.LightingInput,
      lighting.LightingDecision> getConfigureLightingMethod() {
    io.grpc.MethodDescriptor<lighting.LightingInput, lighting.LightingDecision> getConfigureLightingMethod;
    if ((getConfigureLightingMethod = LightingServiceGrpc.getConfigureLightingMethod) == null) {
      synchronized (LightingServiceGrpc.class) {
        if ((getConfigureLightingMethod = LightingServiceGrpc.getConfigureLightingMethod) == null) {
          LightingServiceGrpc.getConfigureLightingMethod = getConfigureLightingMethod =
              io.grpc.MethodDescriptor.<lighting.LightingInput, lighting.LightingDecision>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConfigureLighting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.LightingInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lighting.LightingDecision.getDefaultInstance()))
              .setSchemaDescriptor(new LightingServiceMethodDescriptorSupplier("ConfigureLighting"))
              .build();
        }
      }
    }
    return getConfigureLightingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingServiceStub>() {
        @java.lang.Override
        public LightingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingServiceStub(channel, callOptions);
        }
      };
    return LightingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingServiceBlockingStub>() {
        @java.lang.Override
        public LightingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingServiceBlockingStub(channel, callOptions);
        }
      };
    return LightingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LightingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LightingServiceFutureStub>() {
        @java.lang.Override
        public LightingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LightingServiceFutureStub(channel, callOptions);
        }
      };
    return LightingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<lighting.LightingInput> configureLighting(
        io.grpc.stub.StreamObserver<lighting.LightingDecision> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getConfigureLightingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LightingService.
   */
  public static abstract class LightingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LightingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LightingService.
   */
  public static final class LightingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LightingServiceStub> {
    private LightingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<lighting.LightingInput> configureLighting(
        io.grpc.stub.StreamObserver<lighting.LightingDecision> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getConfigureLightingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LightingService.
   */
  public static final class LightingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LightingServiceBlockingStub> {
    private LightingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LightingService.
   */
  public static final class LightingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LightingServiceFutureStub> {
    private LightingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LightingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONFIGURE_LIGHTING = 0;

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
        case METHODID_CONFIGURE_LIGHTING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.configureLighting(
              (io.grpc.stub.StreamObserver<lighting.LightingDecision>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getConfigureLightingMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              lighting.LightingInput,
              lighting.LightingDecision>(
                service, METHODID_CONFIGURE_LIGHTING)))
        .build();
  }

  private static abstract class LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lighting.LightingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightingService");
    }
  }

  private static final class LightingServiceFileDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier {
    LightingServiceFileDescriptorSupplier() {}
  }

  private static final class LightingServiceMethodDescriptorSupplier
      extends LightingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightingServiceFileDescriptorSupplier())
              .addMethod(getConfigureLightingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
