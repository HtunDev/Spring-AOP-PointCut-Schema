package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.HAH.demo.Data;
import com.HAH.demo.HelloEnable;
import com.HAH.demo.member.service.MemberService;

@SpringJUnitConfig(locations = "classpath:app.xml")
public class TestDemo {
	
	@Autowired
	private HelloEnable helloEnable;
	
	@Autowired
	private MemberService memberService;
	
	@Test
	void demoTest() {
//		memberService.memberMethods("Htun Aung Hlaing", 23);
		helloEnable.helloMethod("Hello Learning AOP Concept");
		helloEnable.saveData(new Data(18));
	}

}
