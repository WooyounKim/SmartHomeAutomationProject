package com.wooyounkim.smarthomegrpcproject.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Logger provides simple logging functionality.
 * It prints to the console and writes logs to a file named after the service.
 */
public class Logger {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Logs a message with timestamp and service name.
     * Writes to both console and a log file (e.g., logs/SecurityService.log).
     *
     * @param serviceName Name of the service (e.g., "LightingService")
     * @param message     Message to log
     */
    public static void log(String serviceName, String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logMessage = "[" + timestamp + "] " + message;

        // Print to console
        System.out.println(serviceName + ": " + logMessage);

        // Also write to file
        String logFile = "logs/" + serviceName + ".log";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(logMessage);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Logger: Failed to write log file - " + e.getMessage());
        }
    }
}

