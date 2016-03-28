package com.budgetms.service;
 
import com.budgetms.pojo.Tender;

public interface ITenderService {
 
	Object getTenderByPage(Tender t,int start,int limit);
	int insertTender(Tender t);
	int updateTender(Tender t);
	int deleteTender(String id);
	
}
