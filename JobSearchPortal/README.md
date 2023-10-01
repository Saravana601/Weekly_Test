# <p align ="center"> Job Search Portal </p>

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
    
# Project Overview

The "Job Search Portal" is a web application designed to serve as a comprehensive platform for job seekers and employers. It offers a range of features that facilitate the job search and job posting processes. This project is structured around the Spring Boot framework, Java programming language, and employs the Jakarta Persistence (JPA) for data management. Here's an overview of the key components and functionalities:

## Frameworks and Languages Used

- Framework: Spring Boot
- Language: Java
- Persistence: Jakarta Persistence (JPA)
- Database: H2 Database

## Data Flow

### Controller

The `JobController` handles incoming HTTP requests and interacts with the `JobService` to perform various actions related to job listings, such as posting jobs, retrieving job details, updating job information, and deleting jobs.

### Services

The `JobService` class contains the business logic for job-related operations. It communicates with the `IJobRepo` repository for data retrieval and manipulation.

### Repository

The `IJobRepo` repository extends the Spring Data `CrudRepository` and provides methods to interact with the H2 database. It includes custom queries for retrieving job listings based on criteria like job type, salary range, and company name. It also supports database updates and deletions.

### Database Design

- Database: H2
- Table Name: Jobs
- Columns: 
    - id (Primary Key)
    - title
    - description
    - location
    - salary
    - companyEmail
    - companyName
    - employerName
    - jobType
    - appliedDate

## Data Structure Used

- Entity: `Job` represents a job listing and corresponds to the database table.

## Project Summary

The Job Search Portal is a web application built using Spring Boot and Java. It allows users to:

- Post job listings
- Retrieve job details by ID
- Search for jobs by type
- Filter jobs by salary range
- Find jobs by company name
- Update job information (salary, location, email)
- Remove job listings by ID or company name

This application uses the H2 database for data storage during development and testing. It follows the MVC (Model-View-Controller) architectural pattern.

To get started with this project:

1. Clone the repository.
2. Configure your H2 database settings in the application properties.
3. Build and run the application.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your improvements.

## Contact
If you have any questions or suggestions, feel free to contact me at [Gmail](saravanad2401@gmail.com).
