/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wooyounkim.smarthomegrpcproject.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class SimpleLogger {
    private static final String LOG_FILE = "logs/smarthome.log";

    public static void log(String message) {
        String timestampedMessage = "[" + LocalDateTime.now() + "] " + message;
        System.out.println(timestampedMessage);

        try (PrintWriter out = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            out.println(timestampedMessage);
        } catch (IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}
