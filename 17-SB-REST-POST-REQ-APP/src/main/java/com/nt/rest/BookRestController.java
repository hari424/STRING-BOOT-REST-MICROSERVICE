package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Book;

@RestController
public class BookRestController {
	@PostMapping(value = "/addbook", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addBook(Book book) {
		// logic to store book in db.
		System.out.println(book);
		String respMsg = "Book Stored Successfully..!!";
		return new ResponseEntity<>(respMsg, HttpStatus.CREATED);
	}
}
