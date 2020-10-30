package com.flytter.main.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flytter.main.entidades.Digimon;
import com.flytter.main.servico.DigimonServico;

@RestController
@RequestMapping(value = "/digimons")
public class DigimonRecursos {

	@Autowired
	private DigimonServico servico;

	@GetMapping
	public ResponseEntity<List<Digimon>> findAll() {

		List<Digimon> list = servico.findAll();

		return ResponseEntity.ok().body(list);

	}

	
	
	@GetMapping(value="/{name}")
	public Digimon getDigimonByName(@PathVariable String name) {
		return servico.getDigimonByName(name);
	}

}
