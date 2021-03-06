package com.budgetms.service;

import com.budgetms.pojo.ContPayment;

public interface IContPaymentService {

	Object getContPaymentByContId(String contId);

	int insertContPayment(ContPayment c);

	int updateContPayment(ContPayment c);

	int deleteContPayment(String contPaymentId);

	Object getContPaymentByPage(ContPayment c, int start, int limit);
}
