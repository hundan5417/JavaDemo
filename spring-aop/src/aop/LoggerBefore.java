package aop;

import java.util.Arrays;
import org.springframework.aop.MethodBeforeAdvice;
import org.apache.log4j.Logger;
import java.lang.reflect.Method;;
public class LoggerBefore implements MethodBeforeAdvice{
     private static final Logger log = Logger.getLogger(LoggerBefore.class);
     @Override
     public void before(Method mothod,Object[] arg1,Object target){
    	 log.info("调用" + target +"的" + mothod.getName() + "方法，方法入参" + Arrays.toString(arg1));
     }
}
