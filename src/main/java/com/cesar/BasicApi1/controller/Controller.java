package com.cesar.BasicApi1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/getSomething")
	private String getSomething() {
		
		return "Something...";
	}
}
