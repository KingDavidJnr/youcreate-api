# YouCreate

**YouCreate** is a simple Spring Boot CRUD API for managing creators and videos.  
This project is built with Java, Spring Boot, Spring Data JPA, and uses an H2 in-memory database for testing.

---

## Features

- Create, Read, Update, Delete (CRUD) operations for Creators and Videos
- RESTful API endpoints
- In-memory H2 database for quick development and testing
- Organized project structure following standard Spring Boot conventions

---

## Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Lombok** (to reduce boilerplate code)
- **Maven** for build and dependency management

---

## Getting Started

### Prerequisites

- Java 17 installed
- Maven installed
- IDE like VSCode, IntelliJ, or Eclipse

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/KingDavidJnr/youcreate-api
   cd youcreate-api
   ```
2. Build the project with Maven:

   ```bash
   mvn clean install
   ```

3. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

4. Visit the default endpoint in your browser or Postman:

   ```
   http://localhost:8080/
   ```

   You should see:

   ```
   YouCreate API is running!
   ```

---

## Project Structure

```
src/main/java/com/youcreate/youcreate/
│
├── controller/    # REST controllers
├── service/       # Business logic
├── entity/        # JPA entities
├── repository/    # Spring Data JPA repositories
└── YouCreateApplication.java   # Spring Boot main class
```

## Notes

* H2 Database is used for now; you can configure other databases later in `application.properties`.
* The project currently does not include authentication; JWT and user management can be added in the future.
