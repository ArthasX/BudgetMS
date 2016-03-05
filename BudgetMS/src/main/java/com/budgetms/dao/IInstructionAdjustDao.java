package com.budgetms.dao;

import java.util.List;
import com.budgetms.pojo.InstructionAdjust;
public interface IInstructionAdjustDao {
	List<InstructionAdjust> getInstAdjByInstId(String instId);
	int InstAdj(InstructionAdjust i);
	int updateInstAdj(InstructionAdjust i);
	int deleteInstAdj(String instAdjId);
	
	
}
