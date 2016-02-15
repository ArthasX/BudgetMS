package com.budgetms.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.budgetms.pojo.Instruction;
import com.budgetms.pojo.User;
import com.budgetms.service.IInstService;
import com.budgetms.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestUser {
	private static Logger logger = Logger.getLogger(TestUser.class);
	// private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;
	@Resource
	private  IInstService instService = null;
	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	public void test() {
		User u = new User("张三3", "zhangsan3", "123456", 2, "15358824625",
				"liubin@csrcbank.com", "");
		logger.info(JSON.toJSONString(u));
		//int i = userService.addUser(new User());
		//logger.info(i);
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}

	public void testInst(){
		
		Instruction inst=new Instruction();
		inst.setInstId("QSBH201602150001");
		instService.insertInst(inst);
	}
	@Test
	public void doTest() {
		testInst();
	}
}
