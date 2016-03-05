package com.budgetms.pojo;

import java.sql.Date;

public class ContPayment extends BasePOJO{
	private String contPaymentId;
	private String period;
	private String contId;
	private String payAmt;
	private String expectPayDate;
	private String isPaid;
	private String remark;
	public String getContPaymentId() {
		return contPaymentId;
	}
	public void setContPaymentId(String contPaymentId) {
		this.contPaymentId = contPaymentId;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getContId() {
		return contId;
	}
	public void setContId(String contId) {
		this.contId = contId;
	}
	public String getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	public String getExpectPayDate() {
		return expectPayDate;
	}
	public void setExpectPayDate(String expectPayDate) {
		this.expectPayDate = expectPayDate;
	}
	public String getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(String isPaid) {
		this.isPaid = isPaid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	 
	
}
