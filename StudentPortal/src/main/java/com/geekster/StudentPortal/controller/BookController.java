package com.geekster.StudentPortal.controller;

import com.geekster.StudentPortal.model.Book;
import com.geekster.StudentPortal.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody @Valid Book book){
          return bookService.addBook(book);
    }

    @GetMapping("book/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("book/{id}")
    public String updateBookPriceById(@PathVariable Long id, @RequestBody Double price){
        return bookService.updateBookPriceById(id,price);
    }

    @DeleteMapping("book/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }
}
