package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("obj") Student s) {
		return "result";
	}
	
}
