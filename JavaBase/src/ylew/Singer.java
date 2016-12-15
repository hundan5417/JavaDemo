package ylew;




public class Singer {

	private String id;
	private String name;
	private Integer age;
	private String work;

	public Singer(String id, String name, Integer age, String work) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
	}

	/*
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/*
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work=work;
	}


	public static void main(String[] args) {
		Singer singer1 = new Singer("1961927", "AndyLau", 55, "singer");
		Singer singer2 = new Singer("1961710", "JackyCheung", 55, "singer");
//		Singer singer3 = new Singer("19661211", "LeonLaiMing", 50, "singer");
//		Singer singer4 = new Singer("19651026", "AaronKwok", 51, "singer");
//		Singer singer5;
		if (singer1 == singer2) {

		} else {
			System.out.println("singer1!=singer2:" + (singer1 != singer2));
			System.out.println("singer1:" + singer1);
			System.out.println("singer2:" + singer2);

		}
	}

	public String toString() {
		return "Singer [id=" + id + ",name=" + name + ",age=" + age + ",work=" + work + "]";

	}

}
