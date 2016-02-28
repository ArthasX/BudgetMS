package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.budgetms.dao.IInvoiceDao;
import com.budgetms.pojo.Invoice;
import com.budgetms.service.IInvoService;
@Service("invoService")
public class InvoiceServiceImpl implements IInvoService {
	@Resource
	private IInvoiceDao invoDao=null;
	@Override
	public List<Invoice> getInvoByProperty(Invoice invo) {
		return invoDao.getInvoByProperty(invo);
	}

	@Override
	public int updateInvo(Invoice invo) {
		return invoDao.updateInvo(invo);
	}

	@Override
	public int deleteInvo(String invoId) {
		return invoDao.deleteInvo(invoId);
	}

	@Override
	public int insertInvo(Invoice invo) {
		return invoDao.insertInvo(invo);
	}

	@Override
	public List<Invoice> getInvoByPage(Invoice invo, int start, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInvoCount(Invoice invo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
