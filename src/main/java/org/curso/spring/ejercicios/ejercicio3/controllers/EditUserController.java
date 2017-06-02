package org.curso.spring.ejercicios.ejercicio3.controllers;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.services.exceptions.ServiceException;
import org.curso.spring.ejercicios.ejercicio3.services.user.GetUserByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class EditUserController {

	@Autowired
	GetUserByIdService getUserByIdService;
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView execute(@RequestParam("id") int id, ModelAndView modelAndView){
		User user;
		try {
			user = getUserByIdService.execute(id);
			modelAndView.addObject("user", user);
			modelAndView.setViewName("editUser");
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return modelAndView;
	}
}
