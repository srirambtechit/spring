package com.msrm.springframeworks.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcomePage() {
		String message = "Welcome to Spring MVC World";
		return new ModelAndView("welcomePage", "msg", message);
	}

}
