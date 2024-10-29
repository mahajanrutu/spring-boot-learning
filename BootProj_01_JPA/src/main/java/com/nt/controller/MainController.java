package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class MainController {
     
	@RequestMapping("/")
	public String home() {
		System.out.println("Welcome to the web page");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("Welcome to the Contact");
		return "home";
	}

}
