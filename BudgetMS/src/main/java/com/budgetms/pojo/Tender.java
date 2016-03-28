package com.budgetms.pojo;

/**
 * 招标
 * 
 * @author liubin
 *
 */
public class Tender extends BasePOJO {
	private String tenderId;//招标编号
	private String instDivideId;//请示拆分编号
	private String apprId;//批复编号
	private String tenderAmt;//
	private String company;
	private String remark;
	public String getTenderId() {
		return tenderId;
	}
	public void setTenderId(String tenderId) {
		this.tenderId = tenderId;
	}
	public String getInstDivideId() {
		return instDivideId;
	}
	public void setInstDivideId(String instDivideId) {
		this.instDivideId = instDivideId;
	}
	public String getApprId() {
		return apprId;
	}
	public void setApprId(String apprId) {
		this.apprId = apprId;
	}
	public String getTenderAmt() {
		return tenderAmt;
	}
	public void setTenderAmt(String tenderAmt) {
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
