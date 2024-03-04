package com.HAH.demo.member.service;

import org.springframework.stereotype.Service;

@Service
public class MemberService{

	public void memberMethods(String name,Integer age){
		System.out.println("This message from Member Service");
	}

}
