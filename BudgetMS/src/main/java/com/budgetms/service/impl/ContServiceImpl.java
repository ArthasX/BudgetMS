package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.controller.ContController;
import com.budgetms.dao.IContAdjDao;
import com.budgetms.dao.IContractDao;
import com.budgetms.pojo.ContAdjust;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IContService;

@Service("contService")
public class ContServiceImpl implements IContService {
	static Logger logger = Logger.getLogger(ContServiceImpl.class);
	@Resource
	private IContractDao contDao;
	@Resource
	private IContAdjDao contAdjDao;

	@Override
	public List<Contract> getContByProperty(Contract cont) {
		return contDao.getContByProperty(cont);
	}

	@Override
	public int updateCont(Contract cont) {
		return contDao.updateCont(cont);
	}

	@Override
	public int deleteCont(String contId) {
		return contDao.deleteCont(contId);
	}

	@Override
	public int insertCont(Contract cont) {
		return contDao.insertCont(cont);
	}

	@Override
	public Object getContByPage(Contract cont, int start, int limit) {
		List<Contract> l = contDao.getContByPage(cont, start, limit);
		int total = contDao.getContCount(cont);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSON(map);
		logger.info(o);
		return o;
	}

	@Override
	public int getContCount(Contract cont) {
		return contDao.getContCount(cont);
	}

	// cont adj

	@Override
	public Object getContAdjByPage(ContAdjust c, int start, int limit) {
		List<ContAdjust> l = contAdjDao.getContAdjByPage(c, start, limit);
		int total = contAdjDao.getContAdjCount(c);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSON(map);
		logger.info(o);
		return o;
	}

	@Override
	public int insertContAdj(ContAdjust ca) {
		String t = ca.getAdjType();
		if (t.equals("时间")) {
			ca.setRemark("合同付款编号:" + ca.getContPaymentId() + "-付款时间调整至:"
					+ ca.getAdjDate());
		} else {
			ca.setRemark("合同付款编号:" + ca.getContPaymentId() + "-付款金额调整至:"
					+ ca.getAdjAmt());
		}
		return contAdjDao.insertContAdj(ca);
	}

	@Override
	public int updateContAdj(ContAdjust ca) {
		String t = ca.getAdjType();
		if (t.equals("时间")) {
			ca.setRemark("合同付款编号:" + ca.getContPaymentId() + "-付款时间调整至:"
					+ ca.getAdjDate());
		} else {
			ca.setRemark("合同付款编号:" + ca.getContPaymentId() + "-付款金额调整至:"
					+ ca.getAdjAmt());
		}
		return contAdjDao.updateContAdj(ca);
	}

	@Override
	public int deleteContAdj(String id) {
		return contAdjDao.deleteContAdj(id);
	}

	@Override
	public int getContContAdj(ContAdjust ca) {
		// TODO Auto-generated method stub
		return 0;
	}

}
