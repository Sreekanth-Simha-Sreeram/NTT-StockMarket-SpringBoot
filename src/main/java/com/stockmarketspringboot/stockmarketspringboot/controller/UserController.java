package com.stockmarketspringboot.stockmarketspringboot.controller;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.stockmarketspringboot.stockmarketspringboot.model.Chart;
import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.User;

public class UserController {
	
	@RequestMapping(value={"/viewProfile/{userID}"}, method = RequestMethod.PUT)
    public User updateProfile(HttpServletRequest httpRequest, 
			HttpServletResponse httpResponse, @PathVariable int userID) 
    {	
		return null;	
    }
	
	 
	 @RequestMapping(value={"/searchCompany/{companyName}"}, method = RequestMethod.GET)
	    public List<Company>searchCompany(HttpServletRequest httpRequest, 
				HttpServletResponse httpResponse, @PathVariable String companyName) 
	    {	
			return null;	
	    }
	 
	 @RequestMapping(value={"{companyCode}/filterCompany/{companyName}"}, method = RequestMethod.GET)
	    public List<Company>filterCompany(HttpServletRequest httpRequest, 
				HttpServletResponse httpResponse, @PathVariable String companyName,@PathVariable String companyCode) 
	    {	
			return null;	
	    }
	 
	 @RequestMapping(value={"{ fromTime}/GetChart/{stockExchange}/{toTime}"}, method = RequestMethod.GET)
	    public Chart GetChart(HttpServletRequest httpRequest, 
				HttpServletResponse httpResponse, @RequestBody Company company, @PathVariable String stockExchange,@PathVariable Date fromTime,@PathVariable Date toTime ) 
	    {	
			return null;	
	    }
	 
	 @RequestMapping(value={"/DisplayChart/"}, method = RequestMethod.GET)
	    public List<Company> DisplayChart(HttpServletRequest httpRequest, 
				HttpServletResponse httpResponse, @RequestBody List<Color> color ) 
	    {	
			return null;	
	    }
	 @RequestMapping(value={"/ExportDataFromChart/"}, method = RequestMethod.GET)
	    public  boolean ExportDataFromChart(HttpServletRequest httpRequest, 
				HttpServletResponse httpResponse, @RequestBody Chart chart ) 
	    {
			return false;
		 
	    }
	 
}
