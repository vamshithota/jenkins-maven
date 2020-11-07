package com.company.SpringAopApp.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAspect {

	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Around("execution (* com.company.SpringAopApp.services.*.getFortune(..))")
	public Object aroundAspectMethod(ProceedingJoinPoint pjp) throws Throwable {
		String method = pjp.getSignature().toShortString();
		logger.info("\n=====>>> Executing @Around on method: " + method);
		// get begin timestamp
		long begin = System.currentTimeMillis();
		// now, let's execute the method
		Object result = null;
		try {
			result = pjp.proceed();
		}catch(Exception ex) {
			logger.warning(ex.getMessage());
			// rethrow exception
			throw ex;
		}
			long end = System.currentTimeMillis();
			// compute duration and display it
			long duration = end - begin;
			logger.info("\n=====> Duration: " + duration / 1000.0 + " seconds");
		return result;
	}
}
