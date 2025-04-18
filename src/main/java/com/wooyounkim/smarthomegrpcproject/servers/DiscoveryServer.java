/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wooyounkim.smarthomegrpcproject.servers;

import com.wooyounkim.smarthomegrpcproject.utils.AuthManager;
import com.wooyounkim.smarthomegrpcproject.utils.SimpleLogger;
import discovery.*;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DiscoveryServer {

    // In-memory registry for service discovery
    private static final Map<String, ServiceInfo> registry = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        DiscoveryServer server = new DiscoveryServer();
        server.start();
    }

    private void start() throws IOException, InterruptedException {
        int port = 50054;
        Server server = ServerBuilder.forPort(port)
                .addService(new DiscoveryServiceImpl())
                .build()
                .start();

        SimpleLogger.log("🔍 Discovery Service started on port " + port);

        // ✅ Static registration for demo/testing
        registerStaticServices();

        server.awaitTermination();
    }

    private void registerStaticServices() {
        // ✅ These entries are always available to GUI discovery
        registry.put("LightingService", ServiceInfo.newBuilder()
                .setServiceName("LightingService")
                .setHost("localhost")
                .setPort(50051)
                .setDescription("Handles smart lighting configuration")
                .build());

        registry.put("ClimateService", ServiceInfo.newBuilder()
                .setServiceName("ClimateService")
                .setHost("localhost")
                .setPort(50052)
                .setDescription("Streams climate data like temp & humidity")
                .build());

        registry.put("SecurityService", ServiceInfo.newBuilder()
                .setServiceName("SecurityService")
                .setHost("localhost")
                .setPort(50053)
                .setDescription("Monitors home security events")
                .build());

        SimpleLogger.log("📋 Static services registered: " + registry.keySet());
    }

    static class DiscoveryServiceImpl extends DiscoveryServiceGrpc.DiscoveryServiceImplBase {
        @Override
        public void registerService(ServiceInfo request, StreamObserver<RegisterResponse> responseObserver) {
            String apiKey = request.getAuth().getApiKey();
            if (!AuthManager.isAuthorized(apiKey)) {
                responseObserver.onNext(RegisterResponse.newBuilder()
                        .setSuccess(false)
                        .setMessage("Invalid API Key")
                        .build());
                responseObserver.onCompleted();
                return;
            }

            registry.put(request.getServiceName(), request);
            SimpleLogger.log("✅ Registered service: " + request.getServiceName());

            responseObserver.onNext(RegisterResponse.newBuilder()
                    .setSuccess(true)
                    .setMessage("Service registered successfully")
                    .build());
            responseObserver.onCompleted();
        }

        @Override
        public void findService(ServiceQuery request, StreamObserver<ServiceInfo> responseObserver) {
            String name = request.getServiceName();
            ServiceInfo info = registry.get(name);

            if (info != null) {
                SimpleLogger.log("🔎 Found service: " + name);
                responseObserver.onNext(info);
            } else {
                SimpleLogger.log("❌ Service not found: " + name);
                responseObserver.onError(new RuntimeException("Service not found: " + name));
                return;
            }

            responseObserver.onCompleted();
        }
    }
}

