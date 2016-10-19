package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Comment;
import org.curso.spring.ejercicios.ejercicio3.repository.CommentRepository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CommentJdbcRepository extends JdbcDaoSupport implements CommentRepository {

	@Override
	public Comment add(Comment entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int id, Comment entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Comment entity) {
		// TODO Auto-generated method stub
		
	}

}
