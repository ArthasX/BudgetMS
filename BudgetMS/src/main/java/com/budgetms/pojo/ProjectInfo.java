package com.budgetms.pojo;

public class ProjectInfo extends BasePOJO{
	
	private int proInfoId;
	private double proAmt;
	private int proStatus;
	private String proId;
	private String year;
	private String remark;
	public int getProInfoId() {
		return proInfoId;
	}
	public void setProInfoId(int proInfoId) {
		this.proInfoId = proInfoId;
	}
	public double getProAmt() {
		return proAmt;
	}
	public void setProAmt(double proAmt) {
		this.proAmt = proAmt;
	}
	public int getProStatus() {
		return proStatus;
	}
	public void setProStatus(int proStatus) {
		this.proStatus = proStatus;
	}
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
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
