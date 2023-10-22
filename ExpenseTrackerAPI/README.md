# Expense Tracker API

## Introduction

The Expense Tracker API is a web service designed to help users track their expenses. Users can create, read, update, and delete expenses, generate reports based on month and week, and sign in or register.

## Frameworks and Language Used

- **Framework:** Spring Boot
- **Language:** Java
- **Database:** MySQL
- **Data Serialization:** JSON

## Data Flow

### Controller

Controllers are responsible for handling HTTP requests and responses. The following endpoints are available:

1. `POST /user/signUp`: User registration.
2. `POST /user/signIn`: User authentication.
3. `DELETE /user/signOut`: User sign out.
4. `POST /user/expense`: Create a new expense.
5. `GET /user/expense`: Get all expenses.
6. `PUT /user/expense/{expenseId}`: Update an expense by ID.
7. `DELETE /user/expense/{expenseId}`: Delete an expense by ID.
8. `GET /user/expenseByDate`: Get expenses by date.
9. `GET /user/totalExpenseInMonth`: Calculate total expenditure for a specific month and year.

### Services

Services contain the business logic of the application. They interact with repositories and perform operations like user authentication, expense management, and report generation.

### Repository

Repositories are responsible for interacting with the database. They contain methods to perform CRUD (Create, Read, Update, Delete) operations on expenses and users.

## Database Design

The database schema includes the following tables:

- **Expense Table:** Represents expenses and includes fields such as title, description, price, date, and a foreign key to the User table.
- **User Table:** Stores user information, including username, email, and password.
- **Authentication Table:** Stores authentication tokens for user sessions.

## Data Structures Used in Your Project

- **Entity Classes:** Java objects like User and Expense are used to represent data in the application.

## Project Summary

The Expense Tracker API is a Spring Boot-based web application designed to help users track their expenses. Users can register, sign in, create, read, update, and delete expenses. The API provides functionality to fetch expenses based on dates and times. Additionally, it can generate reports for monthly and weekly expenses. The application stores data in a MySQL database and uses Java objects to represent entities.

## Contact

If you have any questions or suggestions, feel free to contact me at the following
- [Gmail](saravanad2401@gmail.com).
- [LinkedIn](https://www.linkedin.com/in/saravanad2401/).
