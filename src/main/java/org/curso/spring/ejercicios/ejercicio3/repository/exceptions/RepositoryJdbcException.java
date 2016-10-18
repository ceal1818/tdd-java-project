package org.curso.spring.ejercicios.ejercicio3.repository.exceptions;

public class RepositoryJdbcException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -34274170326510316L;

	public RepositoryJdbcException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RepositoryJdbcException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RepositoryJdbcException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RepositoryJdbcException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
