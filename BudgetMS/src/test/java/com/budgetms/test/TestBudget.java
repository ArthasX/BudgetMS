package com.budgetms.test;

import javax.annotation.Resource;

import com.budgetms.pojo.BudgetInfo;
import com.budgetms.pojo.BudgetType;
import com.budgetms.service.IBudgetService;

public class TestBudget extends AbsTest {
	@Resource
	private IBudgetService budgetService;

	@Override
	public void test() throws Exception {
		t2();
	}

	public void t1() {
		BudgetInfo bi = new BudgetInfo();

		System.out.println("*********************************");
		System.out.println(budgetService.getBudgetInfoByPage(bi, 0, 25));

		bi.setBudgetType("C22");
		bi.setBudgetAmt("222");
		bi.setYear("2017");
		bi.setRemark("123123");
		// insert
		budgetService.insertBudgetInfo(bi);
		System.out.println("*********************************");
		System.out.println(budgetService.getBudgetInfoByPage(bi, 0, 25));
		// update
		bi.setBudgetInfoId("1");
		budgetService.updateBudgetInfo(bi);
		System.out.println("*********************************");
		System.out.println(budgetService.getBudgetInfoByPage(bi, 0, 25));
	}

	public void t2() {
		BudgetType bt = new BudgetType();
		System.out.println(budgetService.getBudgetTypeByPage(bt, 0, 25));
		System.out.println("*********************************");
		bt.setBudgetName("XXXX");
		bt.setBudgetType("C33");
		bt.setRemark("qqqqqqqqq");
		// insert
		budgetService.insertBudgetType(bt);
		System.out.println("*********************************");
		System.out.println(budgetService.getBudgetTypeByPage(bt, 0, 25));
		// update
		bt.setBudgetTypeId("1");
		budgetService.updateBudgetType(bt);
		System.out.println("*********************************");
		System.out.println(budgetService.getBudgetTypeByPage(bt, 0, 25));

	}

}
