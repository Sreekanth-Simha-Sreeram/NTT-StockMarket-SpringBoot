package com.stockmarketspringboot.stockmarketspringboot.dao;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.stockmarketspringboot.stockmarketspringboot.model.Chart;
import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.User;
@Component
public class UserServiceDaoImpl implements UserServiceDao {

	public User updateProfile(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> searchCompany(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> filterCompany(String companyName, String companyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public Chart GetChart(Company company, String stockExchange, Date fromTime, Date toTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> DisplayChart(List<Color> color) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean ExportDataFromChart(Chart chart) {
		// TODO Auto-generated method stub
		return false;
	}

}
