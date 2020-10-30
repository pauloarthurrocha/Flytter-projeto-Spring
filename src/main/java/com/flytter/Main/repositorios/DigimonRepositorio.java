package com.flytter.main.repositorios;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flytter.main.entidades.Digimon;

public interface DigimonRepositorio extends JpaRepository<Digimon, String> {

	 List<Digimon>findByName(String name);

}

