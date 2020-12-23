package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	public WelcomeRestController() {
		System.out.println("WelcomeRestController::Constructor");
	}
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome to Rest Service First App...!!";
		return msg;
	}
	@GetMapping("/gm")
	public String greetMsg() {
		String msg = "Good Morning...!!";
		return msg;
	}
}
