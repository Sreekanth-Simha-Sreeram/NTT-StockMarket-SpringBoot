package com.stockmarketspringboot.stockmarketspringboot.service;

import com.stockmarketspringboot.stockmarketspringboot.model.User;

public interface LoginService {
	public boolean signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public boolean signOut(int userId);
}
