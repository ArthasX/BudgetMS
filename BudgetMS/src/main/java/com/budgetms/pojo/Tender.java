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
	
	private String tenderName;//招标项目名称
	private String type;//招标类型
	private String startDate;//招标开始日期
	private String endDate;//招标结束日期
	private String openDate;//开标日期
	private String negoDate;//谈判日期
	private String approvalDate;//评审上会日期
	private String finalDate;//定标（批准）日期
	private String status;//状态  招标阶段 开标阶段 谈判阶段 上会阶段 结束阶段
	
	
	
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
	public String getTenderName() {
		return tenderName;
	}
	public void setTenderName(String tenderName) {
		this.tenderName = tenderName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	public String getNegoDate() {
		return negoDate;
	}
	public void setNegoDate(String negoDate) {
		this.negoDate = negoDate;
	}
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	 
}
