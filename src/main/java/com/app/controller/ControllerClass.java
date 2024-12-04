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
	 * CircularReferenceException *
	 
   This exception occurs when two or more beans depend on each other in a circular fashion, and Spring cannot resolve the circular dependency.
   - **Cause**: Circular dependency between beans that cannot be resolved either through constructor injection or by Spring's automatic resolution mechanisms.
   - **Example**:
     java org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'myBean' defined in class path resource [applicationContext.xml]: Circular reference detected
     
     */
	
	
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
