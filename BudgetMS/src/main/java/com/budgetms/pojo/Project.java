package com.budgetms.pojo;

public class Project extends BasePOJO{
	private String proId;
	private String proName;
	private String proType;
	private String budgetInfoId;
	private String remark;
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	 
	public String getBudgetInfoId() {
		return budgetInfoId;
	}
	public void setBudgetInfoId(String budgetInfoId) {
		this.budgetInfoId = budgetInfoId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	 
}
