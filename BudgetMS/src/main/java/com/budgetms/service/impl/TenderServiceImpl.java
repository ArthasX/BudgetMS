package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.ITenderDao;
import com.budgetms.pojo.Tender;
import com.budgetms.service.ITenderService;

@Service("tenderService")
public class TenderServiceImpl implements ITenderService {
	static Logger logger = Logger.getLogger(TenderServiceImpl.class);
	@Resource
	ITenderDao tenderDao;

	@Override
	public Object getTenderByPage(Tender t, int start, int limit) {
		List<Tender> l = tenderDao.getTenderByPage(t, start, limit);
		int total = tenderDao.getTenderCount(t);
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("record", l);
		m.put("total", total);
		Object o = JSON.toJSON(m);
		logger.info(o);
		return o;
	}

	@Override
	public int insertTender(Tender t) {
		return tenderDao.insertTender(t);
	}

	@Override
	public int updateTender(Tender t) {
		return tenderDao.updateTender(t);
	}

	@Override
	public int deleteTender(String id) {
		return tenderDao.deleteTender(Integer.parseInt(id));
	}

}
