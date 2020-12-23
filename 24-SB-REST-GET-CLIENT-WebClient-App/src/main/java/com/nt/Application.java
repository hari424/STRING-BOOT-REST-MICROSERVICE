package com.nt;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import com.nt.bindings.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		WebClient webClient = WebClient.create();
		User userData = webClient.get()  
				   .uri(new URI("http://localhost:9090/user"))
				   .retrieve()
				   .bodyToMono(User.class)
				   .block();
		
		System.out.println(userData);
		


			}
	public static void handleResponse(String msg) {
		System.out.println("Response :: " + msg);
	}
}
