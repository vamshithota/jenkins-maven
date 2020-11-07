package com.company.SpringAopApp.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	//point cut expression for any method return type ,start with 'add' and take 0 or more parameters
	//@Before("execution(* add*(..))")
	//point cut expression for to execute only on classes in from below mentioned package
	//any method return type ,start with 'add' and take 0 or more parameters
	/*@Before("execution(* com.company.SpringAopApp.daos.*.*(..))")
	public void beforeAddAcountAdvice() {
		System.out.println("executing @before advice method");
	}
	
	//declaring pointcut for entire package
	@Pointcut("execution (* com.company.SpringAopApp.daos.*.*(..))")
	public void forDaos() {};
	
	//declaring pointcut for only setters methods in entire package
	@Pointcut("execution (* com.company.SpringAopApp.daos.*.set*(..))")
	public void callonGetterMethods() {
	};
	
	//declaring pointcut for only getters methods in entire package
	@Pointcut("execution (* com.company.SpringAopApp.daos.*.get*(..))")
	public void callOnSetterMethods() {
	};

	//declaring pointcut for non setter & getters methods in entire package
	@Before("forDaos() && !(callonGetterMethods() || callOnSetterMethods())")
	public void onNonSetterGetterMethods() {
		System.out.println(getClass() + " for non setter and getter methods.");
	};
*/	
}
