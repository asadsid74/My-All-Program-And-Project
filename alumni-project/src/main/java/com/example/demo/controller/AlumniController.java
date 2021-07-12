package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.AlumniForm;
import com.example.demo.entity.Login;
import com.example.demo.entity.Register;
import com.example.demo.repo.AlumniRepoForm;
import com.example.demo.repo.AlumniRepoLogin;
import com.example.demo.repo.AlumniRepoRegister;

@Controller
public class AlumniController {

	@Autowired
	private AlumniRepoRegister repo;
	
	@Autowired
	private AlumniRepoLogin lrepo;
	
	@Autowired
	private AlumniRepoForm alrepo;
	
	@RequestMapping("/register")
	public String registerForm() {
		return "register";
	}
	
	@RequestMapping("/login")
	public String registerSaveData(@ModelAttribute Register register) {
		
		//System.out.println("saving data.......");
		System.out.println(register);
		Register save = this.repo.save(register);
		
		System.err.println(save);
		return "Login";
		
		
	}
	
	@RequestMapping("/alumni-form")
	public String alumniForm(@ModelAttribute Login login) {
		System.out.println("alumni");
		Login loginr = this.lrepo.save(login);
		System.err.println(loginr);
		return "alumni-form";
		
		}
	
	
	@PostMapping("/alumni-form_registred")
	public String alumniregistered(@ModelAttribute AlumniForm alumniForm) {
		
		System.out.println("done");
	AlumniForm form = this.alrepo.save(alumniForm);
		System.err.println(form);
		
//		Iterable<AlumniForm> all = alrepo.findAll();
//
//		System.out.println("asd"        +all);
		return "alumni-form2";
		
		}
	
	@RequestMapping("/success")
	public String success() {
		System.out.println("success fully done");
		return "success";
	}
	
	
	
	
	@RequestMapping("/front-page")
	public String frontPage() {
		//System.out.println("success fully done");
		return "front-page";
	}
	
	
	
	
	
}
