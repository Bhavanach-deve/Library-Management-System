# Version 4 Flow Diagram

```text
                   User
                     │
                     ▼
            +----------------+
            |      Main      |
            +----------------+
                     │
                     ▼
             Reads User Choice
                     │
                     ▼
            +----------------+
            |    Library     |
            +----------------+
              │           │
      Book Operations   Member Operations
              │           │
              ▼           ▼
        +---------+   +-----------+
        |  Book   |   |  Member   |
        +---------+   +-----------+
                          ▲
                          │
                      Inherits
                          │
                     +-----------+
                     |  Person   |
                     +-----------+
                          ▲
                          │
                     Librarian
```