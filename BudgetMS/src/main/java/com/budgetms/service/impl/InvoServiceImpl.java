package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IInvoiceDao;
import com.budgetms.pojo.Invoice;
import com.budgetms.service.IInvoService;
@Service("invoService")
public class InvoServiceImpl implements IInvoService {
	static Logger logger = Logger.getLogger(InvoServiceImpl.class);
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
	public Object getInvoByPage(Invoice invo, int start, int limit) {
		List<Invoice> l = invoDao.getInvoByPage(invo, start, limit);
		int total = invoDao.getInvoCount(invo);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		logger.info("json:" + JSON.toJSONString(map));
		return JSON.toJSON(map);
	}

	@Override
	public int getInvoCount(Invoice invo) {
		return invoDao.getInvoCount(invo);
	}

}
