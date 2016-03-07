package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.InstructionDivide;

public interface IInstructionDivideDao {
	List<InstructionDivide> getInstAdjByInstId(String instId);
	int InstAdj(InstructionDivide i);
	int updateInstAdj(InstructionDivide i);
	int deleteInstAdj(String instAdjId);
}
