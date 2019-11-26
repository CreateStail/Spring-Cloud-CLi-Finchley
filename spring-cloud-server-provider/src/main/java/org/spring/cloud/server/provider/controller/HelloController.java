package org.spring.cloud.server.provider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class HelloController {
	
	@RequestMapping("/hello")
	public String index(@RequestParam String param) {
		return "This is post method,hello"+param; 
	}

}
