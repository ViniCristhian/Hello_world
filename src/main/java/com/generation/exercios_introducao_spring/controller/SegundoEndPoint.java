package com.generation.exercios_introducao_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsm-generation")
public class SegundoEndPoint {
	
	@GetMapping
	public String listarBSMGen() {
		return """
				Mentalidades: 
				<br>
				- Mentalidade de Crescimento 
				<br>
				- Orientalção ao Futuro 
				<br>
				- Persistência 
				<br>
				- Responssabilidade Pessoal 
				<br>
				
				<br>
				
				Habilidades: 
				<br>
				- Trabalho em Equipe 
				<br>
				- Comunicação 
				<br>
				- Atenção aos Detalhes 
				<br>
				- Proatividade
				""";
	}
	
}



