package com.budgetms.service;

import java.util.List;

import com.budgetms.pojo.ContAdjust;
import com.budgetms.pojo.Contract;

public interface IContService {

	List<Contract> getContByProperty(Contract cont);

	int updateCont(Contract cont);

	int deleteCont(String contId);

	int insertCont(Contract cont);
		
	Object getContByPage(Contract cont, int start, int limit);

	int getContCount(Contract cont);
	
	//cont adj
	
	Object getContAdjByPage(ContAdjust c,int start,int limit);
	int insertContAdj(ContAdjust ca);

	int updateContAdj(ContAdjust ca);

	int deleteContAdj(String id);

	int getContContAdj(ContAdjust ca);
}
