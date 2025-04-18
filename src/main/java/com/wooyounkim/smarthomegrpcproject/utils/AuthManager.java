package com.wooyounkim.smarthomegrpcproject.utils;

import java.util.HashSet;
import java.util.Set;

/**
 * AuthManager is responsible for validating API keys.
 * It allows only predefined keys to access the system.
 */
public class AuthManager {

    // ✅ Set of allowed API keys (can be expanded or loaded from config/db in real system)
    private static final Set<String> validApiKeys = new HashSet<>();

    // Static block to populate initial valid API keys
    static {
        validApiKeys.add("ABC123");  // Example API key
        validApiKeys.add("SECRET456");
        validApiKeys.add("MYKEY789");
    }

    /**
     * Validates whether the given API key is authorized.
     * @param apiKey The API key provided in the request
     * @return true if authorized, false otherwise
     */
    public static boolean isAuthorized(String apiKey) {
        return validApiKeys.contains(apiKey);
    }
}

