package com.wooyounkim.smarthomegrpcproject.services;

import discovery.DiscoveryServiceGrpc;
import discovery.ServiceInfo;
import discovery.RegisterResponse;
import discovery.ServiceQuery;
import io.grpc.stub.StreamObserver;
import com.wooyounkim.smarthomegrpcproject.utils.AuthManager;
import com.wooyounkim.smarthomegrpcproject.utils.Logger;

import java.util.concurrent.ConcurrentHashMap;

/**
 * DiscoveryServiceImpl manages the registration and lookup of smart home services.
 * It implements Unary RPC methods for simple request-response communication.
 */
public class DiscoveryServiceImpl extends DiscoveryServiceGrpc.DiscoveryServiceImplBase {

    // Thread-safe in-memory registry to hold service info
    private final ConcurrentHashMap<String, ServiceInfo> serviceRegistry = new ConcurrentHashMap<>();

    /**
     * Registers a new service with the discovery system.
     * Requires a valid API key.
     */
    @Override
    public void registerService(ServiceInfo request, StreamObserver<RegisterResponse> responseObserver) {
        // ✅ Step 1: Authorization
        if (!AuthManager.isAuthorized(request.getAuth().getApiKey())) {
            Logger.log("DiscoveryService", "Unauthorized attempt to register service: " + request.getServiceName());
            responseObserver.onError(new RuntimeException("Invalid API Key"));
            return;
        }

        Logger.log("DiscoveryService", "Registering service: " + request.getServiceName());

        // ✅ Step 2: Store the service info in the registry
        serviceRegistry.put(request.getServiceName().toLowerCase(), request);

        RegisterResponse response = RegisterResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Service registered successfully.")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * Finds and returns the information of a service by name.
     */
    @Override
    public void findService(ServiceQuery request, StreamObserver<ServiceInfo> responseObserver) {
        Logger.log("DiscoveryService", "Looking up service: " + request.getServiceName());

        ServiceInfo info = serviceRegistry.get(request.getServiceName().toLowerCase());

        if (info == null) {
            Logger.log("DiscoveryService", "Service not found: " + request.getServiceName());
            responseObserver.onError(new RuntimeException("Service not found"));
        } else {
            Logger.log("DiscoveryService", "Service found: " + request.getServiceName());
            responseObserver.onNext(info);
            responseObserver.onCompleted();
        }
    }
}

