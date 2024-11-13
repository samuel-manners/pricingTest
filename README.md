# Flight Rewards Service

The **Flight Rewards Service** is a Java-based application that calculates and provides users with detailed avios rewards information for various flights.

---

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Usage](#usage)
- [Example Request](#example-request)

---

## Overview
This project provides a backend service to calculate avios rewarded for flights based on the user's input. It uses Spring Boot as the framework and Maven for dependency management. Users can interact with the service via REST API endpoints.

---

## Prerequisites
Before setting up the project, ensure the following are installed on your system:
- Java 11 (JDK)
- Maven 3.9.9
- Git (for cloning the repository)

---

## Setup

Follow these steps to set up the project:

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd <repository-directory>
2. **Run Maven Installation
   ```bash
   mvn clean install
3. **Run Application
    Open the application in your IDE of choice and run application using the file named "SpringPricingCalculator"
---

## Usage

Once the application is running:
- Interact with the service using a REST client (e.g., Postman).
- The service provides endpoints to calculate rewards based on flight parameters.

---

## Example Request

Use the following JSON to send a request to the service:

### Endpoint
**POST** `http://localhost:8080/calculate-rewards`

### Request Body
```json
{
    "flight": {
        "departureIATA": "LHR",
        "arrivalIATA": "LAX",
        "cabinCode": "M"
    }
}
