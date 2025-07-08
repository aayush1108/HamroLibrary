# HamroLibrary

HamroLibrary is a simple Java-based Library Management System designed for desktop environments. It provides basic functionalities such as viewing available books, searching for books, and managing library records with a graphical user interface (GUI). The application connects to a MySQL database for persistent storage of library data.

---

## Features

- **View Books**: List all available books in the library, including details such as Book ID, Name, Writer, Publisher, Edition, and Price.
- **Search Books**: Search for books by name and display the results in a table.
- **Database Connectivity**: Uses MySQL for storing and retrieving library data.
- **Simple GUI**: Built with Java Swing for user-friendly interaction.

---

## Technologies Used

- Java (Swing for GUI)
- MySQL (Database)
- JDBC (Java Database Connectivity)

---

## Getting Started

### 1. Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- [MySQL JDBC Driver](https://dev.mysql.com/downloads/connector/j/)

### 2. Database Setup

1. Create a MySQL database named `hamrolybrary`.
2. Create the necessary tables (example for books):

    ```sql
    CREATE TABLE addbook (
        Book_ID INT PRIMARY KEY AUTO_INCREMENT,
        Book_Name VARCHAR(255),
        Writer_Name VARCHAR(255),
        Publisher VARCHAR(255),
        Edittion VARCHAR(50),
        Price DECIMAL(10,2)
    );
    ```

3. Update database credentials in `databaseconnectivity.java` if needed:

    ```java
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hamrolybrary","root","");
    ```

### 3. Build and Run

1. Clone the repo:
    ```bash
    git clone https://github.com/aayush1108/HamroLibrary.git
    cd HamroLibrary
    ```

2. Compile the Java source files:
    ```bash
    javac -cp .;mysql-connector-java.jar src/*.java
    ```

3. Run the application:
    ```bash
    java -cp .;mysql-connector-java.jar src.Menu
    ```

    > Make sure to include the path to your MySQL JDBC driver in the classpath.

---

## Project Structure

```
src/
├── Menu.java                # Main menu and navigation
├── ViewBooks.java           # View all books
├── searchbooks.java         # Search for books by name
├── databaseconnectivity.java# Handles MySQL connection
...
```

---

## Usage

- **View Books:** Navigate to the "View Books" section in the app to list all books.
- **Search Books:** Use the search functionality to find books by name.
- **Navigation:** Use the GUI buttons to move between different sections of the application.

---

## Author

- pramojan (original author, as seen in code)
- [aayush1108](https://github.com/aayush1108) (repository maintainer)

---

## License

This project is licensed under the MIT License.
