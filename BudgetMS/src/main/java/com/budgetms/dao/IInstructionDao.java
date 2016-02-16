package com.budgetms.dao;

import java.util.HashMap;
import java.util.List;

import com.budgetms.pojo.Instruction;

public interface IInstructionDao {
	List<Instruction> getInstById(String instId);

	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	List<Instruction> getInstByProperty(Instruction inst);
}
