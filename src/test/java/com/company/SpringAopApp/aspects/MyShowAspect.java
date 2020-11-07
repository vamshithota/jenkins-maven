package com.company.SpringAopApp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(6)
public class MyShowAspect {

	@Before("com.company.SpringAopApp.aspects.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\nThis is 6th \n=====>>> SHOW");		
	}

}
