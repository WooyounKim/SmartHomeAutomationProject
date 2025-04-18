/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wooyounkim.smarthomegrpcproject.servers;

import climate.ClimateRequest;
import climate.ClimateServiceGrpc;
import climate.ClimateStatus;
import com.wooyounkim.smarthomegrpcproject.utils.AuthManager;
import com.wooyounkim.smarthomegrpcproject.utils.SimpleLogger;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class ClimateServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Start gRPC server on port 50052
        Server server = ServerBuilder
                .forPort(50052)
                .addService(new ClimateServiceImpl())
                .build();

        server.start();
        System.out.println("✅ ClimateService server started on port 50052.");
        server.awaitTermination();
    }

    // Inner class: implementation of the ClimateService
    static class ClimateServiceImpl extends ClimateServiceGrpc.ClimateServiceImplBase {

        @Override
        public void streamClimateStatus(ClimateRequest request, StreamObserver<ClimateStatus> responseObserver) {
            String apiKey = request.getAuth().getApiKey();

            // Check API key validity
            if (!AuthManager.isAuthorized(apiKey)) {
                responseObserver.onError(new SecurityException("❌ Invalid API key"));
                return;
            }

            // Simulate 3 climate updates
            for (int i = 0; i < 3; i++) {
                ClimateStatus status = ClimateStatus.newBuilder()
                        .setTemperature(20 + i)
                        .setHumidity(50 + i * 5)
                        .setTimestamp(String.valueOf(System.currentTimeMillis()))
                        .build();

                responseObserver.onNext(status);
                SimpleLogger.log("✅ Sent climate update " + (i + 1));
                try {
                    Thread.sleep(1000); // Simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            responseObserver.onCompleted();
            SimpleLogger.log("🌡️ Climate stream completed for device: " + request.getDeviceId());
        }
    }
}
