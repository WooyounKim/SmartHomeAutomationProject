package com.wooyounkim.smarthomegrpcproject.services;

import lighting.LightingServiceGrpc;
import lighting.LightingInput;
import lighting.LightingDecision;
import io.grpc.stub.StreamObserver;
import com.wooyounkim.smarthomegrpcproject.utils.Logger;
import com.wooyounkim.smarthomegrpcproject.utils.AuthManager;

import java.util.ArrayList;
import java.util.List;

public class LightingServiceImpl extends LightingServiceGrpc.LightingServiceImplBase {

    @Override
    public StreamObserver<LightingInput> configureLighting(StreamObserver<LightingDecision> responseObserver) {
        return new StreamObserver<LightingInput>() {
            List<LightingInput> inputs = new ArrayList<>();

            @Override
            public void onNext(LightingInput input) {
                // Authentification
                if (!AuthManager.isAuthorized(input.getAuth().getApiKey())) {
                    Logger.log("LightingService", "Unauthorized access attempt");
                    responseObserver.onError(
                        new RuntimeException("Invalid API Key: Access denied.")
                    );
                    return;
                }

                Logger.log("LightingService", "Received input: " + input.getSensorType() + "=" + input.getValue());
                inputs.add(input);
            }

            @Override
            public void onError(Throwable t) {
                Logger.log("LightingService", "Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                // logic: ambient = dark + motion = present → light ON
                boolean dark = false, motion = false;

                for (LightingInput input : inputs) {
                    if (input.getSensorType().equalsIgnoreCase("ambient") && input.getValue().equalsIgnoreCase("dark")) {
                        dark = true;
                    }
                    if (input.getSensorType().equalsIgnoreCase("motion") && input.getValue().equalsIgnoreCase("present")) {
                        motion = true;
                    }
                }

                String mode = (dark && motion) ? "on" : "off";
                String reason = (dark && motion) ? "Dark environment with motion detected" : "No need for lighting";

                LightingDecision decision = LightingDecision.newBuilder()
                        .setLightingMode(mode)
                        .setReason(reason)
                        .build();

                Logger.log("LightingService", "Responding with lightingMode=" + mode);
                responseObserver.onNext(decision);
                responseObserver.onCompleted();
            }
        };
    }
}

