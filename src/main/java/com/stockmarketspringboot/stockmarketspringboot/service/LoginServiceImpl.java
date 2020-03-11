package com.stockmarketspringboot.stockmarketspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stockmarketspringboot.stockmarketspringboot.dao.LoginServiceDao;
import com.stockmarketspringboot.stockmarketspringboot.model.User;
@Component
@Service ("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	LoginServiceDao loginServiceDao;
	@Transactional
	public boolean signUp(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean signIn(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean signOut(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
