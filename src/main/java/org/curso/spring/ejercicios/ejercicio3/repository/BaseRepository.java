package org.curso.spring.ejercicios.ejercicio3.repository;

import java.util.List;

public interface BaseRepository<T> {

	public T create(T entity);
	
	public List<T> findAll();
	
	public void update(T entity);
	
	public void delete(T entity);
	
}
