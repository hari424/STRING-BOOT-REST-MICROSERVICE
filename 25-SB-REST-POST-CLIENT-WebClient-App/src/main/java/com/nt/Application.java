package com.nt;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.nt.request.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
		Book book = new Book();
		book.setBookId(101);
		book.setBookName("spring");
		book.setBookPrice(200.00);

		String endpointuri = "http://localhost:9090/addbook";
		WebClient webClient = WebClient.create();
		String responce = webClient.post()
				                                                .uri(new URI(endpointuri))
				                                                .bodyValue(book)
				                                                .retrieve().bodyToMono(String.class)
				                                                 .block();
		               System.out.println("RESPONCE        ::::   "+responce);

	}
}
