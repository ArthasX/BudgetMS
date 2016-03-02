package com.budgetms.test;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.budgetms.controller.ContController;
import com.budgetms.pojo.Contract;
import com.budgetms.service.IContService; 

public class TestCont extends AbsTest {
	@Resource
	private IContService iContService = null;
	@Autowired
	private ContController contController = null;

	@Override
	public void test() throws Exception {
		t4();
	}

	public void t1() throws Exception {
		Contract cont = new Contract();
		cont.setContId("HTBH201602170001");
		cont.setInstDivideId("1");
		cont.setContName("测试合同");
		cont.setContAmt("150.00");
		cont.setOptDate("2016-02-17");
		cont.setOptUser("1");
		cont.setContType("1");
		cont.setSignedDate("2016-01-01");
		cont.setSignedPerson("张三");

		// iContService.insertCont(cont);

		List<Contract> l = iContService.getContByProperty(cont);
		logger.info(JSON.toJSONString(l));
	}

	public void t2() {
		try {
			request.setParameter("start", "0");
			request.setParameter("limit", "2");
			request.setParameter("obj", "{'contId':'HTBH'}");
			Object obj = contController.findInstByProperty(request);
			System.out.print(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void t3() {
		try {
			request.setParameter("start", "0");
			request.setParameter("limit", "2");
			request.setParameter("obj",
					"{'contId':'HTBH201602170001','contAmt':'22'}");
			Object obj = contController.updateCont(request);
			System.out.print(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void t4() {
		Contract cont = new Contract();

		cont.setContId("HTBH20160217121355");
		cont.setInstDivideId("1");
		cont.setContName("测试合同");
		cont.setContAmt("1501.00");
		cont.setOptDate("2016-02-17");
		// cont.setOptUser("1");
		cont.setContType("1");
		cont.setSignedDate("2016-01-01");
		cont.setSignedPerson("张三");
		String c = "{'contId':'HTBH20160229202637','contName':'1','instDivideId':'1','contType':'1','contCompany':'1','contAmt':'1','signedDate':'2016-12-13','signedPerson':'1','remark':'1'}";
		Contract c1=(Contract)JSON.toJavaObject(JSON.parseObject(c), Contract.class);
		String s = JSON.toJSONString(cont);
		request.setParameter("obj", s);
		iContService.updateCont(c1);
		//Object obj = contController.insertCont(request);
		// iContService.insertCont(cont);
	}
}
