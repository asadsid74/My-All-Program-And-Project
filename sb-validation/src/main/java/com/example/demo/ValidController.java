package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.LoginData;


@Controller
public class ValidController {

	@GetMapping("/loginform")
	public String showForm(Model m) {
		System.out.println("login form handelrs");
		
		Model attribute = m.addAttribute("loginData",new LoginData());
		System.out.println(attribute);
		return "form";
	}
	
	
	//handler for process
	
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute ("loginData") LoginData data , BindingResult result) {
		if (result.hasErrors()) {
			
		
		System.out.println(result);
		return "form";
		}
		//System.out.println(data);
		//System.out.println("asad sultan");
		return "success";
	}
	
}
