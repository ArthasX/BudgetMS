package com.budgetms.test;

import javax.annotation.Resource;

import com.budgetms.pojo.ProInfo;
import com.budgetms.pojo.ProInfoAdjust;
import com.budgetms.pojo.Project;
import com.budgetms.service.IProService;

public class TestPro extends AbsTest {

	@Resource
	IProService proService;

	@Override
	public void test() throws Exception {
		 t1();
		// t2();
		// t3();
	}

	public void t1() {
		Project p = new Project();
		p.setProId("PROID20161");
		p.setProName("测试pro1");
		p.setProType("项目建设");
		p.setRemark("remark123");

		proService.insertProject(p);
		Project p2 = new Project();
		p2.setProId("2");
		logger.info("*****************************");
		logger.info(proService.getProjectByProperty(p));

		Project p3 = new Project();
		p3.setProId("2");
		p3.setProName("修改pro1");

		proService.updateProject(p3);
		logger.info("*****************************");
		logger.info(proService.getProjectByProperty(p));

	}

	public void t2() {
		ProInfo pi = new ProInfo();
		pi.setProId("PROID2016");
		pi.setProAmt("100000");
		pi.setProStatus("取消");
		pi.setYear("2016");
		pi.setRemark("pi remark");
		//pi.setProInfoId("2");
		proService.insertProInfo(pi);
		logger.info("*****************************");
		logger.info(proService.getProInfoByProId("PROID2016"));
		pi.setProInfoId("2");
		pi.setProAmt("9999");
		pi.setProStatus("正常");
		pi.setYear("2017");

		proService.updateProInfo(pi);
		logger.info("*****************************");
		logger.info(proService.getProInfoByProId("PROID2016"));
	}

	public void t3() {
		ProInfoAdjust pia = new ProInfoAdjust();
		pia.setAdjAmt("123");
		pia.setAdjType("9");
		pia.setProInfoId("2");

		logger.info("*****************************");
		logger.info(proService.getProInfoAdjByProInfoId("2"));
		proService.insertProInfoAdj(pia);
		logger.info("*****************************");
		logger.info(proService.getProInfoAdjByProInfoId("2"));
		pia.setProInfoAdjId("2");
		pia.setAdjAmt("999");
		proService.updateProInfoAdj(pia);
		logger.info("*****************************");
		logger.info(proService.getProInfoAdjByProInfoId("2"));
	}
}
