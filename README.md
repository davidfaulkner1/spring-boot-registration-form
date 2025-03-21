# Spring Boot Registration Form Project

This project is a simple Spring Boot web application that provides a user registration form. It demonstrates basic form handling, validation, and data persistence using Spring Boot, Thymeleaf, Maven, Bootstrap, MySQL. [Link](https://github.com/davidfaulkner1/spring-boot-registration-form/blob/main/DEVELOPMENT_PROCESS.md) to my development process for this project.

## Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK):** Version 17 or later.
* **Maven:** For building and managing project dependencies.
* **Git:** For version control.
* **An IDE:** (e.g., IntelliJ IDEA, Eclipse, VS Code)

## Database Setup

1.  **Install MySQL:** Ensure you have MySQL installed and running.
   
3.  **Import Database Script:**
    * Open MySQL Workbench (or your preferred MySQL client).
    * Connect to your MySQL server.
    * Open the `src/main/resources/create_database.sql` script.
    * Execute the script to create the `aeroparker` database and the `customer_data` table.

4.  **Configure `application.properties`:**
    * Update the `application.properties` file with your MySQL database credentials.
    * Remember to use environment variables for sensitive data (e.g., database password).

## Clone, Build and Run Application

1.  **Clone the Repository:**

    ```bash
    git clone git@github.com:davidfaulkner1/spring-boot-registration-form.git
    cd spring-boot-registration-form
    ```

2.  **Build the Project:**

    ```bash
    mvn clean install
    ```

3.  **Run the Application:**

    ```bash
    mvn spring-boot:run
    ```

4.  **Access the Application:**

    * Open your web browser and navigate to `http://localhost:8080/registration`.

  
## Features

* User registration form with fields for email, title, first name, last name, address, city, postcode, and phone number.
* Email format validation and check for existing email addresses.
* Form field validation using Spring Boot's validation annotations.
* Display of validation error messages.
* Display of successful registration details.
* Bootstrap styling for a more professional user interface.
* Uses Thymeleaf for template rendering.

## Configuration

* The `application.properties` file contains configuration settings.
* If you need to change the port or other settings, modify this file.

## Technologies Used

* Spring Boot
* Thymeleaf
* Maven
* Bootstrap

## Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them.
4.  Push your changes to your fork.
5.  Create a pull request.

## Contact

If you have any questions or issues, please feel free to contact me at davidfaulkner350@gmail.com
