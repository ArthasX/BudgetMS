package com.budgetms.pojo;

public class ContAdjust extends BasePOJO {
	private String contAdjId;
	private String contPaymentId;
	private String adjType; //付款时间调整，付款金额调整
	private String remark;//说明
	private String adjDate;//合同付款日期调整    两者只能选一 
	private String adjAmt;//合同付款金额调整  两者只能选一
	
	public String getContAdjId() {
		return contAdjId;
	}
	public void setContAdjId(String contAdjId) {
		this.contAdjId = contAdjId;
	}
	public String getContPaymentId() {
		return contPaymentId;
	}
	public void setContPaymentId(String contPaymentId) {
		this.contPaymentId = contPaymentId;
	}
	public String getAdjType() {
		return adjType;
	}
	public void setAdjType(String adjType) {
		this.adjType = adjType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAdjDate() {
		return adjDate;
	}
	public void setAdjDate(String adjDate) {
		this.adjDate = adjDate;
	}
	public String getAdjAmt() {
		return adjAmt;
	}
	public void setAdjAmt(String adjAmt) {
		this.adjAmt = adjAmt;
	}
	
	// remark = 调整 付款    adjType==时间? 时间  adjDate :金额 adjAmt
	
}
