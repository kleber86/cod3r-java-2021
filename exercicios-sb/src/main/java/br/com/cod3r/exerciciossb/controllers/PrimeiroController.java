package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = {"/ola", "/saudacao"})
	public String ola() {
		return "<h1>Hello World! Spring Boot!</h1>";
	}
	
	@PostMapping( path = "/ola")
	public String ola2() {
		return "<h1>Hello World! Spring Boot!</h1>";
	}
}
