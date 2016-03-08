package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IProInfoAdjustDao;
import com.budgetms.dao.IProInfoDao;
import com.budgetms.dao.IProjectDao;
import com.budgetms.pojo.ProInfo;
import com.budgetms.pojo.ProInfoAdjust;
import com.budgetms.pojo.Project;
import com.budgetms.service.IProService;

@Service("proService")
public class ProServiceImpl implements IProService {
	static Logger logger = Logger.getLogger(ProServiceImpl.class);
	@Resource
	private IProjectDao proDao;
	@Resource
	private IProInfoDao proInfoDao;
	@Resource
	private IProInfoAdjustDao proInfoAdjDao;

	@Override
	public Object getProjectByProperty(Project p) {
		List<Project> l = proDao.getProjectByProperty(p);
		Object o = JSON.toJSON(l);
		logger.info(o);
		return o;
	}

	@Override
	public int insertProject(Project p) {
		return proDao.insertProject(p);
	}

	@Override
	public int updateProject(Project p) {
		return proDao.updateProject(p);
	}

	@Override
	public int deleteProject(String id) {
		return proDao.deleteProject(id);
	}

	
	
	//PRO INFO
	@Override
	public Object getProInfoByProId(String id) {
		List<ProInfo>l = proInfoDao.getProInfoByProId(id);
		Object o = JSON.toJSON(l);
		logger.info(o);
		return o;
	}

	@Override
	public int insertProInfo(ProInfo pi) {
		return proInfoDao.insertProInfo(pi);
	}

	@Override
	public int updateProInfo(ProInfo pi) {
		return proInfoDao.updateProInfo(pi);
	}

	@Override
	public int deleteProInfo(String id) {
		return proInfoDao.deleteProInfo(id);
	}

	
	//PRO INFO ADJ
	@Override
	public Object getProInfoAdjByProInfoId(String id) {
		List<ProInfoAdjust> l = proInfoAdjDao.getProInfoAdjByProInfoId(id);
		Object o = JSON.toJSON(l);
		logger.info(o);
		return o;
	}

	@Override
	public int insertProInfoAdj(ProInfoAdjust pia) {
		return proInfoAdjDao.insertProInfoAdj(pia);
	}

	@Override
	public int updateProInfoAdj(ProInfoAdjust pia) {
		return proInfoAdjDao.updateProInfoAdj(pia);
	}

	@Override
	public int deleteProInfoAdj(String id) {
		return proInfoAdjDao.deleteProInfoAdj(id);
	}

	@Override
	public Object getProjectByPage(Project p, int start, int limit) {
		List<Project> l = proDao.getProjectByPage(p,start,limit);
		int total = proDao.getProjectCount(p);
		Map<String , Object> m = new HashMap<String, Object>();
		m.put("record", l);
		m.put("total",total);
		Object o = JSON.toJSON(m);
		logger.info(o);
		return o;
	}

	@Override
	public Object getProInfoByPage(ProInfo pi, int start, int limit) {
		List<ProInfo> l = proInfoDao.getProInfoByPage(pi, start, limit);
		int total = proInfoDao.getProInfoCount(pi);
		Map<String , Object> m = new HashMap<String, Object>();
		m.put("record", l);
		m.put("total",total);
		Object o = JSON.toJSON(m);
		logger.info(o);
		return o;
	}

	@Override
	public Object getProInfoAdjByPage(ProInfoAdjust pia, int start, int limit) {
		List<ProInfoAdjust> l = proInfoAdjDao.getProInfoAdjByPage(pia, start, limit);
		int total = proInfoAdjDao.getProInfoAdjCount(pia);
		Map<String , Object> m = new HashMap<String, Object>();
		m.put("record", l);
		m.put("total",total);
		Object o = JSON.toJSON(m);
		logger.info(o);
		return o;
	}

}
