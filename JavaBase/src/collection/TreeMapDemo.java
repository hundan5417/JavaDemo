package collection;

import java.io.PrintStream;
import java.util.TreeMap;

import sun.management.resources.agent;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<exm, exm1> lTreeMap = new TreeMap<exm,exm1>();
		lTreeMap.put(new exm("����", 1999), new exm1("�ع�", 17));
		lTreeMap.put(new exm("���", 1997), new exm1("�ع�", 19));
		lTreeMap.put(new exm("��½", 1949), new exm1("����", 67));
		lTreeMap.put(new exm("���", 1911), new exm1("����", 105));
		lTreeMap.put(new exm("����", 1921), new exm1("����", 95));
		PrintStream out = System.out ;
		out.println("lTreeMap : " + lTreeMap);
		
		
		

	}

	


	

}
