# Smart Home gRPC Automation System

This project is a Java-based Smart Home Automation application that demonstrates the use of gRPC for communication between a graphical client interface and multiple backend services simulating smart devices.

## 🔧 Technologies Used
- Java 17
- gRPC (v1.54.0)
- Protocol Buffers (v3.21.12)
- Maven
- Swing (Java GUI)
- NetBeans IDE

  
---

## 💡 Overview

The Smart Home Automation System includes:

- ✅ **Lighting Service** – Uses *Client Streaming RPC* to determine lighting needs based on sensor input.
- ✅ **Climate Service** – Uses *Server Streaming RPC* to simulate real-time temperature/humidity data.
- ✅ **Security Service** – Uses *Bidirectional Streaming RPC* to respond to real-time security events.
- ✅ **Discovery Service** – Uses *Unary RPC* to register and discover available smart services.

---

## 💻 GUI

A Java Swing interface allows users to:
- Input Device ID and API Key
- Call each service via dedicated buttons
- View output and error messages in real time

---

## 🔐 Authentication

Each service validates access using API keys via `AuthManager.java`.  
Unauthorized access attempts are rejected with meaningful error messages (`PERMISSION_DENIED`).

---

## 📋 Features
- Full support for all 4 gRPC communication types
- GUI-based interaction with services
- In-memory service registry for discovery
- Centralized logging
- Graceful exception handling for remote calls

---

## 🚀 How to Run

1. Start each server (`LightingServer`, `ClimateServer`, `SecurityServer`, `DiscoveryServer`) as separate Java applications.
2. Launch the GUI: `SmartHomeController` class
3. Input valid API Key (e.g., `ABC123`, `SECRET456`) and interact with the system.

---

## 🧪 Sample API Keys
- `ABC123`
- `SECRET456`
- `MYKEY789`

---

## 📌 Notes
- The system is entirely local and uses `localhost` and ports `50051~50054`.
- For demo purposes, random climate data and security events are simulated.

---

## 📎 GitHub Repository

🔗 [https://github.com/WooyounKim/SmartHomeAutomationProject](https://github.com/WooyounKim/SmartHomeAutomationProject)

---

## 📽️ Demo Video

(Insert your recorded video link here after uploading)

---

If you have any questions, feel free to raise an issue or contact the author.

