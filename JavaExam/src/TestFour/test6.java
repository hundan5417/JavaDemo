package TestFour;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class test9 {
	public void pr() throws IOException {
		File f1 = new File("F:" + File.separator + "Student" + File.separator + "Test1" + File.separator + "test3.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("要被整除的值是：");
		if (sc.hasNextBigInteger()) {
			int j = Integer.parseInt(sc.next());
			System.out.println("输入的范围是：");
			if (sc.hasNextBigInteger()) {
				Writer wr1 = new FileWriter(f1);
				int i = Integer.parseInt(sc.next());
				if (i >= j && i > 0 && j > 0) {
					int x = i % j;
					int z = (i - x) / j;
					System.out.println("符合条件的个数是：" + z);
					double q = (double) (j * (1 + z)) / 2;
					System.out.println("平均数是： ");
					System.out.println(q);
					int arry[] = new int[z];

					for (int k = 0; k < arry.length; k++) {
						arry[k] = j * (k + 1);
					}

					System.out.println("最大值是：" + arry[z - 1]);
					System.out.println("最小值是：" + arry[0]);
					System.out.println("所有数和是" + q * z);

					String str1 = "计算XX以内所有能被7整除的数的和以及平均数\r\n" + "要求：\r\n"
							+ "A.xx的值从控制台用Scanner读取；创建文本文件，将当前题目及要求写入文档\r\n"
							+ "B.代码编写要具有灵活性，不要我随便改个参数导致你的代码，大面积修改！！\r\n"
							+ "C.在文档中打出解题思路，同时输出从控制台读取的值，符合条件的数有几个？对符合条件的数，排序输出！和是多少，平均数是多少，最大值是多少，最小值是多少？\r\n";
					wr1.write(str1);

					String str2 = "思路：首先建立Scanner的流，先判断输入的j是否是整数，符合条件进入下一步判断输入的范围i是整数，符合条件进入下一步,最后判断时候是正数，且i>j，进入主要的方法中\r\n"
							+ "x是整除后的余数，很容易求出整除的个数z，声明一个数组，长度是z，之后挨个求出所需要的值即可\r\n";
					wr1.write(str2);
					String str = "符合条件的值是：\r\n";
					wr1.write(str);
					System.out.println("符合条件的数分别是：");
					for (int s : arry) {
						System.out.println(s);
						String string = Integer.toString(s) + "\r\n";
						wr1.write(string);

					}
					String str3 = "符合条件的个数是：\r\n" + Integer.toString(z) + "\r\n" + "平均数：\r\n" + Double.toString(q)
							+ "\r\n" + "最大值是：\r\n" + Integer.toString(arry[z - 1]) + "\r\n" + "最小值是：\r\n"
							+ Integer.toString(arry[0]) + "\r\n" + "所有数和是:\r\n" + Double.toString(q * z);
					wr1.write(str3);
					wr1.close();
				} else {
					System.out.println("输入有误");
				}
			} else {
				System.out.println("输入的范围有误");

			}

		} else {
			System.out.println("输入的值有误");

		}

	}

}

public class test6 {

	public static void main(String[] args) {

	}

}
