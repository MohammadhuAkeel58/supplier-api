# Supplier API

This is a Spring Boot application that provides a REST API for managing suppliers.

## Prerequisites

- JDK 17 or higher
- Maven

## How to Run

1. Clone the repository:

   git clone https://github.com/MohammadhuAkeel58/supplier-api.git
   cd supplier-api

2.Build the project using Maven
   mvn clean install

3.Run the Application
   mvn spring-boot:run
   
4.Access the H2 console at http://localhost:8080/h2-console.
JDBC URL: jdbc:h2:test
Username: sa
Password: (leave empty)

5.API endpoints
GET/suppliers/{supplierId}  - Retrieve a specific suppliers
GET/suppliers - Retrieve all suppliers
POST/suppliers - Create a new supplier
DELETE/suppliers/{supplierId} - Delete a specific supplier

