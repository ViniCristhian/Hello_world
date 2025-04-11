package com.generation.exercios_introducao_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class PrimeiroEndPoint {

	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}
	
}
