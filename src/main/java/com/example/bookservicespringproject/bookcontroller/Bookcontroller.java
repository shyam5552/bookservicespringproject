package com.example.bookservicespringproject.bookcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class Bookcontroller {
    @Autowired
    public Bookservice bookservice;
    @GetMapping(value = "/books")
    public List<Book> getallbooks(){
        return bookservice.getallbooks();
    }
    @GetMapping(value = "/books/{book_id}")
    public Book getbook(@PathVariable int book_id){
        return bookservice.getbook(book_id);
    }
    @PostMapping(value = "/books")
    public String addbook(@RequestBody Book book){
        bookservice.addbook(book);
        return "book details insertd successfylly";
    }
    @PutMapping(value = "/books/{book_id}")
    public String updatebook(@RequestBody Book book,@PathVariable int book_id){
        bookservice.updatebook(book,book_id);
        return "book details updated successfully";

    }
    @DeleteMapping(value = "/books/{book_id}")
    public String deletebook(@PathVariable int book_id){
        bookservice.deletebook(book_id);
        return "deleted successfully";
    }
}
