package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IBudgetInfoDao;
import com.budgetms.dao.IBudgetTypeDao;
import com.budgetms.pojo.BudgetInfo;
import com.budgetms.pojo.BudgetType;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IBudgetService;

@Service("budgetService")
public class BudgetServiceImpl implements IBudgetService {
	static Logger logger = Logger.getLogger(BudgetServiceImpl.class);
	@Resource
	private IBudgetInfoDao budgetInfoDao;
	@Resource
	private IBudgetTypeDao budgetTypeDao;

	@Override
	public Object getBudgetTypeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBudgetType(BudgetType bt) {
		logger.info("insert budget type:" + bt);
		return budgetTypeDao.insertBudgetType(bt);
	}

	@Override
	public int updateBudgetType(BudgetType bt) {
		logger.info("update budget type:" + bt);
		return budgetTypeDao.updateBudgetType(bt);
	}

	@Override
	public int deleteBudgetType(String id) {
		return budgetTypeDao.deleteBudgetType(id);
	}

	@Override
	public Object getBudgetTypeByPage(BudgetType bt, int start, int limit) {
		List<BudgetType> l = budgetTypeDao
				.getBudgetTypeByPage(bt, start, limit);
		int total = budgetTypeDao.getBudgetTypeCount(bt);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSON(map);
		logger.info(o);
		return o;
	}

	@Override
	public Object getBudgetInfoById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBudgetInfo(BudgetInfo bi) {
		logger.info("insert budget info:" + bi);
		return budgetInfoDao.insertBudgetInfo(bi);
	}

	@Override
	public int updateBudgetInfo(BudgetInfo bi) {
		logger.info("update budget info:" + bi);
		return budgetInfoDao.updateBudgetInfo(bi);
	}

	@Override
	public int deleteBudgetInfo(String id) {
		return budgetInfoDao.deleteBudgetInfo(id);
	}

	@Override
	public Object getBudgetInfoByPage(BudgetInfo bi, int start, int limit) {
		List<BudgetInfo> l = budgetInfoDao
				.getBudgetInfoByPage(bi, start, limit);
		int total = budgetInfoDao.getBudgetInfoCount(bi);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSON(map);
		logger.info(o);
		return o;
	}

}
