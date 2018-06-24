package com.fbrc.spring.boot.hello.world.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String hello() {
		return "Spring Boot hello world web application";
	}
}
