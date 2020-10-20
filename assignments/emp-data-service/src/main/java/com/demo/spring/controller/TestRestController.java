package com.demo.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping(path = "/info", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String info() {
		return "This is a Rest Application";
	}

	// http://locahhost:8080/greet/Piyush --> hence name=Piyush
	@RequestMapping(path = "/greet/{name}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String greet(@PathVariable("name") String name) {
		return name + " Welcome to Spring REST Services";
	}
}
