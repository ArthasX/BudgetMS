package com.budgetms.dao;
 
import java.util.List;

import com.budgetms.pojo.Contract;

public interface IContractDao {
	List<Contract> getContById(String contId);
 
	int insertCont(Contract cont);

	int updateCont(Contract cont);

	List<Contract> getContByProperty(Contract cont);
}
