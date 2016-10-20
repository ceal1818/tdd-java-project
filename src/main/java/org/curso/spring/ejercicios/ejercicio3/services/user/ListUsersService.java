package org.curso.spring.ejercicios.ejercicio3.services.user;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.UserRepository;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.curso.spring.ejercicios.ejercicio3.services.RetrieverService;

public class ListUsersService implements RetrieverService<List<User>> {

	private UserRepository userRepository;
	
	public ListUsersService() {
		// TODO Auto-generated constructor stub
	}
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> execute() {
		// TODO Auto-generated method stub
		List<User> result =  null;
		try {
			result = this.getUserRepository().list();
		}
		catch (RepositoryJdbcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	
	
}
