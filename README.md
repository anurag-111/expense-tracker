# Expense Tracker API

The **Expense Tracker API** is a robust and secure RESTful web service that enables users to effortlessly manage their expenses and maintain their user profiles. Built on the **Spring Boot** framework, this API offers various endpoints for user authentication, expense management, and user profile operations.

---

## Table of Contents

- [Authentication](#authentication)
- [Expense Management](#expense-management)
- [User Profile](#user-profile)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

---

## Authentication

### Login

**Endpoint:** `POST /login`

Authenticate a user with their email and password to receive a **JSON Web Token (JWT)** for accessing protected resources.

### Register

**Endpoint:** `POST /register`

Register a new user by providing their personal details and create a user profile.

---

## Expense Management

### Get All Expenses

**Endpoint:** `GET /expenses`

Retrieve a paginated list of all expenses, providing insights into past expenditures.

### Get Expense by ID

**Endpoint:** `GET /expenses/{id}`

Retrieve a specific expense by its unique ID, including details such as description, amount, category, and date.

### Delete Expense

**Endpoint:** `DELETE /expenses`

Delete an expense by its ID, removing it from the records.

### Create Expense

**Endpoint:** `POST /expenses`

Create a new expense record by providing information like description, amount, category, and date.

### Update Expense

**Endpoint:** `PUT /expenses/{id}`

Update an existing expense by its ID, modifying attributes like description, amount, category, and date.

### Get Expenses by Category

**Endpoint:** `GET /expenses/category`

Retrieve expenses filtered by specific categories, offering insights into spending patterns.

### Get Expenses by Name

**Endpoint:** `GET /expenses/name`

Retrieve expenses filtered by name keyword, allowing users to search for specific expenditures.

### Get Expenses by Date

**Endpoint:** `GET /expenses/date`

Retrieve expenses filtered by a date range, helping users analyze their spending over a specific period.

---

## User Profile

### Read User Profile

**Endpoint:** `GET /profile`

Retrieve the user's profile information, including their unique ID, first name, last name, and email.

### Update User Profile

**Endpoint:** `PUT /profile`

Update the user's profile information, enabling users to modify their first name and last name.

### Deactivate User Account

**Endpoint:** `DELETE /deactivate`

Deactivate the user's account, allowing users to terminate their profile and associated data.

---

## Getting Started

1. Clone the repository to your local machine.
2. Configure the database settings in the `application.properties` file.
3. Build and run the application using a Java IDE or Gradle.
4. Access the API endpoints using tools like Postman or cURL.

For more detailed instructions and API documentation, refer to the codebase and relevant controller and service classes.

---

## Contributing

Contributions to the Expense Tracker API are encouraged and appreciated! If you encounter a bug or wish to add a new feature, feel free to open an issue or submit a pull request.

---

## License

This project is licensed under the **MIT License**. For more details, refer to the [LICENSE](LICENSE) file.

---
