package com.budgetms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.budgetms.pojo.Instruction;

public interface IInstructionDao {
	List<Instruction> getInstById(String instId);

	int insertInst(Instruction inst);

	int updateInst(Instruction inst);

	int deleteInst(String instId);

	List<Instruction> getInstByProperty(Instruction inst);

	List<Instruction> getInstByMap(Map paraMap);

	// List<Instruction> getInstByPage(@Param("inst") Instruction inst,
	// @Param("start") int start, @Param("limit") int limit);

	List<Instruction> getInstByPage(Instruction inst, int start, int limit);
	
	int getInstCount(Instruction inst);
}
