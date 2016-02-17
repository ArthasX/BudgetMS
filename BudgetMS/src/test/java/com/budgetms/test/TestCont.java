package com.budgetms.test;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IContService;

public class TestCont extends AbsTest {
	@Resource
	private IContService iContService=null;
	@Override
	public void test() throws Exception{
		t1();
	}
	
	public void t1() throws Exception{
		Contract cont = new Contract();
		cont.setContId("HTBH201602170001");
		cont.setInstDivideId(1);
		cont.setContName("测试合同");
		cont.setContAmt(150.00);
		cont.setOptDate(Date.valueOf("2016-02-17"));
		cont.setOptUser(1);
		cont.setContType(1);
		cont.setSignedDate(Date.valueOf("2016-01-01"));
		cont.setSignedPerson("张三");
		 
		//iContService.insertCont(cont);
		 
		 
		List<Contract> l = iContService.getContByProperty(cont);
		logger.info(JSON.toJSONString(l));
	}

}
