# Job Search Portal

A web application for job seekers and employers to post, search, and manage job listings.

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

