package com.library.v4;

public class Librarian extends Person
{
    public Librarian(int id, String name, String email)
    {
        super(id,name,email);

    }
    @Override
    public void showRole()
    {
        System.out.println("Role: Librarian");

    }
}
