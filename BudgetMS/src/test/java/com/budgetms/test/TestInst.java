package com.budgetms.test;

import java.sql.Date;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Instruction;
import com.budgetms.service.IInstService;

public class TestInst extends AbsTest {
	@Resource
	private IInstService instService = null;

	@Override
	public void test() {
		t1();
	}

	public void t() {
		// TODO Auto-generated method stub
		Instruction inst = new Instruction();
		inst.setInstId("QSBH201602150001");
		inst.setInstTitle("测试");
		inst.setInstContent("123");
		inst.setInstType(1);
		inst.setInstAmt(15.55);
		inst.setApplyDept(1);
		inst.setOptDate(Date.valueOf("2016-02-15"));
		inst.setOptUser(1);
		instService.insertInst(inst);
	}

	public void t1() {
		Instruction inst = new Instruction();
		inst.setInstId("QSBH201602150001");
		Instruction i = instService.getInstByProperty(inst);
		logger.info(JSON.toJSONString(i));
	}

}
