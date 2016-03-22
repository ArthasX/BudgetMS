package com.budgetms.dao;

import java.util.List;

import com.budgetms.pojo.BudgetType;

public interface IBudgetTypeDao {
	List<BudgetType> getBudgetTypeByPage(BudgetType bt,int start,int limit);

	int insertBudgetType(BudgetType bt);

	int updateBudgetType(BudgetType bt);

	int deleteBudgetType(int id);

	int getBudgetTypeCount(BudgetType bt);
}
