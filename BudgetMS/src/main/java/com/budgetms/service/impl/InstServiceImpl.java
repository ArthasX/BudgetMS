package com.budgetms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.budgetms.dao.IInstructionDao;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;
@Service("instService")
public class InstServiceImpl implements IInstService {
	@Resource
	private IInstructionDao instDao;

	@Override
	public Instruction getInstById(String getInstById) {
		//Instruction inst = instdao.getInstById("QSBH201602150001");
		return null;
	}

	@Override
	public int insertInst(Instruction inst) {
		return  instDao.insertInst(inst);
		
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
	public List<Instruction> getAllInst() {
		Instruction inst = new Instruction();
		//传入一个空的inst对象   根据mapping里面的配置  相当于select * from instruction ...
		return instDao.getInstByProperty(inst);
	}
	
	 
}
