package com.example.prog.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prog.entity.Book;

public interface BookRepo extends JpaRepository <Book, Integer>{

}
