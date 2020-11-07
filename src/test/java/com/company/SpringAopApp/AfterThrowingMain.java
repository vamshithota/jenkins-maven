package com.company.SpringAopApp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.SpringAopApp.daos.SampleAccountDao;

public class AfterThrowingMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AopConfigClass.class);
		SampleAccountDao theAccountDAO = context.getBean("sampleAccountDao", SampleAccountDao.class);
		List<Account> theAccounts = null;
		try{
			boolean flag = false;
			theAccounts = theAccountDAO.findAll(flag);
		}catch(Exception ex) {
			System.out.println("Exception caught  " + ex.getMessage());	
		}
		System.out.println("\n\nMain Program: AfterThrowingDemoApp");
		System.out.println("----");
		System.out.println(theAccounts);
		System.out.println("\n");
		context.close();
	}
	
	
}
