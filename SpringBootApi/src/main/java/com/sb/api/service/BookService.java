package com.sb.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sb.api.dao.BookRepository;
import com.sb.api.model.Book;


@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	//private static  List<Book> list=new ArrayList<>();
	
//	static {
//		list.add(new Book(101,"c language","350"));
//		list.add(new Book(103,"java","2300"));
//		list.add(new Book(403,"python","500"));
//		list.add(new Book(3430,"c++ language","300"));
//		
//	}
	// get all book
	public List<Book> getAllBooks() {
		Iterable<Book> all = this.bookRepository.findAll();
		return (List<Book>) all;
	}
	
	// get singl book
	
	public Book getBookById(int id) {
		
		//return list.stream().filter(e-> e.getId()==id).findFirst().get();
		 
		Book byId = this.bookRepository.findById(id);
		return byId;
		
	}
	//insert book
	public Book saveBook(Book book) {
		//list.add(book);
		Book save = this.bookRepository.save(book);
		return save;
		
	}
	//delete book
	public void dltBook(int book) {
		//list=list.stream().filter(w-> w.getId()!= book).collect(Collectors.toList());
	this.bookRepository.deleteById(book);
		
	}

	//update the data
	public Book updateBook(Book boo, int b1) {
//		list.stream().map(e->{ 
//		if (e.getId()==b1) {
//			e.setName(boo.getName());
//			e.setPrice(boo.getPrice());
//		}
//		return e;
//		}).collect(Collectors.toList());
//		return boo;
		
		boo.setId(b1);
		Book book = this.bookRepository.save(boo);
		System.out.println("asad"+ book);
		return book;
		
	}

	
}
