package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repository.Bookrepo;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private Bookrepo bookrepo;

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return (List<Book>) bookrepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable int id) {
        return bookrepo.findById(id);
    }

    @PostMapping("/add")
    public Book createBook(@RequestBody Book book) {
        return bookrepo.save(book);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book bookDetails) {
        Book book = bookrepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setDescription(bookDetails.getDescription());
        book.setPublishedyear(bookDetails.getPublishedyear());
        return bookrepo.save(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable int id) {
        bookrepo.deleteById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteAllBooks() {
        bookrepo.deleteAll();
    }

    @GetMapping("/finallyPublisherYear")
    public List<Book> getBooksByPublisherYear() {
        // Implement logic to filter books by publisher year if needed
        return (List<Book>) bookrepo.findAll();
    }
}