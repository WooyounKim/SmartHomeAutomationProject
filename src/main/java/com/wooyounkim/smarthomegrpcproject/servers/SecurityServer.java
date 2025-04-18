/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wooyounkim.smarthomegrpcproject.servers;

import com.wooyounkim.smarthomegrpcproject.services.SecurityServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * SecurityServer starts the gRPC server for handling security-related events in the smart home.
 */
public class SecurityServer {

    public static void main(String[] args) {
        int port = 50053;  // Port for the security service

        try {
            // Build the server with the SecurityServiceImpl implementation
            Server server = ServerBuilder.forPort(port)
                    .addService(new SecurityServiceImpl())
                    .build()
                    .start();

            System.out.println("🔐 SecurityService server started on port " + port);

            // Keep the server running
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            System.err.println("❌ Failed to start SecurityService server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
