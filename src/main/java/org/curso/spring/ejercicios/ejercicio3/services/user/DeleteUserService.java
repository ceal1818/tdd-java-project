package org.curso.spring.ejercicios.ejercicio3.services.user;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.UserRepository;
import org.curso.spring.ejercicios.ejercicio3.services.ProcessorEntityService;

public class DeleteUserService implements ProcessorEntityService<User> {
	
	private UserRepository userRepository;
	
	public DeleteUserService() {
		// TODO Auto-generated constructor stub
	}
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void execute(User entity) {
		this.getUserRepository().delete(entity);	
	}

}
