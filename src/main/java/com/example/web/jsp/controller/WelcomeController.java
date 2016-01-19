package com.example.web.jsp.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${application.message:Welcome to the mainpage.}")
	private String message="Welcome..";
	
	@RequestMapping("/")
	public String firstPage(Map<String, Object> model){
		model.put("time", new Date());
		model.put(message, this.message);
		return "pageone";
	}
	

}
