package com.budgetms.util;

import com.alibaba.fastjson.JSON;
import com.budgetms.util.MysqlErrTranslator.MyError;

public class Msg {

	public static final JSON SUCCESS = new Msg(true,"成功").toJSON();
	public static final JSON UPLOAD_FAIL= new Msg(false,"上传文件失败").toJSON();
	public static final JSON DELETEFILE_FAIL= new Msg(false,"删除文件失败").toJSON();
	public static final JSON NO_CONTPAYMENT_ID = new Msg(false,"没有对应的合同付款编号").toJSON();
	public static final JSON NO_PROINFO_ID = new Msg(false,"没有对应的项目信息编号").toJSON();
	public static final JSON NO_INSTDIVIDE_ID = new Msg(false,"没有对应的请示拆分编号").toJSON();
	
	private String errormsg;
	private String msg;
	private boolean success;

	public Msg(MyError err) {
		this.success = false;
		this.msg = err.getErrorDesc();
	}

	public Msg(boolean status, String msg,String errormsg) {
		this.success = status;
		this.msg = msg;
		this.errormsg=errormsg;
	}
	public Msg(boolean status, String msg) {
		this.success = status;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	 
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public JSON toJSON() {
		return (JSON) JSON.toJSON(this);
	}
}