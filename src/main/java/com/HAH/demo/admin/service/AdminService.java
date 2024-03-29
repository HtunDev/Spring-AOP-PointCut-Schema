package com.HAH.demo.admin.service;

import org.springframework.stereotype.Service;

import com.HAH.demo.BeforeLoger;
import com.HAH.demo.Data;
import com.HAH.demo.HelloEnable;

@BeforeLoger
@Service
public class AdminService implements HelloEnable {

	
	@Override
	public void helloMethod(String message) {
		System.out.println("Message from admin service is %s.".formatted(message));

	}

	public void saveData(Data data) {
		System.out.println();
	}
}
