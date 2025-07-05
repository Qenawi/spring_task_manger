# Simple Jira-like Dashboard

This repository provides a skeleton for building a lightweight Jira-like task manager using **Spring Boot** and **Java 17**. The application offers local authentication and a Kanban-style board for issues.

## Introduction

This project aims to be a simple alternative to complex project management suites, ideal for small teams or personal use. Key concepts include:

- Local user authentication (register/login)
- Projects and issues (tasks)
- Kanban board view with drag-and-drop
- Basic roles and permissions
- Optional email notifications

## Features

1. **User Management** – Register, login, and reset passwords.
2. **Projects** – Create and manage multiple projects.
3. **Issues** – Full CRUD operations on tasks with types, priorities, and statuses.
4. **Board View** – Move issues between columns representing statuses.
5. **Roles & Permissions** – Admin, Manager, Developer, and Viewer access levels.
6. **Notifications** – Email alerts for relevant events (optional).

## Prerequisites

- Java 17
- [Maven](https://maven.apache.org/) or [Gradle](https://gradle.org/) for building the project

## Getting Started

1. **Clone the Repository**

   ```bash
   git clone <repo-url>
   cd spring_task_manger
   ```

2. **Build the Project** (example uses Maven)

   ```bash
   mvn clean package
   ```

3. **Run the Application**

   ```bash
   mvn spring-boot:run
   ```

   The application should start on `http://localhost:8080`.

## Usage

- Navigate to `/register` to create a new account.
- After logging in, create a project and add issues.
- Drag issues across columns on the board to update their status.
- Manage roles and permissions within the admin section.

## Configuration

Configuration such as database credentials or email settings can be set in `application.yml` or `application.properties`. Ensure that the chosen database is accessible and properly configured.

## License

This project is provided as-is under the MIT License. Feel free to fork and adapt to your needs.

