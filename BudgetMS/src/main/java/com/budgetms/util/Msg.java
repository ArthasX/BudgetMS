package com.budgetms.util;

import com.alibaba.fastjson.JSON;
import com.budgetms.util.MysqlErrTranslator.MyError;

public class Msg {

	public static final JSON SUCCESS = new Msg("success","成功").toJSON();
	// public static final JSON FAIL = new Msg("fail").toJSON();

	private String msg;
	private String status;

	public Msg(MyError err) {
		this.status = "fail";
		this.msg = err.getErrorDesc();
	}

	public Msg(String status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JSON toJSON() {
		return (JSON) JSON.toJSON(this);
	}
}