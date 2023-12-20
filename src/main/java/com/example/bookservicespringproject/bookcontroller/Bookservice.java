package com.example.bookservicespringproject.bookcontroller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;
@Service

public class Bookservice {
    private List<Book> books=new ArrayList<>(Arrays.asList(
            new Book(1,"java","ramky","jamesgoslin"),
            new Book(2,"python","dennish","d.ritch")

    ));
    public List<Book> getallbooks() {
        return books;

    }


    public Book getbook(int bookId) {
        for(int i=0;i<books.size();i++){
            Book b=books.get(0);
            if (b.getBook_id()==bookId){
                return b;
            }
        }

        return null;
    }

    public void addbook(Book book) {
        books.add(book);


    }

    public void updatebook(Book book, int bookId) {
        for(int i=0;i<books.size();i++){
            Book b=books.get(i);
            if(b.getBook_id()==bookId){
                books.set(i,book);
                return;
            }
        }
    }

    public void deletebook(int bookId) {
        for (int i=0;i<books.size();i++){
            Book b=books.get(i);
            if(b.getBook_id()==bookId){
                books.remove(b);
                return;
            }

        }
    }
}
