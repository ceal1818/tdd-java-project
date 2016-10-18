package org.curso.spring.ejercicios.ejercicio3.controllers;

import java.util.List;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.services.user.ListUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class ListUsersController {

	@Autowired
	ListUsersService listUsersService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView execute(ModelAndView modelAndView){
		List<User> users = listUsersService.execute();
		modelAndView.addObject("users", users);
		modelAndView.setViewName("listUsers");
		return modelAndView;
	}
	
}
