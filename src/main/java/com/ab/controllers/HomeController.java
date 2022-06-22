package com.ab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/{name}")
	public String greeting(@PathVariable("name") String name) {
		
		return "Hello "+name;
	}

}
