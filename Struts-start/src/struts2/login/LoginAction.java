package struts2.login;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginAction {
	private String username;
	private String password;
	public String execute() {
		if (this.getUsername().equals("admin")&&this.getPassword().equals("8888")) {
			return "success";
		}
		return "error";
	}

}
