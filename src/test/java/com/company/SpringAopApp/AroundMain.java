package com.company.SpringAopApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.SpringAopApp.services.FortuneService;

public class AroundMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AopConfigClass.class);
		FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
		String data =  fortuneService.getFortune(false);
		System.out.println("data is " + data);
		context.close();
		
	}
}
