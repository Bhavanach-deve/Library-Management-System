package com.library.v2;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

                Library library = new Library();

                while (true) {

                    System.out.println("\n===== Library Management System =====");
                    System.out.println("1. Add Book");
                    System.out.println("2. Display Books");
                    System.out.println("3. Search Book");
                    System.out.println("4. View Book");
                    System.out.println("5. Delete Book");
                    System.out.println("6. Count of the available Books");
                    System.out.println("7. Exit");
                    System.out.print("Enter Choice: ");

                    int choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {

                        case 1:

                            System.out.print("Enter Book ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Title: ");
                            String title = sc.nextLine();

                            System.out.print("Enter Author: ");
                            String author = sc.nextLine();

                            Book book = new Book(id, title, author);

                            library.addBook(book);

                            break;

                        case 2:

                            library.displayBooks();

                            break;

                        case 3:

                            System.out.print("Enter Book ID: ");
                            int searchId = sc.nextInt();

                            Book foundBook = library.searchBook(searchId);

                            if (foundBook != null) {
                                System.out.println(foundBook);
                            } else {
                                System.out.println("Book Not Found.");
                            }

                            break;

                        case 4:

                            System.out.print("Enter Book ID: ");
                            int viewId = sc.nextInt();

                            library.viewBook(viewId);

                            break;

                        case 5:

                            System.out.print("Enter Book ID: ");
                            int deleteId = sc.nextInt();

                            library.deleteBook(deleteId);

                            break;
                        case 6:
                            System.out.println("Total Books : " + library.getTotalBooks());
                            break;

                        case 7:

                            System.out.println("Thank You!");
                            sc.close();
                            return;

                        default:

                            System.out.println("Invalid Choice.");
                    }
                }
            }
        }
