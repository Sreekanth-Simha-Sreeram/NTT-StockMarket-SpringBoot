package com.stockmarketspringboot.stockmarketspringboot.dao;

import java.awt.Color;
import java.util.Date;
import java.util.List;

import com.stockmarketspringboot.stockmarketspringboot.model.Chart;
import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.User;

public interface UserServiceDao {
	public User updateProfile(int userID);
	 public List<Company> searchCompany(String companyName);
	 public List<Company> filterCompany(String companyName, String companyCode);
	 Chart GetChart(Company company,String stockExchange,Date fromTime,Date toTime);
    List<Company> DisplayChart( List<Color> color);
    boolean ExportDataFromChart(Chart chart);
}
