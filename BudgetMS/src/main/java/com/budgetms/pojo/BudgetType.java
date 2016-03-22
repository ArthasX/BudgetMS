package com.budgetms.pojo;

public class BudgetType extends BasePOJO{
	private String budgetTypeId;
	private String budgetName;
	private String budgetType;
	private String remark;
 
	public String getBudgetTypeId() {
		return budgetTypeId;
	}
	public void setBudgetTypeId(String budgetTypeId) {
		this.budgetTypeId = budgetTypeId;
	}
	public String getBudgetName() {
		return budgetName;
	}
	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}
	public String getBudgetType() {
		return budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
