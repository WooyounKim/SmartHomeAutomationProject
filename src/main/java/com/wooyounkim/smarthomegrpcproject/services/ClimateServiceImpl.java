package com.wooyounkim.smarthomegrpcproject.services;

import climate.ClimateServiceGrpc;
import climate.ClimateRequest;
import climate.ClimateStatus;
import io.grpc.stub.StreamObserver;
import com.wooyounkim.smarthomegrpcproject.utils.Logger;
import com.wooyounkim.smarthomegrpcproject.utils.AuthManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * ClimateServiceImpl implements the ClimateService defined in the proto file.
 * This service streams real-time temperature and humidity updates to the client.
 * It uses Server Streaming RPC style.
 */
public class ClimateServiceImpl extends ClimateServiceGrpc.ClimateServiceImplBase {

    private final Random random = new Random();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Streams simulated climate data (temperature & humidity) every second for 5 seconds.
     * Includes basic API key authentication and logging.
     *
     * @param request           Contains device ID and authentication information
     * @param responseObserver  Used to stream ClimateStatus messages back to the client
     */
    @Override
    public void streamClimateStatus(ClimateRequest request, StreamObserver<ClimateStatus> responseObserver) {
        // Step 1: Check API key authorization
        if (!AuthManager.isAuthorized(request.getAuth().getApiKey())) {
            Logger.log("ClimateService", "Unauthorized access attempt");
            responseObserver.onError(new RuntimeException("Invalid API Key: Access denied."));
            return;
        }

        Logger.log("ClimateService", "Authorized request from device: " + request.getDeviceId());

        // Step 2: Stream 5 sets of simulated climate data (1-second interval)
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000); // simulate time delay between readings
            } catch (InterruptedException e) {
                Logger.log("ClimateService", "Streaming interrupted.");
                Thread.currentThread().interrupt();
            }

            // Generate random temperature (20.0–25.0°C) and humidity (40–50%)
            float temperature = 20 + random.nextFloat() * 5;
            float humidity = 40 + random.nextFloat() * 10;

            // Build a climate status response
            ClimateStatus status = ClimateStatus.newBuilder()
                    .setTemperature(temperature)
                    .setHumidity(humidity)
                    .setTimestamp(LocalDateTime.now().format(formatter))
                    .build();

            Logger.log("ClimateService", "Sending status: " + temperature + "°C / " + humidity + "%");

            // Send the response to the client
            responseObserver.onNext(status);
        }

        // Step 3: Notify client that streaming is complete
        responseObserver.onCompleted();
    }
}
