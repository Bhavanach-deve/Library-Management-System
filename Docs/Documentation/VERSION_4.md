# 📘 Version 4 – Advanced Object-Oriented Programming

## 🎯 Objective

Version 4 extends the Library Management System by introducing advanced Object-Oriented Programming concepts. This version models real-world entities such as Members and Librarians using inheritance and polymorphism while continuing to manage books using Java Collections.

---

## 🛠 Java Concepts Covered

- Inheritance
- Polymorphism
- Abstract Classes
- Method Overriding
- Collections Framework (ArrayList)
- Object-Oriented Design
- Encapsulation
- CRUD Operations

---

## ✨ Features

### 📚 Book Management

- Add Book
- Display Books
- Search Book
- View Book Details
- Delete Book
- Issue Book
- Return Book

### 👤 Member Management

- Add Member
- Display Members
- Search Member
- Delete Member

### 👨‍💼 User Roles

- Abstract Person Class
- Member Class
- Librarian Class
- Runtime Polymorphism using showRole()

---

## 📂 Project Structure

```text
com.library.v4
│
├── Person.java
├── Member.java
├── Librarian.java
├── Book.java
├── Library.java
└── Main.java
```

---

## 📚 Class Responsibilities

### Person (Abstract Class)

Common properties shared by all users.

Fields

- id
- name
- email

Methods

- getId()
- getName()
- getEmail()
- showRole()

---

### Member

Extends Person.

Represents a library member.

---

### Librarian

Extends Person.

Represents the administrator responsible for managing the library.

---

### Book

Represents a library book.

Fields

- Book ID
- Title
- Author
- Availability

---

### Library

Acts as the service layer.

Responsible for:

- Managing Books
- Managing Members
- Searching
- Issuing Books
- Returning Books

---

### Main

Console-based user interface.

Responsible for

- Displaying Menu
- Reading User Input
- Calling Library Methods

---

## 🔄 Improvements over Version 3

| Version 3 | Version 4 |
|------------|------------|
| Collections | Advanced OOP |
| Book Management | Book + Member Management |
| Single Entity | Multiple Entities |
| No Inheritance | Inheritance |
| No Polymorphism | Runtime Polymorphism |
| Basic CRUD | Real-world Design |

---

## 📖 Learning Outcome

After completing Version 4, I learned:

- How inheritance reduces code duplication.
- How abstract classes represent common behavior.
- How method overriding enables runtime polymorphism.
- How to model real-world entities using OOP.
- How collections and OOP work together.

---

## 🔜 Next Version

Version 5 introduces

- Exception Handling
- Custom Exceptions
- File Handling
- Data Persistence