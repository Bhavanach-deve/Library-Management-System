# Version 3 Class Diagram

```text
                    +----------------------+
                    |        Main          |
                    +----------------------+
                               |
                               |
                        uses Library
                               |
                               v
                    +----------------------+
                    |      Library         |
                    +----------------------+
                    | - List<Book> books   |
                    +----------------------+
                    | + addBook()          |
                    | + displayBooks()     |
                    | + searchBook()       |
                    | + viewBook()         |
                    | + deleteBook()       |
                    | + size()             |
                    +----------------------+
                               |
                     contains many Books
                               |
                               v
                    +----------------------+
                    |        Book          |
                    +----------------------+
                    | - bookId             |
                    | - bookTitle          |
                    | - bookAuthor         |
                    | - available          |
                    +----------------------+
                    | + getters            |
                    | + setters            |
                    | + toString()         |
                    +----------------------+
```