package com.stockmarketspringboot.stockmarketspringboot.dao;

import java.util.List;

import com.stockmarketspringboot.stockmarketspringboot.model.Company;
import com.stockmarketspringboot.stockmarketspringboot.model.IPODetails;

public interface AdminServiceDao {
	public void createCompany(Company company );
	public boolean deleteCompany(int companyId);
	public Company editCompany(String companyName,int companyId);
	public Company getCompany(String companyName,int companyId);
	public List<Company> viewCompany(Company company);
	Company findCompany(int companyId);
	IPODetails updateIPODetails(int ipoId);
}
