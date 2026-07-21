package com.library.v4;

import java.util.ArrayList;
import java.util.List;

public class Library
{
    private List<Book> books;
    private List<Member>members;

    public Library(){
        books=new ArrayList<>();
        members=new ArrayList<>();
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
    public int getTotalBooks(){
        return books.size();
    }

    public void addMember(Member member)
    {
        if(searchMember(member.getId()) != null)
        {
            System.out.println("Member Id already exists");
            return;
        }
        members.add(member);
        System.out.println("Member added successfully");

    }
    public void displayMembers(){
        if (members.isEmpty()) {
            System.out.println("No members are added.");
            return;
        }

        for (Member m : members) {
            System.out.println("------------------------");
            System.out.println("Member's ID: " +m.getId());
            System.out.println("Member's Name  : " +m.getName());
            System.out.println("Member's Email Address: " +m.getEmail());
        }

    }
    public Member searchMember(int id)
    {
        for(Member m:members){
            if(m.getId()==id){
                return m;
            }
        }
        return null;
    }
    public void deleteMember(int id)
    {
        Member mem=searchMember(id);

        if(mem != null)
        {
            members.remove(mem);
            System.out.println("Member information Deleted Successfully!");
        }
        else
        {
            System.out.println("Member Not Found.");
        }

    }
    public void issueBook(int bookId)
    {
        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book Not Found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book Already Issued.");
            return;
        }

        book.setAvailable(false);
        System.out.println("Book Issued Successfully.");
    }
    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (book == null) {
            System.out.println("Book Not Found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("Book is already available.");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book Returned Successfully.");
    }
}
