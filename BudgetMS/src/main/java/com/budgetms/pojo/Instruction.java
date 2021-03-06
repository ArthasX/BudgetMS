package com.budgetms.pojo;

import java.sql.Date;

public class Instruction extends BasePOJO {
	private String instId;
	private String instTitle;
	private String instContent;
	private String instType;
	private String instStatus;
	private String applyDept;
	private String instAmt;
	private String softAmt;
	private String hardAmt;
	private String applyUser;
	private String applyUserName;
	private String optDate;
	private String optUser;
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
	public String getInstType() {
		return instType;
	}
	public void setInstType(String instType) {
		this.instType = instType;
	}
	public String getInstStatus() {
		return instStatus;
	}
	public void setInstStatus(String instStatus) {
		this.instStatus = instStatus;
	}
	public String getApplyDept() {
		return applyDept;
	}
	public void setApplyDept(String applyDept) {
		this.applyDept = applyDept;
	}
	public String getInstAmt() {
		return instAmt;
	}
	public void setInstAmt(String instAmt) {
		this.instAmt = instAmt;
	}
	public String getSoftAmt() {
		return softAmt;
	}
	public void setSoftAmt(String softAmt) {
		this.softAmt = softAmt;
	}
	public String getHardAmt() {
		return hardAmt;
	}
	public void setHardAmt(String hardAmt) {
		this.hardAmt = hardAmt;
	}
	public String getApplyUser() {
		return applyUser;
	}
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}
	public String getApplyUserName() {
		return applyUserName;
	}
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
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
