package com.flytter.main.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.flytter.main.entidades.Digimon;
import com.flytter.main.repositorios.DigimonRepositorio;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private DigimonRepositorio digimonRepositorio;

	@Override
	public void run(String... args) throws Exception {
		
		Digimon dig1 = new Digimon(null, "Yokomon", "In Training", "https://digimon.shadowsmith.com/img/yokomon.jpg");
		Digimon dig2 = new Digimon(null, "Motimon", "In Training", "https://digimon.shadowsmith.com/img/motimon.jpg");
		
		digimonRepositorio.saveAll(Arrays.asList(dig1, dig2));
		
		
		
		
	}
	
	
	
	

}
