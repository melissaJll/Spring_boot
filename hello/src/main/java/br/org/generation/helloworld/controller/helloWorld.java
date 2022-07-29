package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello") //diz endereço onde sera localhost /../hello
public class helloWorld {
	
	@GetMapping // coloque a informaçap abaixo no endereçp
	public String hello() {
		return "hello world";
		
	}

}
