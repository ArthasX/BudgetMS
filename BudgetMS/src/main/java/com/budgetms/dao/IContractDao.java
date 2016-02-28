package com.budgetms.dao;
 
import java.util.List;
import java.util.Map;

import com.budgetms.pojo.Contract;
 

public interface IContractDao {
	List<Contract> getContById(String contId);

	int insertCont(Contract cont);

	int updateCont(Contract cont);

	int deleteCont(String contId);

	List<Contract> getContByProperty(Contract cont);

	List<Contract> getContByMap(Map paraMap);

	// List<Contract> getContByPage(@Param("cont") Contract cont,
	// @Param("start") int start, @Param("limit") int limit);

	List<Contract> getContByPage(Contract cont, int start, int limit);
	
	int getContCount(Contract cont);
}
