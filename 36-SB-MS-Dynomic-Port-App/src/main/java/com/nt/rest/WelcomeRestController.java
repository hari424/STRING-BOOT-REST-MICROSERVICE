package com.nt.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@Autowired
 private Environment env;
	@GetMapping(value = "/welcome")
	public String getWelcomemsg() {
		String portNum=env.getProperty("local.server.port");
		String msg = "WELCOME TO DYNOMIC PORT APP   - - >"+portNum;
		return msg;

	}

}
