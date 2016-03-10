package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IContPaymentDao;
import com.budgetms.pojo.ContPayment;
import com.budgetms.service.IContPaymentService;

@Service("contPaymentService")
public class ContPaymentImpl implements IContPaymentService {
	static Logger logger = Logger.getLogger(ContPaymentImpl.class);
	@Resource
	private IContPaymentDao contPaymentDao = null;

	@Override
	public Object getContPaymentByContId(String contId) {
		List<ContPayment> l = contPaymentDao.getContPaymentByContId(contId);
		Object o = JSON.toJSON(l);
		logger.info(o);
		return o;
	}

	@Override
	public int insertContPayment(ContPayment c) {
		logger.info("insert:" + c);
		return contPaymentDao.insertContPayment(c);
	}

	@Override
	public int updateContPayment(ContPayment c) {
		logger.info("update:" + c);
		return contPaymentDao.updateContPayment(c);
	}

	@Override
	public int deleteContPayment(String contPaymentId) {
		logger.info("delete:" + contPaymentId);
		return contPaymentDao.deleteContPayment(contPaymentId);
	}

	@Override
	public Object getContPaymentByPage(ContPayment c, int start, int limit) {
		List<ContPayment> l = contPaymentDao.getContPaymentByPage(c, start,
				limit);
		int total = contPaymentDao.getContPaymentCount(c);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSON(map);
		logger.info(o);
		return o;
	}
}
