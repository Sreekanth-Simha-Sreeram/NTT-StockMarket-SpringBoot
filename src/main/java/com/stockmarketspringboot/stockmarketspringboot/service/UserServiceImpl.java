package com.stockmarketspringboot.stockmarketspringboot.service;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockmarketspringboot.stockmarketspringboot.dao.UserServiceDao;
import com.stockmarketspringboot.stockmarketspringboot.model.Chart;
import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.User;

@Component
@Service ("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserServiceDao userServiceDao;
	
	@Transactional
	public User updateProfile(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Company> searchCompany(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Company> filterCompany(String companyName, String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Chart GetChart(Company company, String stockExchange, Date fromTime, Date toTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<Company> DisplayChart(List<Color> color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean ExportDataFromChart(Chart chart) {
		// TODO Auto-generated method stub
		return false;
	}

}
