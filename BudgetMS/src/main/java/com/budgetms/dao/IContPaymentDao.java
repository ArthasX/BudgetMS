package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.ContPayment;

public interface IContPaymentDao   {
	List<ContPayment> getContPaymentByContId(String contId);
	int updateContPayment(ContPayment c);
	int insertContPayment(ContPayment c);
	int deleteContPayment(String contPaymentId);
}
