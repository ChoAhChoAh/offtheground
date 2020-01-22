package otg.aspect;

import java.sql.SQLException;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	
	public LoggingAspect() {
		
	}
	
	@Before("execution(* otg.dao.BaseDao.execute*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		log.debug("Method ["+joinPoint.getSignature().getName()+"] begin with "+Arrays.toString(joinPoint.getArgs())+"");
	}
	
	@After("execution(* otg.dao.BaseDao.execute*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		log.debug("Method ["+joinPoint.getSignature().getName()+"] end");
	}
	
	@AfterThrowing(pointcut="execution(* otg.dao.BaseDao.execute*(..))",throwing="e")
	public void WhenException(JoinPoint joinPoint,SQLException e) {
		log.error("Method ["+joinPoint.getSignature().getName()+"] occur exception : "+e.getMessage());
	}
	
	@AfterReturning(pointcut="execution(* otg.dao.BaseDao.execute*(..))",returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		log.debug("Method ["+joinPoint.getSignature().getName()+"] return : "+String.valueOf(result));
	}

}
