package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
//		customerDal.add();
//		context.close();
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();
		context.close();
	}
}
