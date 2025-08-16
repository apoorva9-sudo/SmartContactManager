
# Smart Contact Manager

A **Spring Boot** application to manage contacts efficiently, providing REST APIs for CRUD operations. The application integrates with **MySQL** (or **H2** for testing) and uses **Hibernate ORM** for data persistence.

---

## Features

- Add, update, delete, and retrieve contacts.
- RESTful API endpoints for all operations.
- MySQL database integration for persistent storage.
- H2 database for testing and in-memory operations.
- Built with Spring Boot and Spring Data JPA.
- Tested using POSTMAN.

---

## Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate ORM  
- **Database:** MySQL (H2 for testing)  
- **API Testing:** POSTMAN  
- **IDE:** IntelliJ IDEA  
- **Version Control:** Git, GitHub  

---


## Project Structure

smart-contact-manager/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/project/smartcontact/
│       │       ├── controller/    # REST Controllers
│       │       ├── model/         # JPA Entities
│       │       ├── repository/    # Spring Data JPA Repositories
│       │       └── service/       # Business Logic
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md



---

## API Endpoints

| Method | Endpoint              | Description                  |
|--------|---------------------|------------------------------|
| GET    | /api/contacts        | Get all contacts             |
| GET    | /api/contacts/{id}   | Get a contact by ID          |
| POST   | /api/contacts        | Add a new contact            |
| PUT    | /api/contacts/{id}   | Update a contact by ID       |
| DELETE | /api/contacts/{id}   | Delete a contact by ID       |

---

## Setup Instructions

1. **Clone the repository**
```bash
git clone https://github.com/apoorva9-sudo/SmartContactManager.git
cd SmartContactManager
spring.datasource.url=jdbc:mysql://localhost:3306/smart_contact
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
mvn spring-boot:run
Test APIs

Use POSTMAN to test endpoints at http://localhost:8080/api/contacts
