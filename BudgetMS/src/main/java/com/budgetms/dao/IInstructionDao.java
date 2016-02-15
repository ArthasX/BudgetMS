package com.budgetms.dao;

import com.budgetms.pojo.Instruction;

public interface IInstructionDao {
	 Instruction getInstById(String instId);
	 int insertInst(Instruction inst);
	 int updateInst(Instruction inst);
	 Instruction getInstByProperty(Instruction inst);
}
