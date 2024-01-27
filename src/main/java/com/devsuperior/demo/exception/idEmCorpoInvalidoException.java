package com.devsuperior.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class idEmCorpoInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public idEmCorpoInvalidoException(String name, Long id) {
		super("Id de " + name + "com código " + id + " não foi encontrado .");
	}
}
