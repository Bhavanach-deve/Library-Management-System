package com.library.v2;

public class Library
{
    private Book[]books=new Book[100];
    private int count=0;

    public void addBook(Book book)
    {
        if(searchBook(book.getBookId()) != null)
        {
            System.out.println("Book ID already exists.");
            return;
        }

        if(count==books.length){
            System.out.println("Library is Full!");
        return;
        }
        books[count]=book;
        count++;
        System.out.println("Book Added Successfully!");
    }
    public void displayBooks()
    {
        if(count==0){
            System.out.println("No Books Available yet!");
        return;
        }

        for(int i=0;i<count;i++){
            System.out.println("----------------------------------------------");
            System.out.println(books[i]);
        }

    }
    public Book searchBook(int bookId)
    {
        for(int i=0;i<count;i++){
            if(books[i].getBookId()==bookId){
                return books[i];
            }
        }
        return null;

    }
    public void viewBook(int bookId)
    {
        Book book=searchBook(bookId);

        if(book!=null){
            System.out.println(book);
        }else{
            System.out.println("Book Not found.");
        }

    }
    public void deleteBook(int bookId)
    {
        int index=-1;

        for(int i=0;i<count;i++){
            if(books[i].getBookId()==bookId){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Book not found.");
        return;
        }
        for(int i=index;i<count-1;i++){
            books[i]=books[i+1];
        }
        books[count-1]=null;
        count--;

        System.out.println("Book deleted successfully!");

    }
    public int getTotalBooks()
    {
        return count;
    }

}
