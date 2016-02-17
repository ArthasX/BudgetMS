package com.budgetms.service;

import java.util.HashMap;
import java.util.List;

import com.budgetms.pojo.Instruction;

public interface IInstService {
	List<Instruction> getInstByProperty(Instruction inst);
	
 
	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	int deleteInst(String instId);
	Instruction getInstById(String getInstById);
}
