package org.spring.cloud.server.consumer.controller;

import org.spring.cloud.server.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class HelloController {
	
	@Autowired
	private HelloRemote HelloRemote;
	
	@GetMapping("/hello/{param}")
	public String index(@PathVariable String param) {
		return HelloRemote.index(param);
	}
}
