package com.budgetms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.budgetms.dao.IUserDao;
import com.budgetms.pojo.User;
import com.budgetms.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	public int addUser(User user){
		return this.userDao.insertUser(user);
	}
}
