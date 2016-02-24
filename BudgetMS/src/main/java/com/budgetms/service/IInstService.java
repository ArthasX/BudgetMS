package com.budgetms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.budgetms.pojo.Instruction;

public interface IInstService {
	List<Instruction> getInstByProperty(Instruction inst);
	
	List<Instruction> getInstByMap(String start,String limit);
	List<Instruction> getAllInst();
	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	int deleteInst(String instId);
	Instruction getInstById(String getInstById);
}
