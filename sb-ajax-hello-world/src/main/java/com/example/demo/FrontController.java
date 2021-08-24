package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FrontController {

	
	
	@RequestMapping("/save")
	public String home() {
		System.out.println("this is fisrt handler of the spring ajax");
		return "index";
	}
	
	
	@RequestMapping("/goaction")
	public String action() {
		System.out.println("this is action handler");
		return "successfully";
	}
}
