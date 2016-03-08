package com.budgetms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.budgetms.pojo.Attachment;
import com.budgetms.pojo.Instruction;
import com.budgetms.pojo.InstructionAdjust;
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
    int insertInstDivide(InstructionDivide i);
    int updateInstDivide(InstructionDivide i);
    int deleteInstDivide(String  id);
    Object getInstDivideByPage(InstructionDivide i,int start,int limit);
    //inst adjust
    Object getInstAdjByProperty(InstructionAdjust i);
    int insertInstAdj(InstructionAdjust i);
    int updateInstAdj(InstructionAdjust i);
    int deleteInstAdj(String  id);
    Object getInstAdjByPage(InstructionAdjust i,int start,int limit);
}
