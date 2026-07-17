# Version 2 Class Diagram

```text
                Main
                  |
                  |
             uses Library
                  |
                  |
          +----------------+
          |    Library     |
          +----------------+
          | books[]        |
          | count          |
          +----------------+
                  |
            contains many
                  |
                  |
          +----------------+
          |      Book      |
          +----------------+
          | id             |
          | title          |
          | author         |
          | available      |
          +----------------+
```