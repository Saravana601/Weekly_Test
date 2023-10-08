# <p align = "center"> Student Portal Project </p>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-purple.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-blue.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-yellow.svg" />
</p>

## Overview
Java-based Spring Boot app for student data management with CRUD operations for students, courses, laptops, books, and addresses.


## Frameworks and Language Used:
- Frameworks: Spring Boot (for backend), Jakarta Persistence (for JPA), Lombok (for simplifying code), Spring Data JPA (for database interaction).
- Language: Java.

## Data Flow :

### Controllers:
- `StudentController`: Handles student-related endpoints.
- `CourseController`: Manages course-related endpoints.
- `LaptopController`: Manages laptop-related endpoints.
- `BookController`: Handles book-related endpoints.
- `AddressController`: Manages address-related endpoints.

### Student Controller Endpoints

1. `POST /student` - Add a new student.
2. `GET /student` - Retrieve student by name.
3. `GET /student/{id}` - Retrieve student by ID.
4. `GET /students` - Retrieve all students.
5. `PUT /student` - Update student department.
6. `DELETE /student/{id}` - Delete a student.

### Course Controller Endpoints

1. `POST /course` - Add a new course.
2. `GET /course` - Retrieve all courses.
3. `GET /course/{id}` - Retrieve course by ID.
4. `PUT /course/{title}` - Update course by title.
5. `DELETE /course/{id}` - Delete a course.

### Laptop Controller Endpoints

1. `POST /laptop` - Add a new laptop.
2. `GET /laptops` - Retrieve laptops by brand.
3. `GET /laptop/{id}` - Retrieve laptop by ID.
4. `PUT /laptop/{id}` - Update laptop price.
5. `DELETE /laptops/{id}` - Delete a laptop.

### Book Controller Endpoints

1. `POST /book` - Add a new book.
2. `GET /book/{id}` - Retrieve book by ID.
3. `GET /books` - Retrieve all books.
4. `PUT /book/{id}` - Update book price.
5. `DELETE /book/{id}` - Delete a book.

### Address Controller Endpoints

1. `POST /address` - Add a new address.
2. `GET /address/{id}` - Retrieve address by ID.
3. `GET /address` - Retrieve all addresses.
4. `PUT /address/{id}` - Update address.
5. `DELETE /address/{id}` - Delete an address.


## Services:
- `StudentService`: Provides services related to students.
- `CourseService`: Manages services for courses.
- `LaptopService`: Provides services related to laptops.
- `BookService`: Manages services for books.
- `AddressService`: Manages services for addresses.

## Repositories:
- `IStudentRepository`: Interface for student repository.
- `ICourseRepository`: Interface for course repository.
- `ILaptopRepository`: Interface for laptop repository.
- `IBookRepository`: Interface for book repository.
- `AddressRepository`: Repository for addresses.

## Data Structures Used:

- Java classes for modeling data structures:
  - `Student`, `Course`, `Laptop`, `Book`, `Address`.
  - Enums like `BrandType`, `DepartmentType`.
 
### How to Run

To run the project, follow these steps:

1. Clone this repository.
2. Configure your MySQL database connection properties in the application.properties.
3. Run the `StudentPortalApplication` class as the main entry point.

## Project Summary
This project emphasizes RESTful API design, utilizing Jakarta Persistence (JPA) for database interactions, and reducing boilerplate code with Lombok. It provides a comprehensive set of features for handling students, courses, laptops, books, and addresses.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your improvements.

## Contact
If you have any questions or suggestions, feel free to contact me at [Gmail](saravanad2401@gmail.com).

