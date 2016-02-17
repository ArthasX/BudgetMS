package com.budgetms.service;

import java.util.List;

import com.budgetms.pojo.Invoice;

public interface IInvoService {

	List<Invoice> getInvoByProperty(Invoice invo);

	int updateInvo(Invoice invo);

	int deleteInvo(String invoId);

	int insertInvo(Invoice invo);

}
