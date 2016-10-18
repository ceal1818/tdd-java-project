package org.curso.spring.ejercicios.ejercicio3.controllers;

import org.curso.spring.ejercicios.ejercicio3.entities.User;
import org.curso.spring.ejercicios.ejercicio3.services.exceptions.ServiceException;
import org.curso.spring.ejercicios.ejercicio3.services.user.DeleteUserService;
import org.curso.spring.ejercicios.ejercicio3.services.user.GetUserByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class RemoveUserController {

	@Autowired
	DeleteUserService deleteUserService;
	
	@Autowired
	GetUserByIdService getUserByIdService;
	
	@RequestMapping(value="/remove")
	public ModelAndView execute(@RequestParam("id") int id){
		User user;
		try {
			user = this.getUserByIdService.execute(id);
			if (user != null){
				this.deleteUserService.execute(user);	
			}
		} 
		catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/users");
	}
	
}
