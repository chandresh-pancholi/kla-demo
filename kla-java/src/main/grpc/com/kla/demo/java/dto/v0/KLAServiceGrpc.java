package com.kla.demo.java.dto.v0;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: com/kla/demo/java/proto/kla.proto")
public final class KLAServiceGrpc {

  private KLAServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.proto.v0.KLAService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest,
      com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> getCreateSessionDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSessionDetail",
      requestType = com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest.class,
      responseType = com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest,
      com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> getCreateSessionDetailMethod() {
    io.grpc.MethodDescriptor<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest, com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> getCreateSessionDetailMethod;
    if ((getCreateSessionDetailMethod = KLAServiceGrpc.getCreateSessionDetailMethod) == null) {
      synchronized (KLAServiceGrpc.class) {
        if ((getCreateSessionDetailMethod = KLAServiceGrpc.getCreateSessionDetailMethod) == null) {
          KLAServiceGrpc.getCreateSessionDetailMethod = getCreateSessionDetailMethod = 
              io.grpc.MethodDescriptor.<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest, com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.proto.v0.KLAService", "CreateSessionDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KLAServiceMethodDescriptorSupplier("CreateSessionDetail"))
                  .build();
          }
        }
     }
     return getCreateSessionDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> getGetSessionDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSessionDetails",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> getGetSessionDetailsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> getGetSessionDetailsMethod;
    if ((getGetSessionDetailsMethod = KLAServiceGrpc.getGetSessionDetailsMethod) == null) {
      synchronized (KLAServiceGrpc.class) {
        if ((getGetSessionDetailsMethod = KLAServiceGrpc.getGetSessionDetailsMethod) == null) {
          KLAServiceGrpc.getGetSessionDetailsMethod = getGetSessionDetailsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.proto.v0.KLAService", "GetSessionDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new KLAServiceMethodDescriptorSupplier("GetSessionDetails"))
                  .build();
          }
        }
     }
     return getGetSessionDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest,
      com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> getCreateSessionInBulkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSessionInBulk",
      requestType = com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest.class,
      responseType = com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest,
      com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> getCreateSessionInBulkMethod() {
    io.grpc.MethodDescriptor<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest, com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> getCreateSessionInBulkMethod;
    if ((getCreateSessionInBulkMethod = KLAServiceGrpc.getCreateSessionInBulkMethod) == null) {
      synchronized (KLAServiceGrpc.class) {
        if ((getCreateSessionInBulkMethod = KLAServiceGrpc.getCreateSessionInBulkMethod) == null) {
          KLAServiceGrpc.getCreateSessionInBulkMethod = getCreateSessionInBulkMethod = 
              io.grpc.MethodDescriptor.<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest, com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.proto.v0.KLAService", "CreateSessionInBulk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KLAServiceMethodDescriptorSupplier("CreateSessionInBulk"))
                  .build();
          }
        }
     }
     return getCreateSessionInBulkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KLAServiceStub newStub(io.grpc.Channel channel) {
    return new KLAServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KLAServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KLAServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KLAServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KLAServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class KLAServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSessionDetail(com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest request,
        io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSessionDetailMethod(), responseObserver);
    }

    /**
     */
    public void getSessionDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSessionDetailsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> createSessionInBulk(
        io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateSessionInBulkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSessionDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest,
                com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse>(
                  this, METHODID_CREATE_SESSION_DETAIL)))
          .addMethod(
            getGetSessionDetailsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest>(
                  this, METHODID_GET_SESSION_DETAILS)))
          .addMethod(
            getCreateSessionInBulkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest,
                com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse>(
                  this, METHODID_CREATE_SESSION_IN_BULK)))
          .build();
    }
  }

  /**
   */
  public static final class KLAServiceStub extends io.grpc.stub.AbstractStub<KLAServiceStub> {
    private KLAServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KLAServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KLAServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KLAServiceStub(channel, callOptions);
    }

    /**
     */
    public void createSessionDetail(com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest request,
        io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSessionDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSessionDetails(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetSessionDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> createSessionInBulk(
        io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCreateSessionInBulkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class KLAServiceBlockingStub extends io.grpc.stub.AbstractStub<KLAServiceBlockingStub> {
    private KLAServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KLAServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KLAServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KLAServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse createSessionDetail(com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSessionDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest> getSessionDetails(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetSessionDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KLAServiceFutureStub extends io.grpc.stub.AbstractStub<KLAServiceFutureStub> {
    private KLAServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KLAServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KLAServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KLAServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse> createSessionDetail(
        com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSessionDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SESSION_DETAIL = 0;
  private static final int METHODID_GET_SESSION_DETAILS = 1;
  private static final int METHODID_CREATE_SESSION_IN_BULK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KLAServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KLAServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SESSION_DETAIL:
          serviceImpl.createSessionDetail((com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse>) responseObserver);
          break;
        case METHODID_GET_SESSION_DETAILS:
          serviceImpl.getSessionDetails((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest>) responseObserver);
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
        case METHODID_CREATE_SESSION_IN_BULK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createSessionInBulk(
              (io.grpc.stub.StreamObserver<com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KLAServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KLAServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kla.demo.java.dto.v0.KLAProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KLAService");
    }
  }

  private static final class KLAServiceFileDescriptorSupplier
      extends KLAServiceBaseDescriptorSupplier {
    KLAServiceFileDescriptorSupplier() {}
  }

  private static final class KLAServiceMethodDescriptorSupplier
      extends KLAServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KLAServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KLAServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KLAServiceFileDescriptorSupplier())
              .addMethod(getCreateSessionDetailMethod())
              .addMethod(getGetSessionDetailsMethod())
              .addMethod(getCreateSessionInBulkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
