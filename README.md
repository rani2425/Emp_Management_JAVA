# Emp_Management_JAVA

# Project Overview

The Employee Management System is a web-based application developed to manage employee records efficiently. It supports various operations such as adding new employees, updating existing employee details, and managing employee data securely. The system is built using Java, JSP, HTML, CSS, JavaScript, MySQL, and runs on Apache Tomcat.

# Features

-- Add new employees
-- Update employee information
-- View employee details
-- Secure login for administrators

# Technologies Used

- **Java**: The core programming language used for building the application's backend.
- **JSP (JavaServer Pages)**: Used for creating dynamic web content.
- **HTML**: Markup language for structuring the web pages.
- **CSS**: Stylesheet language for designing the web pages.
- **JavaScript**: Scripting language for enhancing user interactions on the web pages.
- **MySQL**: Relational database management system used for storing employee data.
- **Apache Tomcat**: Servlet container used for deploying and running the web application.

# Project Structure
Employee_Management_System/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/
│ │ │ │ ├── ConnectionFactory/
│ │ │ │ │ └── ConnectionFactory.java
│ │ │ │ ├── Controller/
│ │ │ │ ├── Dao/
│ │ │ │ ├── Entity/
│ │ ├── webapp/
│ │ ├── META-INF/
│ │ ├── WEB-INF/
│ │ │ ├── data/
│ │ │ └── lib/
│ │ │ └── mysql-connector-java-8.0.30.jar
│ │ ├── add.html
│ │ ├── employee.css
│ │ ├── employee.js
│ │ ├── home.jsp
│ │ ├── index.html
│ │ ├── login.html
│ │ ├── update.jsp


# Setup and Installation
-- Java Development Kit (JDK) 8 or higher
-- Apache Tomcat server
-- MySQL database

# steps
-- Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
-- Configure the MySQL database
-- Build the project using Dynamic Web Project
-- Deploy the application to the Apache Tomcat server


# Usage
-- Login: Navigate to the login page and enter your administrator credentials.
-- Add Employee: Use the add form to enter new employee details.
-- Update Employee: Select an employee to update their information.
-- View Employees: Access the list of all employees.


# File Descriptions
# Java Files
-- ConnectionFactory.java: Manages the database connection.
-- Controller: Contains servlets that handle HTTP requests and responses.
-- Dao: Data Access Object classes for database operations.
-- Entity: Java classes that represent the database entities.

# Web Files
-- add.html: Form to add new employees.
-- employee.css: Stylesheet for the employee pages.
-- employee.js: JavaScript functions for employee operations.
-- home.jsp: Home page of the application.
-- index.html: Landing page.
-- login.html: Login page for administrators.
-- update.jsp: Page to update employee details.

# Libraries
-- mysql-connector-java-8.0.30.jar: MySQL Connector/J library for database connection.
