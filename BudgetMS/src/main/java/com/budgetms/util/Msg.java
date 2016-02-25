package com.budgetms.util;

import com.alibaba.fastjson.JSON;
import com.budgetms.util.MysqlErrTranslator.MyError;

public class Msg{
	
	public static final JSON SUCCESS = (JSON) JSON.toJSON(new Msg("success"));
	public static final JSON FAIL = (JSON) JSON.toJSON(new Msg("fail"));
	
	private String msg;
	private String status;
	
	public Msg(MyError err){
		this.status="fail";
		this.msg=err.getErrorDesc();
	}
	public Msg(String status){
		this.msg=status;
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
	
}