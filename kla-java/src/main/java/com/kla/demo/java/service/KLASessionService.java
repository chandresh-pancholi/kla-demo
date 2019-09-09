package com.kla.demo.java.service;

import com.google.protobuf.Empty;
import com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailRequest;
import com.kla.demo.java.dto.v0.KLAProto.CreateSessionDetailResponse;
import com.kla.demo.java.dto.v0.KLAServiceGrpc;
import com.kla.demo.java.entity.Session;
import com.kla.demo.java.repository.SessionRepository;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@Slf4j
public class KLASessionService extends KLAServiceGrpc.KLAServiceImplBase {

  @Autowired
  private SessionRepository sessionRepository;

  @Override
  public void createSessionDetail(CreateSessionDetailRequest request,
      StreamObserver<CreateSessionDetailResponse> responseObserver) {

    Session session = Session.builder()
        .sessionId(UUID.randomUUID().toString())
        .name(request.getName())
        .talk(request.getTalk())
        .abstractTalk(request.getAbstract())
        .talkTime(request.getTalkTime())
        .build();
    sessionRepository.save(session);

    responseObserver.onNext(CreateSessionDetailResponse.newBuilder().build());
    responseObserver.onCompleted();
  }

  @Override
  public void getSessionDetails(Empty request,
      StreamObserver<CreateSessionDetailRequest> responseObserver) {

    List<Session> allSession = sessionRepository.findAll();

    for (Session session : allSession) {
      CreateSessionDetailRequest createSessionDetailRequest = CreateSessionDetailRequest.newBuilder()
          .setName(session.getName())
          .setTalk(session.getTalk())
          .setAbstract(session.getAbstractTalk())
          .setTalkTime(session.getTalkTime())
          .build();
      responseObserver.onNext(createSessionDetailRequest);
    }

    responseObserver.onCompleted();
  }


  @Override
  public StreamObserver<CreateSessionDetailRequest> createSessionInBulk(
      StreamObserver<CreateSessionDetailResponse> responseObserver) {

    return new StreamObserver<CreateSessionDetailRequest>() {
      @Override
      public void onNext(CreateSessionDetailRequest request) {
        Session session = Session.builder()
            .sessionId(UUID.randomUUID().toString())
            .name(request.getName())
            .talk(request.getTalk())
            .abstractTalk(request.getAbstract())
            .talkTime(request.getTalkTime())
            .build();
        sessionRepository.save(session);

        responseObserver.onNext(CreateSessionDetailResponse.newBuilder().build());
      }

      @Override
      public void onError(Throwable t) {
        log.error("error in creating session in bulk ", t);
      }

      @Override
      public void onCompleted() {
        responseObserver.onCompleted();
      }
    };
  }
}
