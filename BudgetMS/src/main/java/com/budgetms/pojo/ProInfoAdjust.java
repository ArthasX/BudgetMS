package com.budgetms.pojo;

public class ProInfoAdjust extends BasePOJO{
	private String proInfoAdjId;
	private String adjType;
	private String adjAmt;
	private String remark;
	private String proInfoId;
	
	public String getProInfoId() {
		return proInfoId;
	}
	public void setProInfoId(String proInfoId) {
		this.proInfoId = proInfoId;
	}
	public String getProInfoAdjId() {
		return proInfoAdjId;
	}
	public void setProInfoAdjId(String proInfoAdjId) {
		this.proInfoAdjId = proInfoAdjId;
	}
	public String getAdjType() {
		return adjType;
	}
	public void setAdjType(String adjType) {
		this.adjType = adjType;
	}
	public String getAdjAmt() {
		return adjAmt;
	}
	public void setAdjAmt(String adjAmt) {
		this.adjAmt = adjAmt;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
 
	

}
