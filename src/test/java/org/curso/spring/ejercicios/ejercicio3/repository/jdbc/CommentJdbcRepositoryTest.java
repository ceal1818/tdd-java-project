package org.curso.spring.ejercicios.ejercicio3.repository.jdbc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.Comment;
import org.curso.spring.ejercicios.ejercicio3.repository.exceptions.RepositoryJdbcException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.QueryTimeoutException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CommentJdbcRepositoryTest {
	
	private CommentJdbcRepository commentJdbcRepository;
	
	private JdbcTemplate jdbcTemplate;
	
	private List<Comment> comments;
	
	@Before
	public void init(){
		this.jdbcTemplate = mock(JdbcTemplate.class);
		this.commentJdbcRepository = new CommentJdbcRepository(this.jdbcTemplate);
		
		this.comments = new ArrayList<Comment>();
		this.comments.add(new Comment());
		this.comments.add(new Comment());
		this.comments.add(new Comment());
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
		

		try {
			List<Comment> result;
			/*
			 * Ejecutamos el método list del repositorio y obtenemos su resultado.
			 * */
			result = this.commentJdbcRepository.list();
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
		catch (RepositoryJdbcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@Test
	public void testListCommentsNotEmpty(){
		when(this.jdbcTemplate.query(anyString(), any(RowMapper.class)))
			.thenReturn(this.comments);
		
		List<Comment> result;
		try {
			result = this.commentJdbcRepository.list();
			
			verify(this.jdbcTemplate).query(anyString(), any(RowMapper.class));
			//DataAccessException
			assertNotNull(result);
			assertTrue("This list isn't empty.", result.size() > 0);			
		} 
		catch (RepositoryJdbcException e) {
			e.printStackTrace();
		} 
	}
	
	@Test(expected=RepositoryJdbcException.class)
	public void testListCommentUnsuccess() throws RepositoryJdbcException{
		doThrow(QueryTimeoutException.class).when(this.jdbcTemplate)
			.query(anyString(), any(RowMapper.class));
		this.commentJdbcRepository.list();
	}

}
