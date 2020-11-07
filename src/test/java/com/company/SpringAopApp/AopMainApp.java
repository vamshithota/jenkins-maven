package com.company.SpringAopApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.company.SpringAopApp.daos.SampleAccountDao;
import com.company.SpringAopApp.daos.SampleMemberDao;

public class AopMainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AopConfigClass.class);
		
		SampleAccountDao accountdao = context.getBean("sampleAccountDao", SampleAccountDao.class);
		//accountdao.addAcount(new Account());
		
		SampleMemberDao memdao = context.getBean("sampleMemberDao",SampleMemberDao.class);
		memdao.addMember();
		memdao.doWork();
		Account myAccount = new Account();
		myAccount.setLevel("1");
		myAccount.setName("Vamshi");
		//calling setter methods on sample account dao
		accountdao.setName("vam");
		accountdao.setServiceCode("1");
		
		accountdao.addAcount(myAccount, true);
		
		//calling getter methods on sample account dao
		accountdao.getName();
		accountdao.getServiceCode();
//		String name = myAccount.getName();
		
		
		context.close();
		
		
		
	}
	
	
	
	
	
	
	
}
