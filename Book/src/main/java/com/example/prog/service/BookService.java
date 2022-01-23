package com.example.prog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prog.entity.Book;
import com.example.prog.repository.BookRepo;

@Service
public class BookService {
	@Autowired
    BookRepo bookRepo;
 
    public List getAllBooks() {
        @SuppressWarnings("rawtypes")
		List books = new ArrayList();
        bookRepo.findAll().forEach(book -> books.add(book));
        return books;
    }
 
    public Book getBookById(int id) {
        return bookRepo.findById(id).get();
    }
 
    public void saveOrUpdate(Book book) {
        bookRepo.save(book);
    }
 
    public void delete(int id) {
        bookRepo.deleteById(id);
    }

	
}

