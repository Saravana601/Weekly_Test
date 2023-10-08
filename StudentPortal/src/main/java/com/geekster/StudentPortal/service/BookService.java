package com.geekster.StudentPortal.service;

import com.geekster.StudentPortal.model.Book;
import com.geekster.StudentPortal.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepository iBookRepository;

    // Add Book
    public String addBook(Book book) {
        iBookRepository.save(book);
        return "Book Added";
    }

    // Get Book By I'd
    public Book getBookById(Long id){
        return iBookRepository.findById(id).orElseThrow();
    }

    // Get All Books
    public List<Book> getAllBooks(){
        return iBookRepository.findAll();
    }

    // Update Book Price By I'd
    public String updateBookPriceById(Long id,Double price){
        Book existingBook = getBookById(id);

        existingBook.setPrice(price);
        iBookRepository.save(existingBook);
        return "Book Updated";
    }

    // Delete Book by I'd
    public String deleteBookById(Long id){
        iBookRepository.deleteById(id);
        return "Book deleted";
    }
}
