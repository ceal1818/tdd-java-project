package org.curso.spring.ejercicios.ejercicio3.controllers;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class NewUserController {

	@RequestMapping(value="/new")
	public ModelAndView execute(ModelAndView modelAndView){
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("editUser");
		return modelAndView;
	}
	
}
