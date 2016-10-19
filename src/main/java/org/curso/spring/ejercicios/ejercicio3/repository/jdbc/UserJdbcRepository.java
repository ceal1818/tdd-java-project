package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.repository.UserRepository;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.curso.spring.ejercicios.ejercicio3.repository.jdbc.mappers.UserRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJdbcRepository implements UserRepository {

	private JdbcTemplate jdbcTemplate;
	
	public UserJdbcRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public UserJdbcRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public User add(User entity) {
		String sql = "insert into users (nickname, first_name, last_name, email, age, photo) values (?, ?, ?, ?, ?, ?)";
		this.getJdbcTemplate().update(sql, new Object[]{
				entity.getNickname(), entity.getFirstName(), entity.getLastName(), 
				entity.getEmail(), entity.getAge(), entity.getPhoto()});
		return entity;
	}

	public List<User> list() {
		String sql = "select * from users";
		return this.getJdbcTemplate().query(sql, new UserRowMapper());
	}

	public void set(int id, User entity) {
		String sql = "update users set nickname = ?, first_name = ?, last_name = ?, email = ?, age = ?, photo = ? where id = ?";
		this.getJdbcTemplate().update(sql, new Object[]{
				entity.getNickname(), entity.getFirstName(), entity.getLastName(), 
				entity.getEmail(), entity.getAge(), entity.getPhoto(), entity.getId()});
	}

	public void remove(User entity) {
		String sql = "delete from users where id = ?";
		this.getJdbcTemplate().update(sql, new Object[]{entity.getId()});
	}

	public User get(int id) throws RepositoryJdbcException {
		User result = null;
		
		try{
			result = this.getJdbcTemplate().queryForObject(
					"select * from users where id = ?", new Object[]{id}, new UserRowMapper()
					);			
		}
		catch(DataAccessException e){
			throw new RepositoryJdbcException("Data access exception...", e);
		}

		return result;
	}

}