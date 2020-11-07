package com.company.SpringAopApp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.company.SpringAopApp.Account;

@Aspect
@Component
@Order(2)
public class JointPointAspect {
	
	@Before("com.company.SpringAopApp.aspects.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {		
		System.out.println("\n This is second in order =====>>> Executing @Before advice on method");
		MethodSignature ms = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method signature is " + ms);
		
		Object args[] = joinPoint.getArgs();
		for(Object arg :args) {
			if(arg instanceof Account) {
				Account account = (Account) arg;
				System.out.println("Account details are " + account.getName() + " Level " + account.getLevel());
			}
		}
		
	}
	
}










