package auto;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/*@Component("boyAnnotation"��    �����ȡ������
* @Autowird   ע������
* @Resource   ע�����ԣ����Է������Ի���setter��������
*             ����name����bean���֣�type����bean�����ͣ�byName�Զ�ע��
*             @Resource(name="useGirlFriend")��@Resource(type="useGirlFriend.class")
* @Repository dao��bean(�־û���)
* @Service  service��bean(�����)
* @Controller  mvc���Ʋ�bean(���ֲ�)
* 
* @Scope("session")bean�Ĺ�����
*        singleton  ����������bean
*        prototyoe  ע���µ�bean
*        request   http request ��Ч(һ������һ���µ�bean)
*        session   http session ��Ч(һ������һ���µ�bean)
*        global session portlet web ��Чȫ��session
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
