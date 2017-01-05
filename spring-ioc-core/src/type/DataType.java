package type;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

import lombok.Setter;

@Setter
public class DataType {
	private String spchar1;// 特殊字符
	private String spchar2;// 特殊字符
	private User innerBean;// javaBean类型
	private List<String> list;// list类型
	private String[] arrray;// 数组类型
	private Set<String> set;// set类型
	private Map<String, String> map;// map类型
	private Properties props;// Properties类型
	private String emptyValue;// 空串
	private String nullValue = "inti null";// 空值nullֵ

	public void printValue() {
		System.out.println("特殊字符1" + this.spchar1);
		System.out.println("特殊字符2" + this.spchar2);
		System.out.println("javaBean" + this.innerBean);
		System.out.println("list" + this.list);
		System.out.println("set" + this.set);
		System.out.println("map" + this.map);
		System.out.println("数组" + this.arrray);
		System.out.println("properties类型" + this.props);
		System.out.println("空串[" + this.emptyValue + "]");
		System.out.println("空值" + this.nullValue);

	}

}
