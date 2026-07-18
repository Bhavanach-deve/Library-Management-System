package com.library.v3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. View Book");
            System.out.println("4. Search Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Total count of Books");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author : ");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author);

                    library.addBook(book);
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:

                    System.out.print("Enter Book ID : ");
                    int viewId = sc.nextInt();
                    library.viewBook(viewId);
                    break;

                case 4:
                    System.out.print("Enter Book ID : ");
                    int num = sc.nextInt();
                    Book books = library.searchBook(num);

                    if (books != null) {
                        System.out.println(books);
                    } else {
                        System.out.println("Book Not Found");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID : ");
                    int deleteId = sc.nextInt();

                    library.deleteBook(deleteId);
                    break;

                case 6:
                    System.out.println("The total no.of books are: "+library.size());
                    break;

                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}