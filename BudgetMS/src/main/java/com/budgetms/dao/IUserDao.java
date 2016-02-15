package com.budgetms.dao;

import com.budgetms.pojo.User;

public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insertUser(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateUser(User record);
}