package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.Tender;

public interface ITenderDao  {
	List<Tender> getTenderByPage(Tender t,int start,int limit);
	int insertTender(Tender t);
	int updateTender(Tender t);
	int deleteTender(int id);
	int getTenderCount(Tender t);
}
