package com.budgetms.dao;
 
import java.util.List;

import com.budgetms.pojo.Invoice;

public interface IInvoiceDao {
	List<Invoice> getInvoById(String invoId);
 
	int insertInvo(Invoice invo);

	int updateInvo(Invoice invo);
	
	int deleteInvo(String invoId);
	
	List<Invoice> getInvoByProperty(Invoice invo);
}
