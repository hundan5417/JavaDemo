package TestFour;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("F:" + File.separator + "Student" + File.separator + "Test1" + File.separator + "test.txt");
		System.out.println("检查该文件是否存在： " + f1.exists());
		Writer wr = new FileWriter(f1);
		String srting1 = "这是一个java上机题的文档文件：\r\n";
		String srting2 = "一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？\r\n";
		String srting3 = "需要的参数如下：通过程序读取本文件，解析下面的字符串得到需要的参数值\r\n";
		String srting4 = "100#168#1000#\r\n";
		wr.write(srting1);
		wr.write(srting2);
		wr.write(srting3);
		wr.write(srting4);
		wr.flush();
		System.out.println("输入完成");
		Reader re = new FileReader(f1);
		char b[] = new char[1024];
		re.read(b);
		System.out.println(b);
		Scanner sc = new Scanner(srting4);
		sc.useDelimiter("#");
		System.out.println("当前行中有需要的参数： ");
		List<String> ix = new ArrayList<String>();
		while (sc.hasNext()) {
			ix.add(sc.next());
}
		for (String string : ix) {
			
			System.out.println(string);
		}
		String tmp = ix.get(2);
		
		System.out.println(Integer.parseInt(ix.get(2)));
	    System.out.println(ix.size());
		int x[]=new int[3];
		System.out.println(ix.get(2));
		
		
	
		
	for (int i = 0; i < 3; i++) {
			x[i]=Integer.parseInt(ix.get(i));
			System.out.println("x[" + i + "]" + "=" + x[i]);
		}	
		// 第一种循环
		// for (int i = 0; i < 1000; i++) {
		// for (int j = 0; j < 32; j++) {
		// if (j*j==i+100) {
		// for (int k = 0; k <32; k++) {
		// if (k*k==i+168) {
		// System.out.println("该数字是:" + i);
		// }
		// }
		// }
		// }
		// }
		// String string5 = "该数字是 ：156\r\n ";
		// String string6= "解题思路:\r\n
		// 1.设置一个题目要求的值为i,(i+100)和(i+168)的平方根是j和k,i在0~1000进行for循环.\r\n
		// 2.由于j和k的平方数不超过1000,既是说j和k都小于32,在上一步循环中进行第二个循环j在0~32进行循环,满足j*j=(i+100)是的时候进入下一个for循环.\r\n
		// 3.循环同上,m当其满足(i+168)也是一个平方数的时候即可输出i。";
		// 第二种循环
		// int x[] = new int[32];
		// for (int i = 0; i < 32; i++) {
		// x[i] = (i+1)*(i+1);
		// }
		// for (int j = 0; j < 32; j++) {
		// for (int k = 0; k < 32; k++) {
		// if (x[j]-x[k]==68) {
		// int z= x[k]-100;
		// System.out.println("该数字是:" + z);
		//
		// }
		//
		// }
		// }
		// String string5 = "该数字是 ：156\r\n ";
		// String string6= "解题思路:\r\n 1.设置0~1000之内的所有平方数为数组x.\r\n
		// 2.j与k都是1~32之间的正整数,用两个for循环找出这个数组里面差为68的平方数,并根据这求得所求值.\r\n ";
		//第三种方法
		for (int i = 0; i <= 1000; i++) {
			if (((Math.sqrt(i + 168) % 1) == 0) && ((Math.sqrt(i + 268) % 1) == 0)) {
				System.out.println(i);
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				String string5 = "所求的值为:\r\n";
				String string6 = list.toString();
				wr.write(string5);
				wr.write(string6);

			}

		}
		String string7 = "\r\n解题思路:\r\n 1.设置所求的值i在0~1000内进行for循环.\r\n 2.当(i+168)和(i+100)同时满足开方向1取余为零的时候,输出i，并写入slist中.\r\n "
				+ "3.由于不确定存在多少个解,所以用一个list集合，之后写入文件中. ";
		wr.write(string7);

		wr.close();
		re.close();
	}

}
