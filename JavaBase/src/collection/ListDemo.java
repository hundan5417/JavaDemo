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
		out.println(" strList�ĳ��ȣ� " + strList.size());
		out.println("strList�ĳ��ȣ�" + strList.size());

		// ��ӡ list����
		strList.add("One day I will be old");
		strList.add("And you will be the king");
		strList.add("My son!");

		out.println("strList:" + strList.toString());
		// List ɾ��Ԫ��
		out.println("List ɾ��Ԫ��");
		strList.remove("My son!");
		out.println("strList:" + strList.toString());
		strList.add("My son!");
		out.println("strList:" + strList.toString());

		out.println("List ָ��λ��ɾ��Ԫ��");
		strList.remove(1);
		out.println("strList:" + strList.toString());
		strList.add("And you will be the king");
		strList.set(0, "Young man");// ����Ԫ�ص�λ���趨λ�ã��Ǹ��治������
		out.println("strList:" + strList.toString());
		// ����Ԫ��
		strList.clear();
		out.println("strList:" + strList.toString());
		out.println("strList�Ƿ�Ϊ��" + strList.isEmpty());

		// ��ȡָ��Ԫ��
		strList.add("Young man ");
		strList.add("One day I will be old");
		strList.add("And you will be the king");
		strList.add("My son!");
		out.println("ָ��Ԫ��strList.get(2)" + strList.get(2));
		out.println("strList.indexOf:" + strList.indexOf("Young man"));
		strList.addAll(strList1);
		out.println("strList.addAll(strList1):" + strList.toString());
		strList.removeAll(strList1);
		out.println("strList.removeAll(strList1):" + strList.toString());
		out.println(strList.addAll(strList1));
		out.println(" strList.addAll(strList1):" + strList.toString());
		out.println(" strList.contains('Young man') = " + strList.contains("Young man"));
		out.println(" strList.containsAll(strList1) = " + strList.containsAll(strList1));
		out.println(" strList.subList(1, 2) = " + strList.subList(1, 2));// ��list��ȡ��1��2�����ǲ�����2
        Iterator iterator = strList.iterator();
        while (iterator.hasNext()) {
        	Object object=(Object) iterator.next();
			out.println(object);
			
			
		}
        
	}

}
