# spring-boot-restfull-api

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.x-brightgreen.svg) ![MySQL](https://img.shields.io/badge/MySQL-8.x-blue.svg)

This is a simple Spring Boot RESTful API project that demonstrates CRUD operations using MySQL as the database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Build and Run](#build-and-run)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or later
- Maven or Gradle build tool
- MySQL 8.x server
- Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)

## Getting Started

1. Clone this repository:

   ```
   git clone https://github.com/Wanziro/spring-boot-restfull-api.git
   ```
   
Configure MySQL database settings in src/main/resources/application.properties:

```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
```


Configuration
Additional configuration can be done in the `application.properties` file. You can set various properties like server port, logging levels, etc.

## API Endpoints
This API exposes the following endpoints:

- GET /api/users: Retrieve a list of users
- GET /api/user/{id}: Retrieve details of a specific user
- POST /api/user: Create a new user
- PUT /api/user/{id}: Update an existing user
- DELETE /api/user/{id}: Delete a user

## Build and Run
Build the project using Maven:
`mvn clean install`

Run the application:
`java -jar target/spring-boot-restful-api.jar`

