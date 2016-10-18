package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Comment;
import org.curso.spring.ejercicios.ejercicio3.repository.CommentRepository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CommentJdbcRepository extends JdbcDaoSupport implements CommentRepository {

	public Comment create(Comment entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Comment entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Comment entity) {
		// TODO Auto-generated method stub
		
	}

	
	
}
