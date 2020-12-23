package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
public String displayWelcome(@RequestPart("name") String name,   Model model) {
	String msgtext="WELCOME TO SPRING QUERY PARAM";
		model.addAttribute("msg",msgtext);
	return "index";
	
}
}
