package com.udemy.curso.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaResource {

	@GetMapping("/")
	public String home() {
	return "Rest está funcionando";	
	
	}
	
}
