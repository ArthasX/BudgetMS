package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.Contract;

public interface IContractDao {
	List<Contract> getContById(String contId);

	List<Contract> getContByProperty(Contract cont);

	List<Contract> getContByPage(Contract cont, int start, int limit);

	int insertCont(Contract cont);

	int updateCont(Contract cont);

	int deleteCont(String contId);

	int getContCount(Contract cont);
	

}
