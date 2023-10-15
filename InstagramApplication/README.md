# <p align = "center"> Instagram Application </p>
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
The Instagram Application is a backend system developed using Spring Boot and Java, designed to power a social media platform similar to Instagram. It handles user management and post creation and retrieval, all backed by a MySQL database. Here's a breakdown of its key components
## Framework and Language Used
- Framework: Spring Boot
- Language: Java
- Database: MySQL

## Data Flow
1. User interacts with the application via the API.
2. Requests are handled by the controller, which routes them to the appropriate service.
3. Services interact with the repository for data access.
4. Data is stored in the MySQL database.

## Controller
### UserController
- Endpoints:
  - POST /api/v1/user/signUp - Allows users to sign up for the application.
  - POST /api/v1/user/signIn - Handles user sign-in and returns an authentication token.
  - PUT /api/v1/user/user - Enables users to update their email address.

### PostController
- Endpoints:
  - POST /post - Allows users to create and post new content.
  - GET /post/{postId} - Retrieves a specific post by its unique identifier (postId).

## Services
### UserService
- Handles user-related operations such as signup and sign-in.
- Uses a token-based authentication system for user sessions.

### PostService
- Manages user posts, including creation and retrieval.

## Repository
### IUserRepository
- Extends JpaRepository for user data access.
- Includes a custom method to find a user by email.

### ITokenRepository
- Extends JpaRepository for managing authentication tokens.

### IPostRepository
- Extends JpaRepository for managing user posts.

## Database Design
- The database design includes the following tables:
  - User: Stores user information
  - AuthenticationToken: Manages authentication tokens for user sessions
  - Post: Stores user posts

## Data Structures Used
- Entity classes are used to model database tables, including User, AuthenticationToken, and Post.

## Project Summary
This project is a backend for an Instagram-like application built using Spring Boot and Java. It provides user management features such as signing up, signing in, and updating user information. Additionally, it allows users to create and retrieve posts. The application uses token-based authentication for user sessions and stores data in a MySQL database.

## Contributing

Contributions are welcome! Feel free to open issues or pull requests for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, feel free to contact me at the following
- [Gmail](saravanad2401@gmail.com).
- [LinkedIn](https://www.linkedin.com/in/saravanad2401/).
