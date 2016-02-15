package com.budgetms.pojo;

import java.sql.Date;

public class Instruction {
	private String instId;
	private String instTitle;
	private String instContent;
	private int instType;
	private int applyDept;
	private double instAmt;
	private double softAmt;
	private double hardAmt;
	private int applyUser;
	private String applyUserName;
	private Date optDate;
	private int optUser;
	private String remark;
	public String getInstId() {
		return instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstTitle() {
		return instTitle;
	}
	public void setInstTitle(String instTitle) {
		this.instTitle = instTitle;
	}
	public String getInstContent() {
		return instContent;
	}
	public void setInstContent(String instContent) {
		this.instContent = instContent;
	}
	public int getInstType() {
		return instType;
	}
	public void setInstType(int instType) {
		this.instType = instType;
	}
	public int getApplyDept() {
		return applyDept;
	}
	public void setApplyDept(int applyDept) {
		this.applyDept = applyDept;
	}
	public double getInstAmt() {
		return instAmt;
	}
	public void setInstAmt(double instAmt) {
		this.instAmt = instAmt;
	}
	public double getSoftAmt() {
		return softAmt;
	}
	public void setSoftAmt(double softAmt) {
		this.softAmt = softAmt;
	}
	public double getHardAmt() {
		return hardAmt;
	}
	public void setHardAmt(double hardAmt) {
		this.hardAmt = hardAmt;
	}
	public int getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(int applyUser) {
		this.applyUser = applyUser;
	}
	public String getApplyUserName() {
		return applyUserName;
	}
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
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
