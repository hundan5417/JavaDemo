package uitags;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 409254021890273331L;
	private String userName;
	private String passWord;
	private String gender;
	private String about;
	private String country;
	private List<Country> countryList;
	private String[] community;
	private List<String> communityList;
	private Boolean mailingList;

	public String populate() {
		// Ìí¼ÓÑ¡Ïî
		countryList = new ArrayList<Country>();
		countryList.add(new Country(1, "india"));
		countryList.add(new Country(2, "usa"));
		countryList.add(new Country(3, "france"));
		countryList.add(new Country(4, "china"));
		countryList.add(new Country(5, "japan"));

		communityList = new ArrayList<String>();
		communityList.add("java");
		communityList.add("php");
		communityList.add("asp");
		communityList.add(".net");
		communityList.add("c++");

		community = new String[] { "java", ".net" };
		mailingList = true;
		return "populate";

	}

	public String execute() {
		return SUCCESS;

	}

}
