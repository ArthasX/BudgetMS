package com.budgetms.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public abstract class AbsTest implements BaseTest {
	// 模拟request,response
//	@Autowired
	protected MockHttpServletRequest request;
//	@Autowired
	protected MockHttpServletResponse response;
 
	@Before
	public void setUp() {
		response = new MockHttpServletResponse();
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");

	}

	@Test
	public void doTest() throws Exception {
		test();
	};
}
