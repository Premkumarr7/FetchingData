package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/addStudent")
	public String addData(Student student) {
		repo.save(student);
		return "home";
	} 
	@RequestMapping("/getStduent")
	public ModelAndView getData (@RequestParam int sid) {
		ModelAndView mv = new ModelAndView("result");
		Student student = repo.findById(sid).orElse(new Student());
		mv.addObject("obj", student);
		return mv;
	}
	@RequestMapping("/deleteStduent")
	public String deleteData(@ModelAttribute("obj") Student student) {
		repo.delete(student);
		return "result";
	} 

}
