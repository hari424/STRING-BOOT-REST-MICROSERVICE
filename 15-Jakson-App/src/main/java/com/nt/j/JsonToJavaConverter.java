package com.nt.j;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.binding.Product;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		Product product = mapper.readValue(new File("product.json"), Product.class);
		System.out.println(product);

	}

}
