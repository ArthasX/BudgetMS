package com.budgetms.test;

import javax.annotation.Resource;

import com.budgetms.pojo.ContPayment;
import com.budgetms.service.IContPaymentService;

public class TestContPayment extends AbsTest {
	@Resource
	private IContPaymentService c=null;
	
	@Override
	public void test() throws Exception {
		t1();
	//	t2();
		t3();
		t1();
	}
	
	public void t1(){
		String id= "HTBH201602170001";
		System.out.println(c.getContPaymentByContId(id));
	}

	public void t2(){
		ContPayment cp = new ContPayment();
		cp.setContId("HTBH201602170001");
		cp.setExpectPayDate("2016-03-01");
		cp.setIsPaid("0");
		cp.setPayAmt("150");
		cp.setPeriod("2");
		c.insertContPayment(cp);
//		
//		String id= "HTBH201602170001";
//		System.out.println(c.getContPaymentByContId(id));
	}
	
	public void t3(){
		ContPayment cp = new ContPayment();
		cp.setContPaymentId("2");
		cp.setContId("HTBH201602170001");
		cp.setPayAmt("9999999");
		cp.setPeriod("2");
		c.updateContPayment(cp);
	}
}
