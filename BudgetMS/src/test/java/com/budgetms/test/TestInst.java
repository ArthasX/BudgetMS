package com.budgetms.test;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestInst extends AbsTest {

	static class SetterExclusionStrategy implements ExclusionStrategy {

		@Override
		public boolean shouldSkipField(FieldAttributes f) {
			return false;

		}

		@Override
		public boolean shouldSkipClass(Class<?> clazz) {
			return false;
		}
	}

	@Resource
	private IInstService instService = null;

	@Override
	public void test() {
		t2();
	}

	public void t() {
		// TODO Auto-generated method stub
		Instruction inst = new Instruction();
		inst.setInstId("QSBH201602150097");
		inst.setInstTitle("测试");
		inst.setInstContent("123");
		inst.setInstStatus("在途");
		inst.setSoftAmt("123");
		inst.setInstType("1");
		inst.setInstAmt("15.55");
		inst.setApplyDept("1");
		inst.setOptDate("2016-02-15");
		inst.setOptUser("1");
		instService.insertInst(inst);
	}

	public void t1() {
		Instruction inst = new Instruction();
		inst.setInstTitle("测试");
		List<Instruction> l = instService.getInstByProperty(inst);

		logger.info(JSON.toJSONString(l));
		JSON json = (JSON) JSON.toJSON(l.get(0));
		Instruction i = JSON.toJavaObject(json, Instruction.class);
		logger.info(JSON.toJSONString(l.get(0)));
		logger.info(i.toString());

	}

	public void t2() {
		// List<Instruction> l = instService.getInstByMap("0","25");
		String json = "{'instId':null,'instAmt':'0'}";
		String json1 = "{'instType':'1','instAmt':'123'}";
		Gson g = new Gson();
		Gson g1 = new GsonBuilder().serializeNulls().create();
		Instruction inst = g.fromJson(json, Instruction.class);
		Instruction inst1 = g1.fromJson(json1, Instruction.class);	//	
		 
		JSON.toJavaObject(JSON.parseObject(json),Instruction.class);
		logger.info(instService.getInstByProperty(inst1));
		//logger.info(JSON.toJSONString(inst1));
	}

}