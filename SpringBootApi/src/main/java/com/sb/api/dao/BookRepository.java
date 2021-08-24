package com.sb.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.api.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	public Book findById(int id);

}
