package com.budgetms.service;

import com.budgetms.pojo.BudgetInfo;
import com.budgetms.pojo.BudgetType;

public interface IBudgetService {
	//budget type
	Object getBudgetTypeById(String id);

	int insertBudgetType(BudgetType c);

	int updateBudgetType(BudgetType c);

	int deleteBudgetType(String id);

	Object getBudgetTypeByPage(BudgetType c, int start, int limit);
	
	//budget info 
	
	Object getBudgetInfoById(String id);

	int insertBudgetInfo(BudgetInfo c);

	int updateBudgetInfo(BudgetInfo c);

	int deleteBudgetInfo(String id);

	Object getBudgetInfoByPage(BudgetInfo c, int start, int limit);
}

