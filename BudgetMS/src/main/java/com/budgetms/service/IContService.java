package com.budgetms.service;

import java.util.List;

import com.budgetms.pojo.Contract;

public interface IContService {

	List<Contract> getContByProperty(Contract cont);

	int updateCont(Contract cont);

	int deleteCont(String contId);

	int insertCont(Contract cont);
	
	List<Contract>getAllCont();
}
