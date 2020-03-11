package com.stockmarketspringboot.stockmarketspringboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.User;

public class LoginController {
	
	
	@RequestMapping(value={"/signUp/"}, method = RequestMethod.POST)
    public boolean signUp(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody User user) 
    {
		return false;	
			
    }
	
	@RequestMapping(value={"{userPassword}/deleteCompany/{userName}"}, method = RequestMethod.PUT)
    public boolean signIn(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable String userName, @PathVariable String userPassword ) 
    {
		return false;	
			
    }
	
	@RequestMapping(value={"/signOut/{userId}"}, method = RequestMethod.PUT)
    public boolean signOut(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int userId ) 
    {
		return false;	
			
    }
}
