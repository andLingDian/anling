package com.emp.service.impl;

import static org.junit.Assert.fail;

import java.util.Set;

import javax.annotation.Resource;
import javax.swing.Spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.emp.service.UserService;

 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration({"classpath:applicationContext.xml"})
public class UserServiceImpTest {
   //注入业务层对象	 
   @Resource
   private UserService userService;
	
	@Test
	public void testQueryUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuerRoles() {
		Set<String>roles=userService.querRoles("ls");
		System.out.println(roles);
	}

	@Test
	public void testQueryPermissions() {
		fail("Not yet implemented");
	}

}
