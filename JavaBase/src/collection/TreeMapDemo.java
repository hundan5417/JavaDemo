package collection;

import java.io.PrintStream;
import java.util.TreeMap;

import sun.management.resources.agent;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<exm, exm1> lTreeMap = new TreeMap<exm,exm1>();
		lTreeMap.put(new exm("澳门", 1999), new exm1("回归", 17));
		lTreeMap.put(new exm("香港", 1997), new exm1("回归", 19));
		lTreeMap.put(new exm("大陆", 1949), new exm1("建国", 67));
		lTreeMap.put(new exm("民国", 1911), new exm1("建国", 105));
		lTreeMap.put(new exm("兔子", 1921), new exm1("建党", 95));
		PrintStream out = System.out ;
		out.println("lTreeMap : " + lTreeMap);
		
		
		

	}

	


	

}
