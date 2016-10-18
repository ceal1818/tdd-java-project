package org.curso.spring.ejercicios.ejercicio3.repository;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;

public interface UserRepository extends BaseRepository<User> {
	
	public User get(int id) throws RepositoryJdbcException;
	
}
