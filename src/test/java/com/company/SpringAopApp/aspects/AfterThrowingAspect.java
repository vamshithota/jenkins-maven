package com.company.SpringAopApp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspect {

	@AfterThrowing(pointcut = "execution(* com.company.SpringAopApp.daos.SampleAccountDao.findAll(..))", throwing="theExcep")
	public void afterThrowExcep(JoinPoint joinPoint, Throwable theExcep) {
		
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);
		
		// log the exception
		System.out.println("\n=====>>> The exception is: " + theExcep);

	}
	
	
}
