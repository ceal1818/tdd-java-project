package org.curso.spring.ejercicios.ejercicio3.services;

import org.curso.spring.ejercicios.ejercicio3.services.exceptions.ServiceException;

public interface RetrieverByParamService <T, P> {

	public T execute(P param) throws ServiceException;
	
}
