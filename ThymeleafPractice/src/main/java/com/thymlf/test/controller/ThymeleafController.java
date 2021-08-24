package com.thymlf.test.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

	@GetMapping("/about")

	public String page(Model m) {
		System.out.println("this is handlerof this controller");
		m.addAttribute("name", "asadullah ahmad");
		m.addAttribute("address", "sakinaka andheri east");
		m.addAttribute("currentDate", new java.util.Date());

		int a = 34;
		int b = 54;
		int c = a + b;
		System.out.println("number of addition is+" + c);
		return "about";
	}

	@GetMapping("/itert")
	public String iterate(Model m) {

		List<String> names = List.of("asad", "obaid", "amjad", "abdul", "sallu");

		names.forEach(e -> System.out.println(e));
		// System.out.println("kjhgfg");
		m.addAttribute("data", names);
		// System.out.println("hi");
		return "iterate";
	}

	@GetMapping("/condition")
	public String condition(Model m) {

		System.out.println("condition handler is running......");
		m.addAttribute("active", true);

		m.addAttribute("gender", "M");

		List<Integer> list = List.of(65);
		m.addAttribute("mylist", list);
		return "condition";
	}
	
	
	//handler for fragment
	@GetMapping("/service")
	public String serviceHand() {
		return "service";
	}

}
