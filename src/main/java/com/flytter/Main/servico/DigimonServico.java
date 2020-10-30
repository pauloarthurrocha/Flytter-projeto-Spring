package com.flytter.main.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flytter.main.entidades.Digimon;
import com.flytter.main.repositorios.DigimonRepositorio;

@Service
public class DigimonServico {

	@Autowired
	private DigimonRepositorio repositorio;

	public List<Digimon> findAll() {
		return repositorio.findAll();
	}

	public Digimon getDigimonByName(String name) {
		List<Digimon> DigimonName = repositorio.findByName(name);
		return DigimonName.get(0);
	}

}
