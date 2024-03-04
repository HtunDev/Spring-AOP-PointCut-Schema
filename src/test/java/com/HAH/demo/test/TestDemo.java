package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.demo.admin.service.AdminService;

@SpringJUnitConfig(locations = "classpath:app.xml")
public class TestDemo {
	
	@Autowired
	private AdminService adminService;
	
	@Test
	void demoTest() {
		adminService.helloMethod("Hello Learning AOP Concept");
	}

}
