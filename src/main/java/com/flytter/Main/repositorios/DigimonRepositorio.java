package com.flytter.main.repositorios;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.flytter.main.entidades.Digimon;

public interface DigimonRepositorio extends JpaRepository<Digimon, String> {

	
	List<Digimon> findByName(String name);
	
	@Transactional(readOnly = true)
	@Query("SELECT d FROM Digimon d WHERE d.name=?1 ")
	Digimon existsDigimonByName(String name);


}

