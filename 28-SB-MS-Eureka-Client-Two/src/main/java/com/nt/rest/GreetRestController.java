package com.nt.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@GetMapping("/gmsg")
	public String getGreetMsg() {
		return "Good Morning...!!";
	}
}
