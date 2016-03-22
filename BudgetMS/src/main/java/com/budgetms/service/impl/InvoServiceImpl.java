package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IContPaymentDao;
import com.budgetms.dao.IInvoiceDao;
import com.budgetms.pojo.ContPayment;
import com.budgetms.pojo.Invoice;
import com.budgetms.service.IInvoService;

@Service("invoService")
public class InvoServiceImpl implements IInvoService {
	static Logger logger = Logger.getLogger(InvoServiceImpl.class);
	@Resource
	private IInvoiceDao invoDao = null;
	@Resource
	private IContPaymentDao contPaymentDao;

	@Override
	public List<Invoice> getInvoByProperty(Invoice invo) {
		return invoDao.getInvoByProperty(invo);
	}

	/**
	 * 根据invo 得到 contPaymentId 的数量 c 
	 * new invo()  set contPaymentId = invo.contPaymentId 
	 * select count()... from .. where contPaymentId= invo.contPaymentId 
	 * if c>1  do nothing
	 * if c= 1 set  ContPayment. ispaid = 0;
	 * 使用触发器了
	 */
	@Override
	public int updateInvo(Invoice invo) {
		String contPaymentId = invo.getContPaymentId();
		ContPayment cp = new ContPayment();
		cp.setContPaymentId(contPaymentId);
		// invoDao.getInvoCount(invo)
		int cpCount = contPaymentDao.getContPaymentCount(cp);
		if (cpCount > 0)
			return invoDao.updateInvo(invo);
		else
			return -1;
	}

	@Override
	public int deleteInvo(String invoId) {
		return invoDao.deleteInvo(invoId);
	}

	@Override
	public int insertInvo(Invoice invo) {
		String contPaymentId = invo.getContPaymentId();
		ContPayment cp = new ContPayment();
		cp.setContPaymentId(contPaymentId);
		int cpCount = contPaymentDao.getContPaymentCount(cp);
		if (cpCount > 0)
			return invoDao.insertInvo(invo);
		else
			return -1;
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
