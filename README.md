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

### Prerequisites

- Node.js / Java (depending on your backend stack)
- Docker (for running Keycloak)
- Git

### Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/keycloak-bank.git
cd keycloak-bank

# Install dependencies
npm install

# Run the app
npm start
