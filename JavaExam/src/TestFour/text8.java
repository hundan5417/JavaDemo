package TestFour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class text8 {
	public static void main(String[] args) throws IOException {
		// 往文件test中写入内容
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

		InputStream ip = new FileInputStream(f1);
		Reader ra = new InputStreamReader(ip);
		BufferedReader bReader = new BufferedReader(ra);
		List<String> ls = new ArrayList<String>();

		// 从文件中读取内容

		StringBuilder string5 = new StringBuilder();
		String sring6 = null;
		while ((sring6 = bReader.readLine()) != null) {
			string5.append(sring6);
		}
		System.out.println(string5);

		// 读取指定数字
		String pattern = "(\\d+\\b)";
		Pattern rPattern = Pattern.compile(pattern);
		Matcher mMatcher = rPattern.matcher(string5);
		System.out.println("当前行中有需要的参数： ");
		while (mMatcher.find()) {
			System.out.print(mMatcher.group() + " ");
		}
		System.out.println();
        
        //利用for循环解决解决问题
		System.out.println("求得的解为:  ");
        
		for (Integer i = 0; i <= 1000; i++) {
			if (((Math.sqrt(i + 100) % 1) == 0) && ((Math.sqrt(i + 268) % 1) == 0)) {
				System.out.println(i);
				ls.add(i.toString());
			}
		}
		//将答案和解题思路再输入文件中
		String string6 = ls.toString();
		String string7 = "\r\n解题思路:\r\n 1.设置所求的值i在0~1000内进行for循环.\r\n 2.当(i+168)和(i+100)同时满足开方向1取余为零的时候,输出i，并写入slist中.\r\n "
				+ "3.由于不确定存在多少个解,所以用一个list集合，之后写入文件中. ";
		wr.write(string6);
		wr.write(string7);
		wr.close();
		ra.close();
		ip.close();
		bReader.close();
	}
}
