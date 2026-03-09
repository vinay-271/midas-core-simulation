# Midas Core Simulation

A Java-based simulation system developed as part of the **JPMC Advanced Software Engineering Forage program**.

## Overview

This project implements a core simulation system built with Java and Spring Boot, designed to process and manage service-oriented workflows. The application provides a modular architecture with dedicated service components.

## Architecture

The project follows a microservices-inspired structure:
- **src/main** - Core application source code
- **src/test** - Unit and integration tests
- **services/** - Service layer components
- **application.yml** - Spring Boot configuration file

## Tech Stack

- **Language**: Java
- **Build Tool**: Maven
- **Framework**: Spring Boot (inferred from application.yml)

## Getting Started

### Prerequisites
- Java JDK 11 or higher
- Maven 3.6+

### Build & Run
```bash
# Build the project
./mvnw clean package

# Run the application
./mvnw spring-boot:run
```

### Windows Users
```bash
mvnw.cmd clean package
mvnw.cmd spring-boot:run
```

## Project Structure

```
├── src/
│   ├── main/          # Application source code
│   └── test/          # Test cases
├── services/          # Service layer
├── pom.xml            # Maven dependencies and build config
└── application.yml    # Application configuration
```

## License

Part of the JPMC Advanced Software Engineering Forage program.