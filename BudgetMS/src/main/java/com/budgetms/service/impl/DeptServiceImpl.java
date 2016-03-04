package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IDeptDao;
import com.budgetms.pojo.Dept;
import com.budgetms.service.IDeptService;
@Service("deptService")
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDao deptDao=null;
	@Override
	public Object getAllDept() {
		List<Dept> l = deptDao.getAllDept();
		return JSON.toJSON(l);
	}

}
