package org.curso.spring.ejercicios.ejercicio3.controllers;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.services.user.SaveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class SaveUserController {

	@Autowired
	SaveUserService saveUserService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView execute(@ModelAttribute User user){
		this.saveUserService.execute(user);
		return new ModelAndView("redirect:/users");
	}
	
}
