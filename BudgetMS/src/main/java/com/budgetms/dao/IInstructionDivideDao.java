package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.InstructionDivide;

public interface IInstructionDivideDao {
	List<InstructionDivide> getInstDivideByProperty(InstructionDivide i);
	int insertInstDivide(InstructionDivide i);
	int updateInstDivide(InstructionDivide i);
	int deleteInstDivide(int id);
	int getInstDivideCount();
	List<InstructionDivide> getInstDivideByPage(InstructionDivide i,int start,int limit);
}
