package com.example;

public class Book extends LibraryItem{
    private String ISBN;

    public Book(String ISBN) {
        this.Author = "";
        this.title = "book";
        this.itemID = 0;
        this.ISBN = ISBN;
    }

    protected void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    protected String getISBN(){
        return ISBN;
    }
}
