///*
// * Library Management System
// * Version : 1.0
// *
// * Concepts Used:
// * - Variables
// * - Arrays
// * - Methods
// * - Loops
// * - Scanner
// * - Switch Case
// *
// * Developed by: Bhavana
// */
package com.library.v1;

import java.util.Scanner;

public class Main{

    static Scanner sc = new Scanner(System.in);

    static int[] bookId = new int[100];
    static String[] bookTitle = new String[100];
    static String[] bookAuthor = new String[100];

    static int count = 0;

    public static void addBook()
    {
        if(count == bookId.length)
        {
            System.out.println("Library Full.");
            return;
        }

        System.out.print("Book ID: ");
        bookId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Book Title: ");
        bookTitle[count] = sc.nextLine();

        System.out.print("Author: ");
        bookAuthor[count] = sc.nextLine();

        count++;
        System.out.println("Book Added Successfully!");
    }

    public static void displayBooks()
    {
        if(count==0){
            System.out.println("No books available yet.");
            return;
        }
        System.out.print("----------------------------------------------");
        System.out.println("\nID \t Book Title");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(bookId[i] + "\t" + bookTitle[i]);
        }
        System.out.println("----------------------------------------------");
        return;
    }

    public static void searchBook() {

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            for (int i = 0; i < count; i++) {

                if (bookId[i]==id) {
                    System.out.println("Book Found: " + bookTitle[i]);
                    return;
                }
            }
            System.out.println("Book Not Found.");
    }
    public static void viewBooks()
    {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i]==id) {
                System.out.println("\nBook Details");
                System.out.println("Book ID : " + bookId[i]);
                System.out.println("Title   : " + bookTitle[i]);
                System.out.println("Author  : " + bookAuthor[i]);
                return;
            }
        }
        System.out.println("Book Not Found.");
    }
    public static void deleteBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i]==id) {

                for (int j = i; j < count - 1; j++) {

                    bookId[j] = bookId[j + 1];
                    bookTitle[j] = bookTitle[j + 1];
                    bookAuthor[j] = bookAuthor[j + 1];
                }
                count--;
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book Not found.");
    }
    public static void displayMenu(){
        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Search Book");
        System.out.println("4. View Book Details");
        System.out.println("5. Delete Book");
        System.out.println("6. Exit");
    }

    public static void main(String[] args)
    {
        while(true) {

            displayMenu();
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    viewBooks();
                    break;
                case 5:
                    deleteBook();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}