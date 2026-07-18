# 📘 Version 3 – Collections Framework

## 🎯 Objective

Replace fixed-size arrays with Java Collections to build a more flexible and scalable Library Management System.

Version 3 focuses on understanding how Java's Collections Framework simplifies data management compared to arrays.

---

## 🛠 Java Concepts Covered

- Collections Framework
- List Interface
- ArrayList
- Generics
- Enhanced for-loop (for-each)
- Dynamic Memory Allocation
- CRUD Operations using Collections

---

## ✨ Features

- Add Book
- Display Books
- Search Book
- View Book Details
- Delete Book
- Count Total Books

---

## 📂 Project Structure

```text
com.library.v3
│
├── Book.java
├── Library.java
└── Main.java
```

---

## 📚 Class Responsibilities

### 📖 Book

Represents a single book.

Contains:
- Book ID
- Book Title
- Book Author
- Availability

---

### 📚 Library

Responsible for managing books using `ArrayList<Book>`.

Methods:
- addBook()
- displayBooks()
- searchBook()
- viewBook()
- deleteBook()
- size()

---

### 💻 Main

Responsible for:

- Displaying Menu
- Taking User Input
- Calling Library Methods

---

## 🚀 Improvements over Version 2

| Version 2 | Version 3 |
|------------|------------|
| Arrays | ArrayList |
| Fixed Size | Dynamic Size |
| Manual Count | size() |
| count == 0 | isEmpty() |
| Manual Shifting | remove() |

---

## 📖 Learning Outcome

After completing Version 3, I learned:

- Why Collections are preferred over arrays.
- How ArrayList manages dynamic data.
- How Generics provide type safety.
- How enhanced for-loops improve code readability.
- How built-in methods reduce manual coding.

---

## 🔜 Next Version

Version 4 introduces:

- Inheritance
- Polymorphism
- Abstract Classes
- Interfaces

to transform the project into a more realistic object-oriented application.