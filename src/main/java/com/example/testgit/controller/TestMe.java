package com.example.testgit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testgit")
public class TestMe {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello22";
	}

}
