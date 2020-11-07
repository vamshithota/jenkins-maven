package com.company.SpringAopApp.aspects;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.company.SpringAopApp.Account;

@Aspect
@Component
@Order(12)
public class AfterReturningAspect {

	@AfterReturning(pointcut = "execution(* com.company.SpringAopApp.daos.SampleAccountDao.findAccounts(..))",
			returning="result")
	public void afterReturing(JoinPoint joinPoint, List<Account> result) {
		String method = joinPoint.getSignature().toShortString();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
		System.out.println("result object is " + result);
		convertAccountNamesToUpperCase(result);
		System.out.println("After modfying the result object ");
		System.out.println(result);
	}
	private void convertAccountNamesToUpperCase(List<Account> result) {

		// loop through accounts

		for (Account tempAccount : result) {
			
			// get uppercase version of name
			String theUpperName = tempAccount.getName().toUpperCase();
			
			// update the name on the account
			tempAccount.setName(theUpperName);
		}

	}
	
}
