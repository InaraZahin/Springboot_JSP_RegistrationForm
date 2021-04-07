package com.example.SmallWebApp;
//package com.test.spring.boot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;





@Controller
public class RegistrationController {

@RequestMapping("/regform")
public String register() {
	return "registration";
	
}

@RequestMapping("/userDetail")
public ModelAndView userInfo (UserRegistration reg) {
	ModelMap model = new ModelMap();
	model.addAttribute("name",reg.getUname());
	model.addAttribute("email",reg.getEmailId());
	model.addAttribute("gender",reg.getGender()== Integer.parseInt("1")? "Male":"Female");
	model.addAttribute("hobbies",reg.getHobby());
	
	ModelAndView mv = new ModelAndView("userdetail");
	mv.addObject("regObj",model);
	return mv;
			
			
	//return "userdetail";
	
}
}
