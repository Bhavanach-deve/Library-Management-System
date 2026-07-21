package com.library.v4;

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
           System.out.println("7. Add Member");
           System.out.println("8. Display Member");
           System.out.println("9. Search Member");
           System.out.println("10. Delete Member");
           System.out.println("11. Issue Book");
           System.out.println("12. Return Book");
           System.out.println("13. Exit");

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
                   System.out.println("The total no.of books are: "+library.getTotalBooks());
                   break;

               case 7:
                   System.out.println("Enter member Id.No:");
                   int memId=sc.nextInt();
                   sc.nextLine();

                   System.out.println("Enter member name:");
                   String name=sc.nextLine();

                   System.out.println("Enter member emailId");
                   String email=sc.nextLine();

                   Member mem=new Member(memId,name,email);

                   library.addMember(mem);
                   break;

               case 8:
                   library.displayMembers();
                   break;

               case 9:
                   System.out.print("Enter Member's ID : ");
                   int mId = sc.nextInt();
                   Member members=library.searchMember(mId);
                   if (members!= null) {
                       System.out.println(members);
                   } else {
                       System.out.println("Member Not Found");
                   }
                   break;

               case 10:
                   System.out.print("Enter Member ID : ");
                   int deleteMem = sc.nextInt();

                   library.deleteMember(deleteMem);
                   break;

               case 11:
                   System.out.println("Enter Book ID: ");
                   int BId=sc.nextInt();
                   library.issueBook(BId);
                   break;

               case 12:
                   System.out.println("Enter Book ID: ");
                   int rId=sc.nextInt();
                   library.returnBook(rId);
                   break;

               case 13:
                   System.out.println("Thank you!");
                   sc.close();
                   return;

               default:
                   System.out.println("Invalid Choice.");
           }
       }
    }
}
