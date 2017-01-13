package hibernate.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users {
	private Long id;
	private String name;
	private String pass;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Long id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [id = " + id + ", name = " + name + ", pass = " + pass + "]";
	}

}
