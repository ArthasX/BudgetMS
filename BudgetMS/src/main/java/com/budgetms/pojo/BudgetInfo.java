package com.budgetms.pojo;

public class BudgetInfo extends BasePOJO{
	private String budgetInfoId;
	private String budgetType;
	private String budgetAmt;
	private String year;
	private String remark;
	private BudgetType bt;
	public String getBudgetInfoId() {
		return budgetInfoId;
	}
	public void setBudgetInfoId(String budgetInfoId) {
		this.budgetInfoId = budgetInfoId;
	}
	public String getBudgetType() {
		return budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}
	public String getBudgetAmt() {
		return budgetAmt;
	}
	public void setBudgetAmt(String budgetAmt) {
		this.budgetAmt = budgetAmt;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public BudgetType getBt() {
		return bt;
	}
	public void setBt(BudgetType bt) {
		this.bt = bt;
	}

	
}
