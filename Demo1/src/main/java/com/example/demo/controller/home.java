package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
	
	@RequestMapping("welcome")
	public String welcome(){
		String text = "This is private area";
		return text;
	}
	
	@RequestMapping("getuser")
	public String getUser(){
		return "{\"name\":\"Sugeet\"}";
	}

}
