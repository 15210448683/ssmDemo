package org.zsl.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.cn.user.pojo.User;
import com.cn.user.service.IUserService;
import com.cn.userDemo.pojo.UserDemo;
import com.cn.userDemo.service.UserDemoService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:mybatis.xml","classpath:spring-mvc.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	private ApplicationContext ac = null;
	@Resource
	private IUserService userService = null;
	@Resource
	private UserDemoService userDemoService;

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

	//@Test
	public void test1() {
		User user = userService.getUserById(1);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
	
	
	//@Test
	public void test2() {
		User user =new User();
		user.setUserName("1111");
		user.setPassword("123456");
		user.setAge(12);
		int rowNum = userService.getInsertBackId(user);
		 System.out.println(rowNum +",userId="+user.getId());
		// logger.info("值："+user.getUserName());
	//	logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void test3() {
		String userName = userDemoService.getUserNameById(1);
		 System.out.println(userName);
		// logger.info("值："+user.getUserName());
	//	logger.info(JSON.toJSONString(user));
	}
	
	
}
