package com.flytter.main.servico.exceptions;

public class ResourcealreadyexistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourcealreadyexistsException(Object string) {
		super("Digimon ja Cadastrado");
	}

}
