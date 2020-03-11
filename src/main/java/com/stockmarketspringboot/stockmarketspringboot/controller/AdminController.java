package com.stockmarketspringboot.stockmarketspringboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.IPODetails;



public class AdminController {
	
	@RequestMapping(value={"/createCompany"}, method = RequestMethod.POST)
    public void createCompany(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @RequestBody Company company) 
    {	
		return ;	
    }
	
	@RequestMapping(value={"/deleteCompany/{companyId}"}, method = RequestMethod.DELETE)
    public boolean deleteCompany(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int companyId) 
    {
		return false;	
			
    }
	
	@RequestMapping(value={"companyName/editCompany/{companyId}"}, method = RequestMethod.POST)
    public Company editCompany(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int companyId,@PathVariable String companyName) 
    {
		return null ;	
			
    }
	
	@RequestMapping(value={"companyName/getCompany/{companyId}"}, method = RequestMethod.GET)
    public Company getCompany(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int companyId,@PathVariable String companyName) 
    {
		return null ;	
			
    }
	
	@RequestMapping(value={"/viewCompany/"}, method = RequestMethod.GET)
    public List<Company> viewCompany(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@RequestBody Company company) 
    {
		return null ;	
			
    }
	@RequestMapping(value={"/findCompany/{companyId}"}, method = RequestMethod.GET)
    public Company findCompany(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@PathVariable int companyId) 
    {
		return null ;	
			
    }
	@RequestMapping(value={"/updateIPODetails/{int ipoId}"}, method = RequestMethod.PUT)
    public IPODetails updateIPODetails(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse,@PathVariable int ipoId) 
    {
		return null ;	
			
    }
	
	
}
