package com.company.SpringAopApp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(123)
public class MyApiAnalyticsAspect {

	@Before("com.company.SpringAopApp.aspects.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n This is last =====>>> Performing API analytics");		
	}

}
