package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.ContPayment;

public interface IContPaymentDao {
	List<ContPayment> getContPaymentByContId(String contId);

	List<ContPayment> getContPaymentByPage(ContPayment c, int start, int limit);

	int updateContPayment(ContPayment c);

	int insertContPayment(ContPayment c);

	int deleteContPayment(int contPaymentId);
	
	int getContPaymentCount(ContPayment c);
	

}
