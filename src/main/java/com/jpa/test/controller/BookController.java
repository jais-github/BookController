package com.jpa.test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.controller.entities.Book;

@RestController
public class BookController {

	
	@GetMapping("/books")
	public Book getBooks() {
		
		Book book = new Book();
		book.setId(1234);
		book.setTitle("Java Complete refference");
		book.setAuthor("XYZ");
		return book;
	}
}
