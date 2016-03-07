package com.budgetms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.budgetms.pojo.Attachment;
import com.budgetms.pojo.Instruction;
import com.budgetms.pojo.InstructionDivide;

public interface IInstService {
	List<Instruction> getInstByProperty(Instruction inst);

	Object getInstByPage(Instruction inst, int start, int limit);

	int getInstCount(Instruction inst);

	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	int deleteInst(String instId);
 
    List<Attachment> getAttachById(String id);
    
    
    //inst divide
    Object getInstDivideByProperty(InstructionDivide i);
    
    //inst adjust
    
}
