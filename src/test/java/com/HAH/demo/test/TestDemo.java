package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.demo.admin.service.AdminService;
import com.HAH.demo.member.service.MemberService;

@SpringJUnitConfig(locations = "classpath:app.xml")
public class TestDemo {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private MemberService memberService;
	
	@Test
	void demoTest() {
//		adminService.helloMethod("Hello Learning AOP Concept");
		memberService.memberMethods("Htun Aung Hlaing", 23);
	}

}
