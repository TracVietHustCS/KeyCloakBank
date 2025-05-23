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
- [Usage](#usage)
- [Folder Structure](#folder-structure)
- [Contributing](#contributing)
- [Author](#author)
- [License](#license)

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





