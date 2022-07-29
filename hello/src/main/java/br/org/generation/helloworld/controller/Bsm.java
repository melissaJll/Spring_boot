package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class Bsm {
	
	@GetMapping
	public String bsm(){
		return "Orientação ao futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência."
				+ "\n Trabalho em equipe, Orientação aos detalhes, proatividade, Comunicaçao";
	}

}
