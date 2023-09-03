package com.san.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
    @GetMapping("/hello")
	public String returnLogin()
	{
		System.out.println("Executing controller");
		return "login";
	}

}
