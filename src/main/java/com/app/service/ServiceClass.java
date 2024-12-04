package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.controller.ControllerClass;

@Service
public class ServiceClass {
	
	
	@Autowired
	private ControllerClass controllerClass;
	
	public void m1(){
		System.out.println("I'm from service class");
		controllerClass.m1();
	}
	
	

}
