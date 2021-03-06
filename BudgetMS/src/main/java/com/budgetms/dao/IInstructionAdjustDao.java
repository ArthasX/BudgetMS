package com.budgetms.dao;

import java.util.List;
import com.budgetms.pojo.InstructionAdjust;
public interface IInstructionAdjustDao {
	List<InstructionAdjust> getInstAdjByProperty(InstructionAdjust i);
	int insertInstAdj(InstructionAdjust i);
	int updateInstAdj(InstructionAdjust i);
	int deleteInstAdj(int id);
	int getInstAdjCount();
	List<InstructionAdjust> getInstAdjByPage(InstructionAdjust i,int start,int limit);
}
