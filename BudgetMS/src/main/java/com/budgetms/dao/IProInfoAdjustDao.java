package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.ProInfoAdjust;

public interface IProInfoAdjustDao {
	List<ProInfoAdjust> getProInfoAdjByProInfoId(String proInfoId);
 
	List<ProInfoAdjust> getProInfoAdjByProperty(ProInfoAdjust p);

	int insertProInfoAdj(ProInfoAdjust p);

	int updateProInfoAdj(ProInfoAdjust p);

	int deleteProInfoAdj(String proInfoAdjId);
	
	List<ProInfoAdjust> getProInfoAdjByPage(ProInfoAdjust p,int start,int limit);
	
	int getProInfoAdjCount(ProInfoAdjust p);
}
