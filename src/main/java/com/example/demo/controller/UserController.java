package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String register(Model model) {
		
		User user=new User();
		model.addAttribute("user",user );

		return "registration";
		
	}
	
	@PostMapping("/registerUser")
	public String userregister(@ModelAttribute ("user") User user) {
		
		//String result="error";
		System.out.println(user);
		
		if(user.getPass().equals(user.getConformpass())) {
			
			try {
				service.registeruser(user);
				return "home";
				
			}
			catch(Exception e) {
				
				return "error";
			}
			
			
		}
		return "result";
		
		
		
	}
	
	
	

}
