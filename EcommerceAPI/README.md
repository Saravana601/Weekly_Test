# <p align = "center"> Ecommerce API </p>
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


## Framework and Language Used
- Framework: Spring Boot
- Language: Java
- Database: SQL (Relational Database)

## Project Structure

The project follows a structured approach with various components:

- `com.geekster.EcommerceAPI.controller`: Contains controllers for handling HTTP requests.
- `com.geekster.EcommerceAPI.repository`: Includes repositories for data access.
- `com.geekster.EcommerceAPI.service`: Houses service classes for business logic.
- `com.geekster.EcommerceAPI.model`: Defines data models and entities.

## Endpoints

### User Controller

- `POST /user`: Add a new user to the system.
- `GET /user/{userID}`: Retrieve user information by user ID.

### Address Controller

- `POST /address`: Add a new address to the system.
  
### Product Controller

- `POST /product`: Add a new product to the system.
- `GET /products?category={category}`: Retrieve a list of products by category.
- `DELETE /product/{productID}`: Delete a product by ID.

### Order Controller

- `POST /order`: Place a new order in the system.
- `GET /order/{orderID}`: Retrieve order information by order ID.

## Data Flow
The EcommerceAPI project follows the typical MVC (Model-View-Controller) architecture. Here's a breakdown of the data flow:

### Model
1. **User**
   - Represents user information.
2. **Address**
   - Represents address information, linked to users.
3. **Product**
   - Represents product information.
4. **Order**
   - Represents order information, including the user, product, and address.

### Controller
1. **UserController**
   - Handles user-related operations such as adding users and retrieving user information by ID.
2. **AddressController**
   - Manages address-related operations, primarily adding addresses.
3. **ProductController**
   - Manages product-related operations like adding products, retrieving products by category, and deleting products by ID.
4. **OrderController**
   - Handles order-related operations such as placing orders and retrieving orders by ID.

### Services
1. **UserService**
   - Provides services for adding users and retrieving user information by ID.
2. **AddressService**
   - Provides services for adding addresses.
3. **ProductService**
   - Offers services for adding products, retrieving products by category, and deleting products by ID.
4. **OrderService**
   - Provides services for placing orders and retrieving orders by ID.

## Data Structure Used
The project uses a relational database (SQL) for data storage. It consists of several tables:
- User
- Address
- Product
- Orders

These tables are related to each other through foreign keys to maintain data integrity.

## Project Summary
The EcommerceAPI is a Spring Boot-based web application that allows you to manage users, addresses, products, and orders. It follows a well-structured MVC architecture with clear separation of concerns between controllers, services, and models. The project provides essential functionality for an e-commerce platform, including user registration, address management, product management, and order placement. It uses a SQL database to store and retrieve data efficiently.
