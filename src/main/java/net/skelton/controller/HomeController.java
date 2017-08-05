package net.skelton.controller;

import org.hibernate.loader.plan.exec.process.spi.ReturnReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.skelton.model.User;

@RestController
@RequestMapping("/")
public class HomeController extends MainController {

		
	@RequestMapping(method = RequestMethod.GET)
	public String get(){
	return "Endpoint Api";
	}
	
	@RequestMapping(value="user" ,method = RequestMethod.GET)
	public User getUser(){
		return this.getUser();
	}
	
	
	
	

}
