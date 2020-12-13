package com.capg.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {            //acts as a MVC (model view controller) Controller (controls the view of html using model)// 
	                                                                          
	@GetMapping("/web")
	public String hello() {
		return "hello";
		}
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message. Hello from Capgemini!");
		return "message";
	}

}
