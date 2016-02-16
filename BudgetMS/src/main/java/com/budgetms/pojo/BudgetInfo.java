package com.budgetms.pojo;

public class BudgetInfo extends BasePOJO{
	private int budgetInfoId;
	private String budgetType;
	private double budgetAmt;
	private String year;
	private String remark;
	public int getBudgetInfoId() {
		return budgetInfoId;
	}
	public void setBudgetInfoId(int budgetInfoId) {
		this.budgetInfoId = budgetInfoId;
	}
	public String getBudgetType() {
		return budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}
	public double getBudgetAmt() {
		return budgetAmt;
	}
	public void setBudgetAmt(double budgetAmt) {
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
	
}
