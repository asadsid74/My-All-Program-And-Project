package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home page of ur sb application");
		return "home";
		
	}
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("this is contact page of ur sb application");
		return "contact";
		
	}
}
