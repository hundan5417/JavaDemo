package auto;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/*@Component("boyAnnotation")给组件取个名字
* @Autowird   注入属性，可以放在属性或者setter方法上面byType自动注入
* @Resource   注入属性，可以放在属性或者setter方法上面
*             属性name解析bean的名字，type解析bean的类型，byName自动注入
*             @Resource(name="useGirlFriend")、@Resource(type="useGirlFriend.class")
* @Repository dao层bean(持久化层)
* @Service  service层bean(服务层)
* @Controller  mvc控制层bean(表现层)
* 
* @Scope("session")bean的作用于
*        singleton  单例，共享bean
*        prototyoe  注入新的bean
*        request   http request 有效(一个请求一个新的bean)
*        session   http session 有效(一个请求一个新的bean)
*        global session portlet web 有效全局session
*   @author win
*/

@Component("boyAnnotation")
public class BoyAnnotation {
	private static Logger logger = Logger.getLogger(BoyAnnotation.class);
	// @Autowired
	private UsaGirlFriend usaGirlFriend;
	private static ApplicationContext ctx;

	public UsaGirlFriend getUsaGirlFriend() {
		return usaGirlFriend;
	}

	// @Resource(type="usaGirlFriend.class")
	@Resource(name = "usaGirlFriend")
	public void setUsaGirlFriend(UsaGirlFriend usaGirlFriend) {
		this.usaGirlFriend = usaGirlFriend;
	}

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("applicationContext-auto.xml");

		BoyAnnotation boy = (BoyAnnotation) ctx.getBean("boyAnnotation");
		logger.info(boy.usaGirlFriend.speak());
	}

}
