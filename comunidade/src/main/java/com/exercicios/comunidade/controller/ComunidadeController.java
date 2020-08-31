package com.exercicios.comunidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comunidade")
public class ComunidadeController {
	
	@GetMapping
	public String comunidade() {
		String texto = "O grupo de voluntários da ONG Matemática em Movimento foi um grande impulsionador de desenvolvimento pessoal para mim. Quando entrei na ONG imaginei que iria apenas ministrar e auxiliar nas aulas, porém encontrei um grupo cheio de diversidade, que cultiva um ambiente muito motivador, acolhedor, organizado, que valoriza a presença de cada voluntário e cada aluno participante do projeto. Mesmo as reuniões matinais de 15 minutos com todos em pé eram divertidas e inspiradoras. Os eventos de integração realizados entre os voluntários sempre buscavam atender a todos os gostos, e geravam novas conexões, ideias inovadoras, debates instigantes, amizades e muitas histórias para contar.";
		return texto;
	}

}
