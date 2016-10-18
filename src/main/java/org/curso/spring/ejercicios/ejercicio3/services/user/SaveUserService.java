package org.curso.spring.ejercicios.ejercicio3.services.user;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.UserRepository;
import org.curso.spring.ejercicios.ejercicio3.services.RetrieverByParamService;

public class SaveUserService implements RetrieverByParamService<User, User> {

	private UserRepository userRepository;
	
	public SaveUserService() {
		
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User execute(User entity) {
		if (entity.getId() > 0){
			this.getUserRepository().update(entity);
		}
		else{
			this.getUserRepository().create(entity);
		}
		return entity;
	}
	
}
