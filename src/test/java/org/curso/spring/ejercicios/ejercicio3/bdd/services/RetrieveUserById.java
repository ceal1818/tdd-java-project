package org.curso.spring.ejercicios.ejercicio3.bdd.services;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.jdbc.UserJdbcRepository;
import org.curso.spring.ejercicios.ejercicio3.services.user.GetUserByIdService;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RetrieveUserById {

	private User user = new User(1, "ceal", "Carlos", "Ayala", "ceal1818@gmail.com", 32, "test");
	
	private UserJdbcRepository userJdbcRepository = mock(UserJdbcRepository.class);
	
	private GetUserByIdService service;
	
	private User result;
	
	@Given("^I have an instance of retrieving service of user by userId$")
	public void i_have_an_instance_of_retrieving_service_of_user_by_userId() throws Throwable {
	    when(this.userJdbcRepository.get(anyInt()))
    		.thenReturn(this.user);
    
	    this.service = new GetUserByIdService(this.userJdbcRepository);
	}

	@When("^It get a user by (\\d+)$")
	public void it_get_a_user_by(int id) throws Throwable {
		result = this.service.execute(id);
	}

	@Then("^I check it with this object$")
	public void i_check_it_with_this_object(List<User> users) throws Throwable {
		User user1 = users.get(0);
		
	    Assert.assertTrue(this.result.toString().equals(user1.toString()));
	}
	
}
