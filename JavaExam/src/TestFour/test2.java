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
		System.out.println("�����ļ��Ƿ���ڣ� " + f1.exists());
		Writer wr = new FileWriter(f1);
		String srting1 = "����һ��java�ϻ�����ĵ��ļ���\r\n";
		String srting2 = "һ����������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�\r\n";
		String srting3 = "��Ҫ�Ĳ������£�ͨ�������ȡ���ļ�������������ַ����õ���Ҫ�Ĳ���ֵ\r\n";
		String srting4 = "100#168#1000#\r\n";
		wr.write(srting1);
		wr.write(srting2);
		wr.write(srting3);
		wr.write(srting4);
		wr.flush();
		System.out.println("�������");
		Reader re = new FileReader(f1);
		char b[] = new char[1024];
		re.read(b);
		System.out.println(b);
		Scanner sc = new Scanner(srting4);
		sc.useDelimiter("#");
		System.out.println("��ǰ��������Ҫ�Ĳ����� ");
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
		// ��һ��ѭ��
		// for (int i = 0; i < 1000; i++) {
		// for (int j = 0; j < 32; j++) {
		// if (j*j==i+100) {
		// for (int k = 0; k <32; k++) {
		// if (k*k==i+168) {
		// System.out.println("��������:" + i);
		// }
		// }
		// }
		// }
		// }
		// String string5 = "�������� ��156\r\n ";
		// String string6= "����˼·:\r\n
		// 1.����һ����ĿҪ���ֵΪi,(i+100)��(i+168)��ƽ������j��k,i��0~1000����forѭ��.\r\n
		// 2.����j��k��ƽ����������1000,����˵j��k��С��32,����һ��ѭ���н��еڶ���ѭ��j��0~32����ѭ��,����j*j=(i+100)�ǵ�ʱ�������һ��forѭ��.\r\n
		// 3.ѭ��ͬ��,m��������(i+168)Ҳ��һ��ƽ������ʱ�򼴿����i��";
		// �ڶ���ѭ��
		// int x[] = new int[32];
		// for (int i = 0; i < 32; i++) {
		// x[i] = (i+1)*(i+1);
		// }
		// for (int j = 0; j < 32; j++) {
		// for (int k = 0; k < 32; k++) {
		// if (x[j]-x[k]==68) {
		// int z= x[k]-100;
		// System.out.println("��������:" + z);
		//
		// }
		//
		// }
		// }
		// String string5 = "�������� ��156\r\n ";
		// String string6= "����˼·:\r\n 1.����0~1000֮�ڵ�����ƽ����Ϊ����x.\r\n
		// 2.j��k����1~32֮���������,������forѭ���ҳ�������������Ϊ68��ƽ����,���������������ֵ.\r\n ";
		//�����ַ���
		for (int i = 0; i <= 1000; i++) {
			if (((Math.sqrt(i + 168) % 1) == 0) && ((Math.sqrt(i + 268) % 1) == 0)) {
				System.out.println(i);
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				String string5 = "�����ֵΪ:\r\n";
				String string6 = list.toString();
				wr.write(string5);
				wr.write(string6);

			}

		}
		String string7 = "\r\n����˼·:\r\n 1.���������ֵi��0~1000�ڽ���forѭ��.\r\n 2.��(i+168)��(i+100)ͬʱ���㿪����1ȡ��Ϊ���ʱ��,���i����д��slist��.\r\n "
				+ "3.���ڲ�ȷ�����ڶ��ٸ���,������һ��list���ϣ�֮��д���ļ���. ";
		wr.write(string7);

		wr.close();
		re.close();
	}

}
