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
		System.out.println("Ҫ��������ֵ�ǣ�");
		if (sc.hasNextBigInteger()) {
			int j = Integer.parseInt(sc.next());
			System.out.println("����ķ�Χ�ǣ�");
			if (sc.hasNextBigInteger()) {
				Writer wr1 = new FileWriter(f1);
				int i = Integer.parseInt(sc.next());
				if (i >= j && i > 0 && j > 0) {
					int x = i % j;
					int z = (i - x) / j;
					System.out.println("���������ĸ����ǣ�" + z);
					double q = (double) (j * (1 + z)) / 2;
					System.out.println("ƽ�����ǣ� ");
					System.out.println(q);
					int arry[] = new int[z];

					for (int k = 0; k < arry.length; k++) {
						arry[k] = j * (k + 1);
					}

					System.out.println("���ֵ�ǣ�" + arry[z - 1]);
					System.out.println("��Сֵ�ǣ�" + arry[0]);
					System.out.println("����������" + q * z);

					String str1 = "����XX���������ܱ�7���������ĺ��Լ�ƽ����\r\n" + "Ҫ��\r\n"
							+ "A.xx��ֵ�ӿ���̨��Scanner��ȡ�������ı��ļ�������ǰ��Ŀ��Ҫ��д���ĵ�\r\n"
							+ "B.�����дҪ��������ԣ���Ҫ�����ĸ�����������Ĵ��룬������޸ģ���\r\n"
							+ "C.���ĵ��д������˼·��ͬʱ����ӿ���̨��ȡ��ֵ���������������м������Է�������������������������Ƕ��٣�ƽ�����Ƕ��٣����ֵ�Ƕ��٣���Сֵ�Ƕ��٣�\r\n";
					wr1.write(str1);

					String str2 = "˼·�����Ƚ���Scanner���������ж������j�Ƿ�����������������������һ���ж�����ķ�Χi����������������������һ��,����ж�ʱ������������i>j��������Ҫ�ķ�����\r\n"
							+ "x�����������������������������ĸ���z������һ�����飬������z��֮�󰤸��������Ҫ��ֵ����\r\n";
					wr1.write(str2);
					String str = "����������ֵ�ǣ�\r\n";
					wr1.write(str);
					System.out.println("�������������ֱ��ǣ�");
					for (int s : arry) {
						System.out.println(s);
						String string = Integer.toString(s) + "\r\n";
						wr1.write(string);

					}
					String str3 = "���������ĸ����ǣ�\r\n" + Integer.toString(z) + "\r\n" + "ƽ������\r\n" + Double.toString(q)
							+ "\r\n" + "���ֵ�ǣ�\r\n" + Integer.toString(arry[z - 1]) + "\r\n" + "��Сֵ�ǣ�\r\n"
							+ Integer.toString(arry[0]) + "\r\n" + "����������:\r\n" + Double.toString(q * z);
					wr1.write(str3);
					wr1.close();
				} else {
					System.out.println("��������");
				}
			} else {
				System.out.println("����ķ�Χ����");

			}

		} else {
			System.out.println("�����ֵ����");

		}

	}

}

public class test6 {

	public static void main(String[] args) {

	}

}
