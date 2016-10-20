package org.curso.spring.ejercicios.ejercicio3.repository;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;

public interface BaseRepository<T> {

	public T add(T entity);
	
	public List<T> list() throws RepositoryJdbcException;
	
	public void set(int id, T entity);
	
	public void remove(T entity);
	
}
