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
		// ���ļ�test��д������
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

		InputStream ip = new FileInputStream(f1);
		Reader ra = new InputStreamReader(ip);
		BufferedReader bReader = new BufferedReader(ra);
		List<String> ls = new ArrayList<String>();

		// ���ļ��ж�ȡ����

		StringBuilder string5 = new StringBuilder();
		String sring6 = null;
		while ((sring6 = bReader.readLine()) != null) {
			string5.append(sring6);
		}
		System.out.println(string5);

		// ��ȡָ������
		String pattern = "(\\d+\\b)";
		Pattern rPattern = Pattern.compile(pattern);
		Matcher mMatcher = rPattern.matcher(string5);
		System.out.println("��ǰ��������Ҫ�Ĳ����� ");
		while (mMatcher.find()) {
			System.out.print(mMatcher.group() + " ");
		}
		System.out.println();
        
        //����forѭ������������
		System.out.println("��õĽ�Ϊ:  ");
        
		for (Integer i = 0; i <= 1000; i++) {
			if (((Math.sqrt(i + 100) % 1) == 0) && ((Math.sqrt(i + 268) % 1) == 0)) {
				System.out.println(i);
				ls.add(i.toString());
			}
		}
		//���𰸺ͽ���˼·�������ļ���
		String string6 = ls.toString();
		String string7 = "\r\n����˼·:\r\n 1.���������ֵi��0~1000�ڽ���forѭ��.\r\n 2.��(i+168)��(i+100)ͬʱ���㿪����1ȡ��Ϊ���ʱ��,���i����д��slist��.\r\n "
				+ "3.���ڲ�ȷ�����ڶ��ٸ���,������һ��list���ϣ�֮��д���ļ���. ";
		wr.write(string6);
		wr.write(string7);
		wr.close();
		ra.close();
		ip.close();
		bReader.close();
	}
}
