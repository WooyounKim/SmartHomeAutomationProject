package com.wooyounkim.smarthomegrpcproject.services;

import security.SecurityServiceGrpc;
import security.SecurityEvent;
import security.SecurityResponse;
import io.grpc.stub.StreamObserver;
import com.wooyounkim.smarthomegrpcproject.utils.Logger;
import com.wooyounkim.smarthomegrpcproject.utils.AuthManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * SecurityServiceImpl handles bidirectional streaming between client and server.
 * Clients stream security events (e.g., motion, door open), and the server responds with actions.
 */
public class SecurityServiceImpl extends SecurityServiceGrpc.SecurityServiceImplBase {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Called when a client opens a bidirectional stream for security monitoring.
     * For each security event received, an appropriate response is streamed back.
     */
    @Override
    public StreamObserver<SecurityEvent> monitorSecurity(StreamObserver<SecurityResponse> responseObserver) {
        return new StreamObserver<SecurityEvent>() {

            @Override
            public void onNext(SecurityEvent event) {
                // ✅ Step 1: API Key check
                if (!AuthManager.isAuthorized(event.getAuth().getApiKey())) {
                    Logger.log("SecurityService", "Unauthorized access attempt from " + event.getDeviceId());
                    responseObserver.onError(new RuntimeException("Unauthorized"));
                    return;
                }

                Logger.log("SecurityService", "Received event: " + event.getEventType() + " from " + event.getDeviceId());

                // ✅ Step 2: Determine response based on event type
                String action;
                String message;

                switch (event.getEventType().toLowerCase()) {
                    case "motion":
                        action = "alarm_triggered";
                        message = "Motion detected – security alert sent.";
                        break;
                    case "door_open":
                        action = "lock_door";
                        message = "Door opened – auto-locking initiated.";
                        break;
                    case "window_broken":
                        action = "alarm_triggered";
                        message = "Window breakage – emergency services notified.";
                        break;
                    default:
                        action = "none";
                        message = "Unknown event – no action taken.";
                }

                // ✅ Step 3: Send response back to client
                SecurityResponse response = SecurityResponse.newBuilder()
                        .setAction(action)
                        .setMessage(message)
                        .setTimestamp(LocalDateTime.now().format(formatter))
                        .build();

                Logger.log("SecurityService", "Sending response: " + action + " - " + message);
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                Logger.log("SecurityService", "Client stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                Logger.log("SecurityService", "Client stream completed.");
                responseObserver.onCompleted();
            }
        };
    }
}
