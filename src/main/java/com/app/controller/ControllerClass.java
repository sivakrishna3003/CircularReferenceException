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
	/**
	***************************
	APPLICATION FAILED TO START
	***************************

	Description:

	The dependencies of some of the beans in the application context form a cycle:

	┌─────┐
	|  controllerClass (field private com.app.service.ServiceClass com.app.controller.ControllerClass.serviceClass)
	↑     ↓
	|  serviceClass (field private com.app.controller.ControllerClass com.app.service.ServiceClass.controllerClass)
	└─────┘


	Action:

	Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.

*/
}
