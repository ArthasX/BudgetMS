package com.budgetms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.budgetms.dao.IInstructionDao;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;
@Service("instService")
public class InstServiceImpl implements IInstService {
	@Resource
	private IInstructionDao instdao;

	@Override
	public Instruction getInstById(String getInstById) {
		Instruction inst = instdao.getInstById("QSBH201602150001");
		return inst;
	}

	@Override
	public int insertInst(Instruction inst) {
		return  instdao.insertInst(inst);
		
	}

	@Override
	public int updateInst(Instruction inst) {
		return instdao.updateInst(inst);
	}

	@Override
	public Instruction getInstByProperty(Instruction inst) {
		return instdao.getInstByProperty(inst);
	}
	
	 
}
