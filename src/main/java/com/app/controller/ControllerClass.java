package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.ServiceClass;

@RestController
public class ControllerClass {
	
	
	@Autowired
	private ServiceClass serviceClass;
	
	@GetMapping("/m1")
	public void m1(){
		System.out.println("I'm from controller class");
		serviceClass.m1();
	}
	@GetMapping("/m2")
	public void m2() {
		System.out.println("I'm from m2 in controller class");
	}

}
