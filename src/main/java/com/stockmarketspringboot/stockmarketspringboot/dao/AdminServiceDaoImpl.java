package com.stockmarketspringboot.stockmarketspringboot.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.IPODetails;
@Component
public class AdminServiceDaoImpl implements AdminServiceDao {

	public void createCompany(Company company) {
		// TODO Auto-generated method stub

	}

	public boolean deleteCompany(int companyId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Company editCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company getCompany(String companyName, int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Company> viewCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	public Company findCompany(int companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public IPODetails updateIPODetails(int ipoId) {
		// TODO Auto-generated method stub
		return null;
	}

}
