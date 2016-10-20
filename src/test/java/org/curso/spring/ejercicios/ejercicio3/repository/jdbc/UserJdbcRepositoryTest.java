package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.curso.spring.ejercicios.ejercicio3.repository.jdbc.mappers.UserRowMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.dao.QueryTimeoutException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJdbcRepositoryTest {
	
	private UserJdbcRepository userJdbcRepository;
	
	private JdbcTemplate jdbcTemplate;
	
	private User user1;
	
	@Before
	public void init(){		
		this.jdbcTemplate = mock(JdbcTemplate.class);
		
		this.userJdbcRepository = new UserJdbcRepository(this.jdbcTemplate);
		
		this.user1 = new User(1, "darkmoon", "Dark", "Moon", "dark_moon@test.com", 52, "photo");
	}
	
	@Test	
	public void testGetUserFound() {		
		when(this.jdbcTemplate.queryForObject(
				anyString(), any(Object[].class), any(UserRowMapper.class)
				)).thenReturn(this.user1);
		
		User result = null;
		try {
			result = this.userJdbcRepository.get(1);
		} 
		catch (RepositoryJdbcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verify(this.jdbcTemplate).queryForObject(
				anyString(), any(Object[].class), any(UserRowMapper.class)
				);
		
		assertNotNull(result);
		assertEquals(this.user1, result);
	}
	
	@Test	
	public void testGetUserNotFound() {		
		when(this.jdbcTemplate.queryForObject(
				anyString(), any(Object[].class), any(UserRowMapper.class)
				)).thenReturn(null);
		
		User result = null;
		try {
			result = this.userJdbcRepository.get(2);
		} 
		catch (RepositoryJdbcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verify(this.jdbcTemplate).queryForObject(
				anyString(), any(Object[].class), any(UserRowMapper.class)
				);
		
		assertNull(result);
	}
	
	@Test(expected=RepositoryJdbcException.class)	
	public void testGetUserFailed() throws RepositoryJdbcException{		
		doThrow(QueryTimeoutException.class).when(this.jdbcTemplate).queryForObject(
				anyString(), any(Object[].class), any(UserRowMapper.class));
		
		this.userJdbcRepository.get(1);
	}
	
}
