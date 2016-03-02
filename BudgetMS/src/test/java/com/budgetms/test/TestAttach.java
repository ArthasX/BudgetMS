package com.budgetms.test;

import javax.annotation.Resource;

import com.budgetms.pojo.Attachment;
import com.budgetms.service.IAttachService;

public class TestAttach extends AbsTest implements BaseTest {

	@Resource
	private IAttachService attachService=null;
	@Override
	public void test() throws Exception {
		t2();
	}

	public void t1(){
		String recordId="QSBH201602150001";
		String type="inst";
		logger.info(attachService.getAttachByIdType(recordId, type));
		Attachment attach=new  Attachment();
		logger.info(attachService.getAttachByProperty(attach));
	}
	public void t2(){
		Attachment a = new Attachment();
		a.setAttachName("123");
		a.setAttachType("inst");
		attachService.insertAttach(a);
	}
}
