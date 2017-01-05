package aop;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class LoggerAfterReturning implements AfterReturningAdvice{
	private static final Logger log = Logger.getLogger(LoggerAfterReturning.class);
	@Override
	public void afterReturning(Object returnValue,Method method,Object[] arg2,Object target){
   	 log.info("����" + target +"��" + method.getName() + "�������������" + returnValue);

	}

}
