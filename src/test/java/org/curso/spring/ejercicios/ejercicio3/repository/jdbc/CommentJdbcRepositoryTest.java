package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Comment;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CommentJdbcRepositoryTest {
	
	private CommentJdbcRepository commentJdbcRepository;
	
	private JdbcTemplate jdbcTemplate;
	
	@Before
	public void init(){
		this.jdbcTemplate = mock(JdbcTemplate.class);
		this.commentJdbcRepository = new CommentJdbcRepository(this.jdbcTemplate);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testListCommentSuccess(){
		/*
		 * Utilizamos el mock como un stub, al solo prepragramar el método 
		 * que se utilizará dentro del método que probamos.
		 * */
		when(this.jdbcTemplate.query(anyString(), any(RowMapper.class)))
			.thenReturn(new ArrayList<Comment>());
		
		/*
		 * Ejecutamos el método list del repositorio y obtenemos su resultado.
		 * */
		List<Comment> result = this.commentJdbcRepository.list(); 
		
		/*
		 * Comprobamos que se ha ejecutado una vez este método al que 
		 * aplicamos stubbing. 
		 * */
		verify(this.jdbcTemplate).query(anyString(), any(RowMapper.class));
		
		/*
		 * Comprobamos que la lista no es nula.
		 * */
		assertNotNull(result);
	}

}
