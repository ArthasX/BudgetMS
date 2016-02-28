package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IInstructionDao;
import com.budgetms.pojo.Attachment;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;

@Service("instService")
public class InstServiceImpl implements IInstService {
	static Logger logger = Logger.getLogger(InstServiceImpl.class);
	@Resource
	private IInstructionDao instDao;
 

	@Override
	public int insertInst(Instruction inst) {
		return instDao.insertInst(inst);

	}

	@Override
	public int updateInst(Instruction inst) {
		return instDao.updateInst(inst);
	}

	@Override
	public List<Instruction> getInstByProperty(Instruction inst) {
		return instDao.getInstByProperty(inst);
	}

	@Override
	public int deleteInst(String instId) {
		return instDao.deleteInst(instId);
	}

	@Override
	public  Object getInstByPage(Instruction inst,int start, int limit) {
		List<Instruction> l = instDao.getInstByPage(inst, start, limit);
		int total = instDao.getInstCount(inst);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		logger.info("json:" + JSON.toJSONString(map));
		return JSON.toJSON(map);
	}

	@Override
	public int getInstCount(Instruction inst) {
		return instDao.getInstCount(inst);
	}

	@Override
	public List<Attachment> getAttachById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
