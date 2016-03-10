package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.BudgetInfo;

public interface IBudgetInfoDao {
	List<BudgetInfo> getBudgetInfoByPage(BudgetInfo bi,int start,int limit);

	int insertBudgetInfo(BudgetInfo bi);

	int updateBudgetInfo(BudgetInfo bi);

	int deleteBudgetInfo(String id);

	int getBudgetInfoCount(BudgetInfo bi);
}
