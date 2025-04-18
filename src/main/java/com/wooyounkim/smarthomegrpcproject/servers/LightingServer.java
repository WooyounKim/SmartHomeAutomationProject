/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wooyounkim.smarthomegrpcproject.servers;

import com.wooyounkim.smarthomegrpcproject.services.LightingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * LightingService gRPC Server
 * This class launches the gRPC server to handle LightingService requests.
 */
public class LightingServer {

    public static void main(String[] args) {
        int port = 50051; // Must match the port used in the GUI client

        try {
            // Build and start the gRPC server
            Server server = ServerBuilder.forPort(port)
                    .addService(new LightingServiceImpl())
                    .build()
                    .start();

            System.out.println("✅ LightingService server started on port " + port);

            // Keep the server running until terminated
            server.awaitTermination();

        } catch (Exception e) {
            System.err.println("❌ LightingServer failed to start: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


