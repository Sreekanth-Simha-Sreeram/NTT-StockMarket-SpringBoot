package com.stockmarketspringboot.stockmarketspringboot.dao;

import com.stockmarketspringboot.stockmarketspringboot.model.User;

public interface LoginServiceDao {
	public boolean signUp(User user);
	public boolean signIn(String userName, String userPassword);
	public boolean signOut(int userId);
}
