package com.budgetms.pojo;

import java.sql.Date;

public class Invoice extends BasePOJO{
	private String invoId;
	private int contPaymentId;
	private double invoAmt;
	private String invoCompany;
	private Date transDate;
	private int transfered;
	private Date optDate;
	private int optUser;
	private String remark;
	
	
	public String getInvoId() {
		return invoId;
	}
	public void setInvoId(String invoId) {
		this.invoId = invoId;
	}
	public int getContPaymentId() {
		return contPaymentId;
	}
	public void setContPaymentId(int contPaymentId) {
		this.contPaymentId = contPaymentId;
	}
	public double getInvoAmt() {
		return invoAmt;
	}
	public void setInvoAmt(double invoAmt) {
		this.invoAmt = invoAmt;
	}
	public String getInvoCompany() {
		return invoCompany;
	}
	public void setInvoCompany(String invoCompany) {
		this.invoCompany = invoCompany;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
 
	public int getTransfered() {
		return transfered;
	}
	public void setTransfered(int transfered) {
		this.transfered = transfered;
	}
	public Date getOptDate() {
		return optDate;
	}
	public void setOptDate(Date optDate) {
		this.optDate = optDate;
	}
	public int getOptUser() {
		return optUser;
	}
	public void setOptUser(int optUser) {
		this.optUser = optUser;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
