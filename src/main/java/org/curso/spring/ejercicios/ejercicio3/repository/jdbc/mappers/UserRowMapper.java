package org.curso.spring.ejercicios.ejercicio3.repository.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowcount) throws SQLException {
		User user = new User();
		user.setId(rs.getInt(1));
		user.setNickname(rs.getString(2));
		user.setFirstName(rs.getString(3));
		user.setLastName(rs.getString(4));
		user.setEmail(rs.getString(5));
		user.setAge(rs.getInt(6));
		user.setPhoto(rs.getString(7));
		return user;
	}
	
}
