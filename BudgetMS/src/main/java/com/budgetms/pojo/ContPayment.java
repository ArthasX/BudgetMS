package com.budgetms.pojo;

import java.sql.Date;

public class ContPayment extends BasePOJO{
	private int contPaymentId;
	private int period;
	private String contId;
	private double payAmt;
	private Date expectPayDate;
	private int isPaid;
	private String remark;
	public int getContPaymentId() {
		return contPaymentId;
	}
	public void setContPaymentId(int contPaymentId) {
		this.contPaymentId = contPaymentId;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getContId() {
		return contId;
	}
	public void setContId(String contId) {
		this.contId = contId;
	}
	public double getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(double payAmt) {
		this.payAmt = payAmt;
	}
	public Date getExpectPayDate() {
		return expectPayDate;
	}
	public void setExpectPayDate(Date expectPayDate) {
		this.expectPayDate = expectPayDate;
	}
	public int getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(int isPaid) {
		this.isPaid = isPaid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
