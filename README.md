# 🏦 Keycloak Bank

**Keycloak Bank** is a simple application designed to demonstrate the implementation of multiple OAuth2/OIDC grant type flows using **Keycloak**. It includes various authentication flows such as:

- 🔐 Authorization Code Flow  
- 🔐 Client Credentials Flow  
- 🔐 Resource Owner Password Credentials Flow *(optional)*  
- 🔐 Implicit Flow *(deprecated but optionally demonstrated)*  

This project also integrates modern identity features like:

- 🌐 Social Login (Google, Facebook, etc.)  
- 📱 Multi-Factor Authentication (MFA) with device support

---

## 📑 Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#authen-workflow)
- [Folder Structure](#folder-structure)



---

## 📘 Introduction

**Keycloak Bank** serves as a hands-on playground for developers looking to understand and apply Keycloak's powerful identity management capabilities with OAuth2 and OpenID Connect (OIDC). It's ideal for learning, experimenting, or even as a reference for production implementations.

---

## ✨ Features

- ✅ Demonstrates multiple OAuth2/OIDC grant types
- 🔑 Full integration with **Keycloak**
- 🌐 Social login support
- 📱 MFA device enrollment and validation
- 🛡 Secure token handling and session management
- 🧩 Modular and easy-to-extend architecture

---

## 🛠 Getting Started

### ✅ Prerequisites

Before running the project, ensure you have the following installed:

- [**Docker**](https://www.docker.com/) – for running Keycloak and MySQL containers
- [**MySQL Server**](https://dev.mysql.com/downloads/mysql/) – relational database
- [**MySQL Workbench**](https://dev.mysql.com/downloads/workbench/) – GUI for managing your database
- [**Keycloak**](https://www.keycloak.org/) – identity and access management server (self-hosted or containerized)
- [**Git**](https://git-scm.com/) – version control system
- [**Maven**](https://maven.apache.org/) – build automation for Java
- [**Java JDK 17+**](https://adoptium.net/) – required to build and run the Spring Boot backend
- **An IDE for Spring development**:
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/) (Recommended)
  - or [Spring Tool Suite (STS)](https://spring.io/tools)

---

### 🔧 Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/keycloak-bank.git
cd keycloak-bank

# Build the application using Maven
./mvnw clean install  # Or: mvn clean install

# Run the Spring Boot application
./mvnw spring-boot:run  # Or: mvn spring-boot:run

# Run MySQL
docker run -d --name mysql-keycloak \
  -e MYSQL_ROOT_PASSWORD=your_root_password \
  -e MYSQL_DATABASE=keycloak \
  -e MYSQL_USER=keycloak \
  -e MYSQL_PASSWORD=keycloak_password \
  -p 3307:3306 \
  -d mysql:8.0

# Run Keycloak (Quarkus distribution, recommended)
docker run -d --name keycloak \
  -e KEYCLOAK_ADMIN=admin \
  -e KEYCLOAK_ADMIN_PASSWORD=admin \
  -p 8080:8080 \
  quay.io/keycloak/keycloak:24.0.1 \
  start-dev
```
# OAuth2 Resource Server Workflow in Spring Security

This document explains the basic workflow of how Spring Security handles OAuth2 Resource Server authentication with JWT tokens.

## Overview

- The application is configured as an **OAuth2 Resource Server** using `http.oauth2ResourceServer()`.
- This configuration **automatically adds a filter** called `BearerTokenAuthenticationFilter` to the Spring Security filter chain.
- The filter extracts the **Bearer token** from the HTTP `Authorization` header of incoming requests.

## Workflow

1. **Client Request**  
   The client sends an HTTP request to the resource server with an `Authorization` header containing the Bearer JWT token.

2. **BearerTokenAuthenticationFilter**  
   This filter intercepts the request, extracts the token, and initiates authentication.

3. **Token Validation**  
   - The token is validated using a `JwtDecoder` (if JWT is used) or via token introspection (if opaque token).  
   - Validation includes verifying the signature, expiry, and token claims.

4. **Authentication Conversion**  
   - The valid JWT is converted into a Spring Security `Authentication` object using a `JwtAuthenticationConverter`.  
   - This converter maps token claims (like roles) to Spring Security authorities.

5. **SecurityContext Population**  
   The authenticated `Authentication` object is stored in the `SecurityContext`, making user details available throughout the request lifecycle.

6. **Access Control**  
   Spring Security enforces access rules (e.g., role checks) based on the authenticated user and configured authorization rules.

7. **Request Handling or Rejection**  
   - If authentication and authorization succeed, the request proceeds to the controller.  
   - Otherwise, an error (401 Unauthorized or 403 Forbidden) is returned.
  
     ![image](https://github.com/user-attachments/assets/9d48f99b-88d0-4217-bc68-42259591e20d)
---

## Summary

- `http.oauth2ResourceServer()` **enables Resource Server support and adds the required authentication filter**.  
- The **BearerTokenAuthenticationFilter** manages the token extraction and authentication process automatically.  
- Developers can customize JWT-to-authority mapping via `JwtAuthenticationConverter`.  
- This setup ensures stateless, secure API access using OAuth2 access tokens.

  ## 📁 Folder Structure

```plaintext
KeyCloakBank/
├── KeycloakBank/           # Spring Boot backend application
│   ├── src/                # Java source code
│   ├── pom.xml             # Maven project descriptor
│   └── ...
├── bank-app-ui/            # Frontend application (e.g., React)
│   ├── src/                # Frontend source code
│   ├── package.json        # Node.js project descriptor
│   └── ...
├── README.md               # Project documentation
└── ...


  







