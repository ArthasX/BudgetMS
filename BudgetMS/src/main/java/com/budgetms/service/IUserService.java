package com.budgetms.service;

import com.budgetms.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
	public int addUser(User user); 
}
