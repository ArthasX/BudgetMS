package com.budgetms.test;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Invoice;
import com.budgetms.service.IInvoService;
import com.budgetms.util.MysqlErrTranslator;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class TestInvo extends AbsTest {
	@Resource
	private IInvoService invoService = null;

	@Override
	public void test() throws Exception {
		t1();
	}

	public void t1() {
		Invoice invo = new Invoice();
		invo.setInvoId("123456");
		invo.setInvoAmt(150.00);
		invo.setInvoCompany("公司");
		invo.setContPaymentId(1);
		invo.setRemark("xxx項目xx  服務");
		try {
			invoService.insertInvo(invo);
		} catch (DataAccessException e) {
			SQLException sqle = (SQLException) e.getCause();
			int errno = sqle.getErrorCode();

			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(e.getMessage());
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(MysqlErrTranslator.getErrorInfo(errno));
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(e.getClass().getName());
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println(invo.getInvoId() + "重複！");
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out
					.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		} finally {
			List<Invoice> l = invoService.getInvoByProperty(invo);
			logger.info(JSON.toJSONString(l));
		}
	}
}
