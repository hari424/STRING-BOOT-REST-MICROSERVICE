package com.nt.j;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.binding.Product;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		Product p = new Product();
		p.setProductId(101);
		p.setProductName("Keyboard");
		p.setProductPrice(15000.00);
		ObjectMapper maper = new ObjectMapper();
		maper.writerWithDefaultPrettyPrinter().writeValue(new File("product.json"), p);
		 String jsonStr=maper.writeValueAsString(p);
		System.out.println(jsonStr);
	}

}
