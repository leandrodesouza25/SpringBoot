package br.org.generation.hello25.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ctrl + shift + O



@RestController
public class HelloController {
	
	@RequestMapping("/hello25")
	public String hello() {
		
		return "Objetivos de aprendizagem dessa semana: Absorver o conteúdo de Spring, apesar de difícil, há uma vontade de buscar por mais, assistir aos vídeos da plataforma e ajudar meus colegas no que eu conseguir";
		
		
	}

}
