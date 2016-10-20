package org.curso.spring.ejercicios.ejercicio3.bdd.services;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.jdbc.UserJdbcRepository;
import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ListUsersService {
	
	private org.curso.spring.ejercicios.ejercicio3.services.user.ListUsersService listUsersService;
	
	private UserJdbcRepository userJdbcRepository = mock(UserJdbcRepository.class);
	
	private List<User> users = new ArrayList<User>();
	
	private List<User> result;
	
	@Given("^I has a list all users service$")
	public void i_has_a_list_all_users_service() throws Throwable {
		this.users.add(new User(1, "ceal", "Carlos", "Ayala", "ceal1818@gmail.com", 32, "test"));
		this.users.add(new User(2, "ceal1", "Carlos", "Ayala", "ceal1919@gmail.com", 32, "test"));
		this.users.add(new User(3, "ceal2", "Carlos", "Ayala", "ceal2020@gmail.com", 32, "test"));
		this.users.add(new User(4, "ceal3", "Carlos", "Ayala", "ceal2121@gmail.com", 32, "test"));
		
	    this.listUsersService = new org.curso.spring.ejercicios.ejercicio3.services.user.ListUsersService();
	    this.listUsersService.setUserRepository(this.userJdbcRepository);
	    
	    when(this.userJdbcRepository.list()).thenReturn(this.users);
	}

	@When("^This services retrieves all users$")
	public void this_services_retrieves_all_users() throws Throwable {
	    this.result = this.listUsersService.execute();
	}

	@Then("^I check then with this list$")
	public void i_check_then_with_this_list(List<User> users) throws Throwable {
		
		for (int i = 0; i < this.result.size(); i++) {			
		    Assert.assertTrue(this.result.get(i).toString().equals(users.get(i).toString()));			
		}
	}
	
}
