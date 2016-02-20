package com.budgetms.pojo;

/**
 * 招标
 * 
 * @author liubin
 *
 */
public class Tender extends BasePOJO {
	private int tenderId;//招标编号
	private int instDivideId;//请示拆分编号
	private int apprId;//批复编号
	private int tenderAmt;//
	private String company;
	private String remark;
	
	public int getTenderId() {
		return tenderId;
	}
	public void setTenderId(int tenderId) {
		this.tenderId = tenderId;
	}
 
	public int getInstDivideId() {
		return instDivideId;
	}
	public void setInstDivideId(int instDivideId) {
		this.instDivideId = instDivideId;
	}
	public int getApprId() {
		return apprId;
	}
	public void setApprId(int apprId) {
		this.apprId = apprId;
	}
	public int getTenderAmt() {
		return tenderAmt;
	}
	public void setTenderAmt(int tenderAmt) {
		this.tenderAmt = tenderAmt;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
