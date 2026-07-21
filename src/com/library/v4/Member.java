package com.library.v4;

public class Member extends Person{

    public Member(int id, String name, String email)
    {
        super(id,name,email);
    }

    @Override
    public void showRole()
    {
        System.out.println("Role: Library Member");

    }
    @Override
    public String toString() {
        return "Member{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
