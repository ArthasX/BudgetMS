package com.budgetms.pojo;

public class ProInfoAdjust extends BasePOJO{
	private int proInfoAdjId;
	private int adjType;
	private double adjAmt;
	private String remark;

	public int getProInfoAdjId() {
		return proInfoAdjId;
	}

	public void setProInfoAdjId(int proInfoAdjId) {
		this.proInfoAdjId = proInfoAdjId;
	}

	public int getAdjType() {
		return adjType;
	}

	public void setAdjType(int adjType) {
		this.adjType = adjType;
	}

	public double getAdjAmt() {
		return adjAmt;
	}

	public void setAdjAmt(double adjAmt) {
		this.adjAmt = adjAmt;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
