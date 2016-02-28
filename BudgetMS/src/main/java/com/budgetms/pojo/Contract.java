package com.budgetms.pojo;

import java.sql.Date;

public class Contract extends BasePOJO {
	private String contId;
	private String instDivideId;
	private String contName;
	private String contAmt;
	private String contType;
	private String signedDate;
	private String signedPerson;
	private String optDate;
	private String optUser;
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

	public String getContAmt() {
		return contAmt;
	}

	public void setContAmt(String contAmt) {
		this.contAmt = contAmt;
	}

	public String getContType() {
		return contType;
	}

	public void setContType(String contType) {
		this.contType = contType;
	}

	public String getSignedDate() {
		return signedDate;
	}

	public void setSignedDate(String signedDate) {
		this.signedDate = signedDate;
	}

	public String getSignedPerson() {
		return signedPerson;
	}

	public void setSignedPerson(String signedPerson) {
		this.signedPerson = signedPerson;
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
