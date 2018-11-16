package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/springmvc")
@Controller
public class HelloWord {
	
	@RequestMapping("/helloword")
	public String hello(){
		System.out.println("hello word");
		return "success";
	}
	
	

}
