package com.library.v3;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        if(searchBook(book.getBookId()) != null)
        {
            System.out.println("Book ID already exists.");
            return;
        }

        books.add(book);
        System.out.println("Book Added Successfully.");
    }

    // Display All Books
    public void displayBooks() {

        if (books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book book : books) {
            System.out.println("------------------------");
            System.out.println("Book ID : " + book.getBookId());
            System.out.println("Title   : " + book.getBookTitle());
            System.out.println("Author  : " + book.getBookAuthor());
        }
    }
    public void viewBook(int id) {
        Book book = searchBook(id);

        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book Not Found.");
        }
    }

    // Search Book by Title
    public Book searchBook(int id)
    {
        for(Book b:books){
            if(b.getBookId()==id){
                return b;
            }
        }
        return null;
    }

    public void deleteBook(int id){
        Book book = searchBook(id);

        if(book != null)
        {
            books.remove(book);
            System.out.println("Book Deleted Successfully!");
        }
        else
        {
            System.out.println("Book Not Found.");
        }
    }
    public int size(){
        return books.size();
    }
}
