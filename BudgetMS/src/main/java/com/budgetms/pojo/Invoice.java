package com.budgetms.pojo;

import java.sql.Date;

public class Invoice extends BasePOJO{
	private String invoId;
	private String contPaymentId;
	private String invoAmt;
	private String invoCompany;
	private String transDate;
	private String transfered;
	private String optDate;
	private String optUser;
	private String remark;
	public String getInvoId() {
		return invoId;
	}
	public void setInvoId(String invoId) {
		this.invoId = invoId;
	}
	public String getContPaymentId() {
		return contPaymentId;
	}
	public void setContPaymentId(String contPaymentId) {
		this.contPaymentId = contPaymentId;
	}
	public String getInvoAmt() {
		return invoAmt;
	}
	public void setInvoAmt(String invoAmt) {
		this.invoAmt = invoAmt;
	}
	public String getInvoCompany() {
		return invoCompany;
	}
	public void setInvoCompany(String invoCompany) {
		this.invoCompany = invoCompany;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransfered() {
		return transfered;
	}
	public void setTransfered(String transfered) {
		this.transfered = transfered;
	}
	public String getOptDate() {
		return optDate;
	}
	public void setOptDate(String optDate) {
		this.optDate = optDate;
	}
	public String getOptUser() {
		return optUser;
	}
	public void setOptUser(String optUser) {
		this.optUser = optUser;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
