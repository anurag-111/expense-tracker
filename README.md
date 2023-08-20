# Expense Tracker API

The Expense Tracker API is a RESTful web service that allows users to track their expenses and manage their profiles. It provides endpoints for user authentication, expense management, and user profile operations. The API is built using Spring Boot and integrates with a database for data storage.

## Authentication

### Login

**Endpoint:** `POST /login`

Authenticate a user and receive a JSON Web Token (JWT) for accessing protected resources.

### Register

**Endpoint:** `POST /register`

Register a new user and create a user profile.

## Expense Management

### Get All Expenses

**Endpoint:** `GET /expenses`

Retrieve a paginated list of all expenses.

### Get Expense by ID

**Endpoint:** `GET /expenses/{id}`

Retrieve a specific expense by its ID.

### Delete Expense

**Endpoint:** `DELETE /expenses`

Delete an expense by its ID.

### Create Expense

**Endpoint:** `POST /expenses`

Create a new expense record.

### Update Expense

**Endpoint:** `PUT /expenses/{id}`

Update an existing expense by its ID.

### Get Expenses by Category

**Endpoint:** `GET /expenses/category`

Retrieve expenses filtered by category.

### Get Expenses by Name

**Endpoint:** `GET /expenses/name`

Retrieve expenses filtered by name keyword.

### Get Expenses by Date

**Endpoint:** `GET /expenses/date`

Retrieve expenses filtered by date range.

## User Profile

### Read User Profile

**Endpoint:** `GET /profile`

Retrieve the user's profile information.

### Update User Profile

**Endpoint:** `PUT /profile`

Update the user's profile information.

### Deactivate User Account

**Endpoint:** `DELETE /deactivate`

Deactivate the user's account.

## Getting Started

To run the Expense Tracker API locally, follow these steps:

1. Clone the repository.
2. Configure the database settings in the application.properties file.
3. Build and run the application using a Java IDE or Gradle.
4. Access the API endpoints using a tool like Postman or cURL.

For more detailed instructions and API documentation, refer to the codebase and the relevant controller and service classes.
