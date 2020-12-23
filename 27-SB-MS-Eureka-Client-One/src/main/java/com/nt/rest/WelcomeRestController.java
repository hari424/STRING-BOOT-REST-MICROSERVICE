package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/wmsg")
	public String welcomeMsg() {
		return "Welcome to MICRO SERVICES...!";
	}
}
