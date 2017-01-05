package aop;

import java.util.Arrays;
import org.springframework.aop.MethodBeforeAdvice;
import org.apache.log4j.Logger;
import java.lang.reflect.Method;;
public class LoggerBefore implements MethodBeforeAdvice{
     private static final Logger log = Logger.getLogger(LoggerBefore.class);
     @Override
     public void before(Method mothod,Object[] arg1,Object target){
    	 log.info("����" + target +"��" + mothod.getName() + "�������������" + Arrays.toString(arg1));
     }
}
