package set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Getter;
import lombok.Setter;

public class BoyPNameSpace {
	private static Logger logger = Logger.getLogger(BoyPNameSpace.class);

	@Getter
	@Setter
	private GirlFriend girlFriend;
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("applicationContext-set.xml");
		BoyPNameSpace boy = (BoyPNameSpace) ctx.getBean("boyPNameSpace");
		logger.info(boy.girlFriend.speak());

	}

}
