package com.example.controllerexercise2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping("/")
	public String hello() {
		"dfdsf";
		return "Hello Spring Boot";
	}
}
