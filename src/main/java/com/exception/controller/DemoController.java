package com.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/hi")
	public String greeting() {
		int x=10/0;
		return "welcome";
	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ModelAndView demoExceptionHandlerMethod(ArithmeticException ex){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("error");
		return mav;
	}
}
