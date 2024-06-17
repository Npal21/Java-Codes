package com.example;

public class LibraryItem {

    protected int itemID;
    public String title;
    public String Author;

    public void checkout(){
        System.out.println("Item checked out." );
    }
    void returnItem(){
        System.out.println("Item returned.");
    }
}
