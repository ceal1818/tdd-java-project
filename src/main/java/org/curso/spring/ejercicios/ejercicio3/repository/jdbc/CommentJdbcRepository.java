package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Comment;
import org.curso.spring.ejercicios.ejercicio3.repository.CommentRepository;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CommentJdbcRepository implements CommentRepository {

	private JdbcTemplate jdbcTemplate;
	
	public CommentJdbcRepository() {
		// TODO Auto-generated constructor stub
	}
	
	public CommentJdbcRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Comment add(Comment entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> list() throws RepositoryJdbcException {
		List<Comment> comments = null;
		
		try{
			comments = this.getJdbcTemplate().query("select * from comments", new RowMapper<Comment>(){

				@Override
				public Comment mapRow(ResultSet rs, int rowCount) throws SQLException {
					return null;
				}
				
			});			
		}
		catch(DataAccessException e){
			throw new RepositoryJdbcException("Fallo!", e);
		}

		return comments;
	}

	@Override
	public void set(int id, Comment entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Comment entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Comment get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
