package auto;

import org.springframework.stereotype.Component;

/**
 * component����һ�����
 * 
 * @author win
 */
// @servive("usaGirlFriend")
// @Controller("usaGirlFriend")
// @Repository("usaGirlFriend")
@Component("usaGirlFriend")
public class UsaGirlFriend {
	public String speak() {
		return "english";
	}
}
