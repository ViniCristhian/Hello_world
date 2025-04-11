package com.generation.exercios_introducao_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-objetivos-aprendizagem")
public class TerceiroEndPoint {
	
	@GetMapping
	public String listarObjetivosemana() {
		return """
				<h4>
					<strong>
						Lista de Objetivos Aprendizagem da semana
					</strong>
				</h4>
				
				<ul>
					<li>Concluir todas as atividades da Generation</li>
					<li>Concluir as atividades da Faculdade</li>
					<li>Estudar para as provas da faculdade</li>
					<li>Continuar com os estudos de Java</li>
					<li>Estudar o Framework Spring</li>
				</ul>
				""";
	}
	
}
