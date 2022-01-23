package com.example.prog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.prog.entity.Book;

import com.example.prog.service.BookService;




@RestController
public class BookController {
	
@Autowired
BookService bookService;

@GetMapping("/books")
private List<?> getAllBooks() {
    return bookService.getAllBooks();
}

@GetMapping("/books/{id}")
private Book getMovieBook(@PathVariable("id") int id) {
    return bookService.getBookById(id);
}

@DeleteMapping("/books/{id}")
private void deleteMovieBook(@PathVariable("id") int id) {
    bookService.delete(id);
}

@PostMapping("/books")
private int saveBook(@RequestBody Book book) {
    bookService.saveOrUpdate(book);
    return book.bookId();
}
}
