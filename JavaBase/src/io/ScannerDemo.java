package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = System.out;
//		Scanner s1 = new Scanner(System.in);
//	    out.println("输入的是： ");
//	     if (s1.hasNextInt()) {
//	    	int x = Integer.parseInt(s1.next());
//	    	System.out.println("x = " + x);
//	    }else {
//			System.out.println("输入有误");
//		}
//        if (s1.hasNextInt()) {
//        	int r;
//        	r=s1.nextInt();
//        	out.println("圆的面积：" + 3.14*r*r);
//			
//		}else {
//			out.println("输入错误");
//			out.println("输入的是："+ s1.next());
//		}
//	    out.println("输入double型 : " + s1.nextDouble());
//      if (s1.hasNextBoolean()) {
//		out.println("布尔值是 ： " + s1.hasNextBoolean());
//	}  else {
//		out.println("Not 布尔值是 ： " + s1.next());
//		
	    File file = new File("E:" + File.separator +"Test" + File.separator +"Test1.txt") ;
	    InputStream is = new FileInputStream(file);
	    Scanner s2 = new Scanner(is,"GBK");
	    while (s2.hasNextLine()) {
	    	out.println(s2.nextLine());
			 
		}
		
	    
	    
	}

}
