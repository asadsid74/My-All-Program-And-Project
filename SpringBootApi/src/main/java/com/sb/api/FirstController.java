package com.sb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.api.model.Book;
import com.sb.api.service.BookService;

@RestController
public class FirstController {

	@Autowired
	private BookService bookService;

	@GetMapping("/home")
	public List<Book> home() {

		return this.bookService.getAllBooks();
	}

	@GetMapping("/home/{id}")
	public Book getbook(@PathVariable("id") int id) {
		return this.bookService.getBookById(id);

	}

	@PostMapping("/home")
	public Book saveBook(@RequestBody Book book) {
		return this.bookService.saveBook(book);

	}

	@DeleteMapping("/home/{bid}")
	public void dltBook(@PathVariable("bid") int b) {
		this.bookService.dltBook(b);
	}
	
	@PutMapping("/home/{bookid}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookid") int id  ) {
		System.out.println(book);
		this.bookService.updateBook(book,id);
		return book;
	}
	
}
