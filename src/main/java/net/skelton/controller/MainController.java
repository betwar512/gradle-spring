package net.skelton.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import net.skelton.config.security.IAuthenticationFacade;
import net.skelton.model.User;
import net.skelton.service.UserService;


public abstract class MainController {

	protected static final Logger logger = Logger.getLogger(MainController.class);
	@Autowired
	UserService service;
	
	@Autowired
    private IAuthenticationFacade authenticationFacade;

	public void setAuthenticationFacade(IAuthenticationFacade authenticationFacade) {
		this.authenticationFacade = authenticationFacade;
	}

	
	public IAuthenticationFacade getAuthenticationFacade() {
		return authenticationFacade;
	}


	
	protected User getCurrentUser(){
		return service.findByName(getUserName());
	}
	
	protected String getUserName(){
		return	authenticationFacade.getAuthentication().getName();
	}

}
