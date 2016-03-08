package com.budgetms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.budgetms.dao.IInstructionAdjustDao;
import com.budgetms.dao.IInstructionDao;
import com.budgetms.dao.IInstructionDivideDao;
import com.budgetms.pojo.Attachment;
import com.budgetms.pojo.Instruction;
import com.budgetms.pojo.InstructionAdjust;
import com.budgetms.pojo.InstructionDivide;
import com.budgetms.service.IInstService;

@Service("instService")
public class InstServiceImpl implements IInstService {
	static Logger logger = Logger.getLogger(InstServiceImpl.class);
	@Resource
	private IInstructionDao instDao;
	@Resource
	private IInstructionDivideDao instDivideDao;
	@Resource
	private IInstructionAdjustDao instAdjDao;

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
	public Object getInstByPage(Instruction inst, int start, int limit) {
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

	// inst divide

	@Override
	public Object getInstDivideByProperty(InstructionDivide i) {
		List<InstructionDivide> l = instDivideDao.getInstDivideByProperty(i);
		Object o = JSON.toJSONString(l);
		logger.info(o);
		return o;
	}

	@Override
	public int insertInstDivide(InstructionDivide i) {
		logger.info(i);
		return instDivideDao.insertInstDivide(i);
		
	}

	@Override
	public int updateInstDivide(InstructionDivide i) {
		logger.info(i);
		return instDivideDao.updateInstDivide(i);
	}

	@Override
	public int deleteInstDivide(String  id) {
		logger.info("delete inst divide: "+id);
		return instDivideDao.deleteInstDivide(id);
	}

	@Override
	public Object getInstAdjByProperty(InstructionAdjust i) {
		List<InstructionAdjust> l = instAdjDao.getInstAdjByProperty(i);
		Object o = JSON.toJSONString(l);
		logger.info(o);
		return o;
	}

	@Override
	public int insertInstAdj(InstructionAdjust i) {
		logger.info(i);
		return instAdjDao.insertInstAdj(i);
	}

	@Override
	public int updateInstAdj(InstructionAdjust i) {
		logger.info(i);
		return instAdjDao.updateInstAdj(i);
	}

	@Override
	public int deleteInstAdj(String  id) {
		logger.info("delete inst adjust: "+id);
		return instAdjDao.deleteInstAdj(id);
	}

	@Override
	public Object getInstDivideByPage(InstructionDivide i, int start, int limit) {
		List<InstructionDivide> l = instDivideDao.getInstDivideByProperty(i);
		int total = instDivideDao.getInstDivideCount();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSONString(map);
		logger.info(o);
		return o;
	}

	@Override
	public Object getInstAdjByPage(InstructionAdjust i, int start, int limit) {
		List<InstructionAdjust> l = instAdjDao.getInstAdjByProperty(i);
		int total = instAdjDao.getInstAdjCount();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("record", l);
		map.put("total", total);
		Object o = JSON.toJSONString(l);
		logger.info(o);
		return o;
	}

}
