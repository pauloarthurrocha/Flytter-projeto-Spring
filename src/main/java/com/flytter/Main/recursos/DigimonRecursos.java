package com.flytter.main.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flytter.main.entidades.Digimon;

@RestController
@RequestMapping(value = "/digimons")
public class DigimonRecursos {

	@GetMapping
	public ResponseEntity<Digimon> findAll() {

		Digimon dig = new Digimon("Koromon", "In Training", "https://digimon.shadowsmith.com/img/koromon.jpg");
		return ResponseEntity.ok().body(dig);

	}

}
