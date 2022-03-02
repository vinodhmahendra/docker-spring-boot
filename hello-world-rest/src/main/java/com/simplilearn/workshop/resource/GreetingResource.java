package com.simplilearn.workshop.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResource {
	
	@GetMapping("/hello")
	public String greet() {
		return "Hello World! Docker";
	}

}
