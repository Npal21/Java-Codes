package com.example;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("001");
        Magazine m = new Magazine();
        DVD dvd = new DVD();
        book.checkout();
        book.returnItem();
    }
}
