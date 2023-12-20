package com.example.bookservicespringproject.bookcontroller;

public class Book {
    private int book_id;
    private String book_name;
    private String book_publisher;
    private String author;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_publisher() {
        return book_publisher;
    }

    public void setBook_publisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int book_id, String book_name, String book_publisher, String author) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_publisher = book_publisher;
        this.author = author;
    }
}
