package org.curso.spring.ejercicios.ejercicio3.services.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.UserRepository;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.curso.spring.ejercicios.ejercicio3.services.exceptions.ServiceException;
import org.junit.Before;
import org.junit.Test;

public class RetrieveUserByIdServiceTest {

	private GetUserByIdService getUserByIdService;
	
	private UserRepository userRepository;
	
	private User user1;
	
	@Before
	public void init(){		
		this.userRepository = mock(UserRepository.class);
		this.getUserByIdService = new GetUserByIdService(this.userRepository);
		
		this.user1 = new User(1, "darkmoon", "Dark", "Moon", "dark_moon@test.com", 52, "photo");
	}
	
	@Test
	public void testRetrieveUserSuccess(){
		try {
			when(this.userRepository.get(anyInt())).thenReturn(this.user1);
			
			User result = this.getUserByIdService.execute(1);
			
			verify(this.userRepository).get(anyInt());
			
			assertNotNull(result);
			assertEquals(this.user1, result);
		} 
		catch (RepositoryJdbcException e) {
			e.printStackTrace();
		} 
		catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = ServiceException.class)
	public void testRetrieveUserUnsuccess() throws ServiceException {
		try {
			doThrow(RepositoryJdbcException.class).when(this.userRepository).get(anyInt());
		} catch (RepositoryJdbcException e) {
			e.printStackTrace();
		}
			
		this.getUserByIdService.execute(1);
	}
}
