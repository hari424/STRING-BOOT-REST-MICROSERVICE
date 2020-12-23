package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.Book;

@RestController
public class BookRestController {
	@GetMapping("/price")
	private ResponseEntity<String> getprice(@RequestParam("isbn") String isbn) {
		String msg = "Book Price For " + isbn + " :: 450 $";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/check")
	public ResponseEntity<String> CheckAvailability(@RequestParam("type") String type,
			@RequestParam("author") String author) {
		String msg = type + " Book By " + author + " :: Available ";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping(value = "/book", produces = { "application/json" })
	public ResponseEntity<Book> getBookDetails(@RequestParam("isbn") String isbn) {
		// logic to retrieve db

		Book b = new Book();
		b.setIsbn(isbn);
		b.setBookName("Spring");
		b.setBookPrice("400 $");

		return new ResponseEntity<>(b, HttpStatus.OK);
	}

}
