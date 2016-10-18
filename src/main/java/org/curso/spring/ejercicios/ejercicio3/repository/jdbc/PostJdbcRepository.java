package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Post;
import org.curso.spring.ejercicios.ejercicio3.repository.PostRepository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PostJdbcRepository extends JdbcDaoSupport implements PostRepository {

	public Post create(Post entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Post> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Post entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Post entity) {
		// TODO Auto-generated method stub
		
	}

}
