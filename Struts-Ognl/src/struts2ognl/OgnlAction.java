package struts2ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ognlvaluestack.Student;
import ognlvaluestack.Teacher;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OgnlAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String greeting;
	private List<Person> persons = new ArrayList<Person>();

	private void initData() {
		Address address1 = new Address("中国", "合肥", "滨湖区11号");
		Address address2 = new Address("中国", "上海", "浦东区22号");
		Address address3 = new Address("中国", "北京", "朝阳区33号");
		String[] alias1 = { "xiaozhang", "三儿" };
		String[] alias2 = { "xiaoli", "四儿" };
		String[] alias3 = { "大老王", "五爷" };
		List<String> emalil1 = new ArrayList<String>();
		emalil1.add("zhangsan@163.com");
		emalil1.add("zhangsan@gmail.com");
		List<String> emalil2 = new ArrayList<String>();
		emalil1.add("lisi@163.com");
		emalil1.add("lisi@gmail.com");
		List<String> emalil3 = new ArrayList<String>();
		emalil1.add("wangwu@163.com");
		emalil1.add("wangwu@gmail.com");

		Map<String, String> phone1 = new HashMap<String, String>();
		phone1.put("home", "31");
		phone1.put("offoce", "32");
		Map<String, String> phone2 = new HashMap<String, String>();
		phone1.put("home", "41");
		phone1.put("offoce", "42");
		Map<String, String> phone3 = new HashMap<String, String>();
		phone1.put("home", "51");
		phone1.put("offoce", "52");

		Person person1 = new Person("张三", 33, 3333, address1, alias1, emalil1, phone1);
		Person person2 = new Person("李四", 44, 4444, address2, alias2, emalil2, phone2);
		Person person3 = new Person("王五", 55, 5555, address3, alias3, emalil3, phone3);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() {
		initData();
		valueStack();
		ActionContext actionContext = ActionContext.getContext();
		Map request = actionContext.getContextMap();
		Map session = actionContext.getSession();
		Map application = actionContext.getApplication();
		request.put("personName", persons.get(0).getName());
		session.put("personName", persons.get(1).getName());
		application.put("personName", persons.get(2).getName());
		return SUCCESS;
	}

	/*private void valueStacke() {
		Student stu = new Student("jack", 20);
		Teacher tea = new Teacher("scott", 40);
		
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		valueStack.push(stu);
		System.out.println(valueStack.findValue("name"));
		valueStack.push(tea);
		System.out.println(valueStack.findValue("name"));
		
	}*/

	public void  valueStack() {
    	 Student stu =new Student("Jack",20);
    	 Teacher tea =new Teacher("tom",40);
    	 ValueStack valueStack = ActionContext.getContext().getValueStack();
    	 valueStack.push(stu);
    	 System.out.println(valueStack.findValue("name"));
    	 valueStack.push(tea);
    	 System.out.println(valueStack.findValue("name"));
    	 System.out.println("============================");
    	 System.out.println(valueStack.findValue("score"));
    	 System.out.println(valueStack.findValue("salary"));
    	 System.out.println("============================");
    	 valueStack.setValue("name","rose");
    	 System.out.println(valueStack.findValue("name"));
    	 valueStack.setValue("score","80");
    	 System.out.println(valueStack.findValue("score"));
    	 System.out.println("============================");
     }
	 

}
