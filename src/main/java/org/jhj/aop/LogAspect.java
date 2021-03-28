package org.jhj.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
	 
	 @Around("within(org.jhj.myweb.service.*)") 
	 public Object log(ProceedingJoinPoint pjp) throws Throwable{
		 
		 long start = System.currentTimeMillis();
		 
		 Object result = pjp.proceed();	// 메서드 수행
	 
		 String type = pjp.getSignature().getDeclaringTypeName();
		 
		 long end = System.currentTimeMillis();
		
		 logger.info("------------------------------------------------------------");
		 logger.info(type + "." + pjp.getSignature().getName() + "()");
		 logger.info("Argument/Parameter: " + Arrays.toString(pjp.getArgs()));
		 logger.info("Running Time: " + (end-start));	// 실행 시간
		 logger.info("------------------------------------------------------------");
		 
		 return result; 
		 
	 }

}
