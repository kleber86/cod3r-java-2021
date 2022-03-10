package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@GetMapping("/1")
	public Cliente obterCliente() {
		return new Cliente(1, "Kleber", "123.456.789-00");
	}
	
	@GetMapping("/2")
	public Cliente obterCliente2() {
		return new Cliente(2, "Kleber", "123.456.789-00");
	}
}
