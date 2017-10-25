package com.bridgelabz.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		System.out.println("admission form :: ");
		ModelAndView model= new ModelAndView("admissionForm");
		return model;
	}
	@RequestMapping(value="/admissionSuccess", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby ){
		System.out.println("helo!!!!!!!");
		ModelAndView model= new ModelAndView("admissionSuccess");
		model.addObject("message", "Details submitted by you!!! Name : "+name+"Hobby : "+hobby);
		return model;
	}
}
