package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/getCerberoAccounts")
	public Greeting getCerberoAccounts(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/insertCerberoAccount")
	public Greeting insertCerberoAccount(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), "Registro Agregado exitosamente!");
	}

	@GetMapping("/updateCerberoAccount")
	public String updateCerberoAccount(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Registro Actualizado Exitosamente";
	}

	@GetMapping("/deleteCerberoAccount")
	public String deleteCerberoAccount(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Eliminado";
	}
}
