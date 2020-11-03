package com.flytter.main.servico.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object string){
		super ("Digimon nao encontrado");
	}
	
	}
