package com.budgetms.pojo;

import java.sql.Date;

public class Contract {
	private String contId;
	private String instDivideId;
	private String contName;
	private double contAmt;
	private int contType;
	private Date signedDate;
	private String signedPerson;
	private Date optDate;
	private int optUser;
	private String remark;
	public String getContId() {
		return contId;
	}
	public void setContId(String contId) {
		this.contId = contId;
	}
	public String getInstDivideId() {
		return instDivideId;
	}
	public void setInstDivideId(String instDivideId) {
		this.instDivideId = instDivideId;
	}
	public String getContName() {
		return contName;
	}
	public void setContName(String contName) {
		this.contName = contName;
	}
	public double getContAmt() {
		return contAmt;
	}
	public void setContAmt(double contAmt) {
		this.contAmt = contAmt;
	}
	public int getContType() {
		return contType;
	}
	public void setContType(int contType) {
		this.contType = contType;
	}
	public Date getSignedDate() {
		return signedDate;
	}
	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}
	public String getSignedPerson() {
		return signedPerson;
	}
	public void setSignedPerson(String signedPerson) {
		this.signedPerson = signedPerson;
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
