package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
	@GetMapping(value = "/price/{bname}/{aname}")
	public String getbookprice(@PathVariable("bname") String bname, 
																									@PathVariable("aname") String aname, Model model) {
		String msgtxt = aname +    "     " + bname +     "        prise is 200 $";
		model.addAttribute("msg", msgtxt);
		return "index";

	}
}
