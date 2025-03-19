# Development Process: Spring Boot User Registration Application

This project showcases my competency in the Model-View-Controller (MVC) architectural pattern, demonstrating a clear separation of concerns and maintainable code.

## MVC Architecture Overview

This project adheres to the Model-View-Controller (MVC) architectural pattern, separating concerns for improved maintainability and scalability.

* **Model:** Represents the data and business logic (e.g., `CustomerData` entity).
* **View:** Presents the user interface (e.g., Thymeleaf templates).
* **Controller:** Handles user requests and mediates between the Model and View (e.g., `RegistrationController`).

## 1. Environment Setup and Version Control

* **Java JDK Update:**
    * Verified existing Java version (15) and updated to Java 17 to ensure compatibility with modern Spring Boot features.
    * Utilized Adoptium for a reliable and open-source JDK distribution ([adoptium.net](https://adoptium.net/)).
* **MySQL Configuration:**
    * Installed and configured MySQL, updating environment variables for seamless integration.
    * Ensured proper database connectivity for the application.
* **Git Initialization:**
    * Initialized a local Git repository for version control, demonstrating proficiency in collaborative development practices.

## 2. Project Initialization and Configuration

* **Spring Boot Project Generation:**
    * Generated a Spring Boot project using Spring Initializr, utilizing Maven for dependency management.
* **Database Connection Configuration:**
    * Configured database connection details in `application.properties`, externalizing sensitive information (database password) to user environment variables for enhanced security.
* **Spring DevTools Integration:**
    * Integrated Spring DevTools for automatic application restarts, improving development efficiency.
* **Protected Folder Access:**
    * Allowed protected folder access, to prevent issues with the IDE.

## 3. Database Design and Implementation

* **Database Schema Creation:**
    * Designed and created a `users` table in MySQL, defining data types, constraints (NOT NULL, UNIQUE), and relationships.
    * Utilized `AUTO_INCREMENT` and `PRIMARY KEY` for efficient data management.

## 4. Data Model and Persistence Layer

* **CustomerData Entity:**
    * Created the `CustomerData` Java entity class, mapping it to the `users` table using Jakarta Persistence API (JPA) annotations.
    * Implemented data validation using Jakarta Validation annotations, ensuring data integrity.
* **CustomerDataRepository Interface:**
    * Developed the `CustomerDataRepository` interface, extending Spring Data JPA's `JpaRepository`, providing data access methods.
* **Encapsulation and Data Management:**
    * Created Getter/Setter methods, and constructors for the `CustomerData` class, to properly manage the data.

## 5. Controller and View Development

* **RegistrationController:**
    * Developed the `RegistrationController` to handle HTTP requests, processing user registration data.
* **Thymeleaf Templates:**
    * Created Thymeleaf templates (`registration.html`, `success.html`) for dynamic web page rendering.
* **Bootstrap Styling:**
    * Implemented Bootstrap styling for a responsive and visually appealing user interface.
Before: ![Screenshot 2025-03-19 022217](https://github.com/user-attachments/assets/04c48148-65e6-44e9-8c56-54547c9c288b)
After styling: ![home page bootstrap](https://github.com/user-attachments/assets/6de7aab8-73b3-489d-835c-aee52ae3d542)

## 6. Testing and Troubleshooting

* **404 Error Resolution:**
    * Addressed and resolved a 404 error by correcting URL mappings.
* **Extra Columns Issue:**
    * Resolved issues with extra columns being added to the database.
* **Email Validation:**
    * Implemented server-side email case sensitivity and uniqueness validation using MySQL's `COLLATE` clause.

* **Long Filename Issue:**
    * Troubleshot and resolved issues with long file names.

## 7. Version Control and Deployment

* **Git Repository Initialization:**
    * Initialized a Git repository for version control.
* **GitHub Repository Creation and Push:**
    * Created a GitHub repository and pushed the code to the remote repository.
* **.gitignore Implementation:**
    * Implemented proper `.gitignore` practices.
 

  ## Areas for Improvement (Future Enhancements)

If I had more time to dedicate to this project, I would focus on these areas to further enhance its robustness, maintainability, and security:

**1. Enhanced Error Handling and Validation:**

* **Robust Error Handling:**
    * Implement `try-catch` blocks to handle potential exceptions, such as database connection errors or invalid user input.
    * Provide user-friendly error messages that guide users towards resolving issues.
* **Specific Validation:**
    * Enhance form field validation using more specific Jakarta Validation annotations to enforce stricter data integrity.
    * Provide detailed and informative error messages to the user, clearly indicating the cause of validation failures.
* **Custom Error Pages:**
    * Implement custom error pages for common HTTP errors (e.g., 404, 500) to improve the user experience.

**2. Comprehensive Testing:**

* **Unit Tests:**
    * Develop unit tests for the `CustomerData` entity, `CustomerDataRepository`, and `RegistrationController` using JUnit and Spring Boot Test.
* **Integration Tests:**
    * Create integration tests to verify the interactions between different components of the application, including database interactions.

**3. Security Hardening:**

* **Password Hashing:**
    * Implement secure password hashing using bcrypt or a similar algorithm to protect user credentials.
* **Input Sanitization:**
    * Sanitize user input to prevent common web vulnerabilities, such as cross-site scripting (XSS) and SQL injection.
* **Other Security Measures:**
    * Implement best practices to prevent other common web vulnerabilities.

**4. Code Readability and Maintainability:**

* **Code Comments:**
    * Add more detailed comments to explain complex logic and design decisions, improving code readability and maintainability.
* **Service Layer Implementation:**
    * Introduce a service layer to encapsulate business logic, further separating concerns and improving the application's architecture.
