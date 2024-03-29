package com.devsuperior.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EntidadeNaoEncontradaException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EntidadeNaoEncontradaException(Long id) {
		super("id de código " + id + " não encontrado ");
	}
}
