package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.ContAdjust;
import com.budgetms.pojo.ContPayment;

public interface IContAdjDao {
	 
	List<ContAdjust> getContAdjByPage(ContAdjust ca,int start,int limit);

	int insertContAdj(ContAdjust ca);

	int updateContAdj(ContAdjust ca);

	int deleteContAdj(String id);

	int getContAdjCount(ContAdjust ca);
}
