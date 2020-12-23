package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.binding.Book;

@Controller
public class BookController {

	@GetMapping("/loadform")
	public String loadForm() {
		return "index";
	}

	@PostMapping("/saveBook")
	public String handleSubmitBtn(Book bookObj, Model model) {
		
		model.addAttribute("book", bookObj);
		
		return "bookdata";
	}

}
