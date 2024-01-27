package com.devsuperior.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EntidadeEmUsoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EntidadeEmUsoException(Long id) {
		super("Não é possível excluir o código de identificação " + id + " porque está em uso por outra tabela.");
	}
}
