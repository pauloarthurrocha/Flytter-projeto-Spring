package com.flytter.main.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.flytter.main.entidades.Digimon;
import com.flytter.main.repositorios.DigimonRepositorio;
import com.flytter.main.servico.exceptions.ResourceNotFoundException;
import com.flytter.main.servico.exceptions.ResourcealreadyexistsException;

@Service
public class DigimonServico {

	@Autowired
	private DigimonRepositorio repositorio;

	public List<Digimon> findAll() {
		return repositorio.findAll();
	}

	public Digimon getDigimonByName(String name) {
		try {
			List<Digimon> DigimonName = repositorio.findByName(name);
			return DigimonName.get(0);
		} catch (RuntimeException e) {
			

			throw new ResourceNotFoundException(name);
		}

	}

	public Digimon insert(Digimon obj) {
		Digimon digi = null;
		obj.setId(null);
		if (repositorio.existsDigimonByName(obj.getName()) == null) {
			digi = repositorio.save(obj);
			
		}else if (repositorio.existsDigimonByName(obj.getName()) != null) {
			throw new ResourcealreadyexistsException(obj.getName());
		}
		
		
			return digi;
	}

	public void delete(String name) {
		try {
		repositorio.delete(getDigimonByName(name));
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(name);
		}
	}
}
