package collection;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.OverlayLayout;

public class ListDemo {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		List<String> strList1 = new ArrayList<String>();
		strList1.add("One day I will be old");
		strList1.add("And you will be the king");
		strList1.add("My son!");

		PrintStream out = System.out;
		out.println(" strList的长度： " + strList.size());
		out.println("strList的长度：" + strList.size());

		// 打印 list长度
		strList.add("One day I will be old");
		strList.add("And you will be the king");
		strList.add("My son!");

		out.println("strList:" + strList.toString());
		// List 删除元素
		out.println("List 删除元素");
		strList.remove("My son!");
		out.println("strList:" + strList.toString());
		strList.add("My son!");
		out.println("strList:" + strList.toString());

		out.println("List 指定位置删除元素");
		strList.remove(1);
		out.println("strList:" + strList.toString());
		strList.add("And you will be the king");
		strList.set(0, "Young man");// 在有元素的位置设定位置，是更替不是增加
		out.println("strList:" + strList.toString());
		// 清理元素
		strList.clear();
		out.println("strList:" + strList.toString());
		out.println("strList是否为空" + strList.isEmpty());

		// 获取指定元素
		strList.add("Young man ");
		strList.add("One day I will be old");
		strList.add("And you will be the king");
		strList.add("My son!");
		out.println("指定元素strList.get(2)" + strList.get(2));
		out.println("strList.indexOf:" + strList.indexOf("Young man"));
		strList.addAll(strList1);
		out.println("strList.addAll(strList1):" + strList.toString());
		strList.removeAll(strList1);
		out.println("strList.removeAll(strList1):" + strList.toString());
		out.println(strList.addAll(strList1));
		out.println(" strList.addAll(strList1):" + strList.toString());
		out.println(" strList.contains('Young man') = " + strList.contains("Young man"));
		out.println(" strList.containsAll(strList1) = " + strList.containsAll(strList1));
		out.println(" strList.subList(1, 2) = " + strList.subList(1, 2));// 从list中取从1到2，但是不包括2
        Iterator iterator = strList.iterator();
        while (iterator.hasNext()) {
        	Object object=(Object) iterator.next();
			out.println(object);
			
			
		}
        
	}

}
