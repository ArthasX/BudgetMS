package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.controller.ContController;
import com.budgetms.dao.IContractDao;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IContService;
@Service("contService")
public class ContServiceImpl implements IContService {
	static Logger logger = Logger.getLogger(ContServiceImpl.class);
	@Resource
	private IContractDao contDao=null;
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
		logger.info("json:" + JSON.toJSONString(map));
		return JSON.toJSON(map);
		 
	}

	@Override
	public int getContCount(Contract cont) {
		return contDao.getContCount(cont);
	}

}
