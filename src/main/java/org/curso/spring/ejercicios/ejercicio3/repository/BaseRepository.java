package org.curso.spring.ejercicios.ejercicio3.repository;

import java.util.List;

public interface BaseRepository<T> {

	public T add(T entity);
	
	public List<T> list();
	
	public void set(int id, T entity);
	
	public void remove(T entity);
	
}
