package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Post;
import org.curso.spring.ejercicios.ejercicio3.repository.PostRepository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PostJdbcRepository extends JdbcDaoSupport implements PostRepository {

	@Override
	public Post add(Post entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int id, Post entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Post entity) {
		// TODO Auto-generated method stub
		
	}

}
