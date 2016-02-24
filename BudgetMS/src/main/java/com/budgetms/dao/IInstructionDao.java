package com.budgetms.dao;
 
import java.util.List;
import java.util.Map;

import com.budgetms.pojo.Instruction;

public interface IInstructionDao {
	List<Instruction> getInstById(String instId);
	
	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	int deleteInst(String instId);
	List<Instruction> getInstByProperty(Instruction inst);
	List<Instruction> getInstByMap(Map paraMap);
	 
}
