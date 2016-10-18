package org.curso.spring.ejercicios.ejercicio3.services.user;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.UserRepository;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.curso.spring.ejercicios.ejercicio3.services.RetrieverByParamService;
import org.curso.spring.ejercicios.ejercicio3.services.exceptions.ServiceException;

public class GetUserByIdService implements RetrieverByParamService<User, Integer> {
	
	private UserRepository userRepository;
	
	public GetUserByIdService() {
		// TODO Auto-generated constructor stub
	}

	public GetUserByIdService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User execute(Integer id) throws ServiceException {
		User result = null;
		try {
			result = this.userRepository.get(id);
		} 
		catch (RepositoryJdbcException e) {
			throw new ServiceException("Service Exception...", e); 
		}
		return result;
	}
	
}
