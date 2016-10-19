package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Comment;
import org.curso.spring.ejercicios.ejercicio3.repository.CommentRepository;
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
	public List<Comment> list() {
		List<Comment> comments = null;
		
		comments = this.getJdbcTemplate().query("", new RowMapper<Comment>(){

			@Override
			public Comment mapRow(ResultSet rs, int rowCount) throws SQLException {
				return null;
			}
			
		});
		
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
