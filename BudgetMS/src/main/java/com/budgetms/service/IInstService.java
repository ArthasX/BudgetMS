package com.budgetms.service;

import com.budgetms.pojo.Instruction;

public interface IInstService {
	Instruction getInstByProperty(Instruction inst);

	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	Instruction getInstById(String getInstById);
}
