package enumdemo;

import java.io.PrintStream;
import java.util.Iterator;

public class TestsrEnum {
	public static void print(srEnum cmz) {
		PrintStream out = System.out;
		switch (cmz) {
		case ���:
			out.println("���˷���ȥ����ع�����");
			break;
		case �Ÿ�:
			out.println("���ù���ǧ��䣬������º�ʿ�㻶��");
			break;
		case ����:
			out.println("�𾡺�֦�����ܣ���įɳ����");
			break;
		case ����:
			out.println("���粻�����ɱ㣬ͭȸ����������");
			break;
		case ������:
			out.println("���ϵ���˿����������ɻ���ʼ��");
			break;

		default:
			out.println("ȡ�λ������عˣ���Ե�޵���Ե��");

			break;
		}

	}

	public static void print2(srEnum2 cmz) {
		PrintStream out = System.out;
		switch (cmz) {
		case ���:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case �Ÿ�:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case ����:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case ����:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;
		case ������:
			out.println(cmz.getDesc() + cmz.getShiju());
			break;

		default:
			out.println(cmz.getDesc() + cmz.getShiju());

			break;
		}

	}

	public static void main(String[] args) {
		// print(srEnum.���);
		// print(srEnum.������);
		// print(srEnum.����);
		// print(srEnum.�Ÿ�);
		// print(srEnum.�׾���);//����case��û�С��׾��ס���һö�����ͣ�����ֱ���ߵ������� default�е�ֵ
		// print(srEnum.����);
		print2(srEnum2.������);
		print2(srEnum2.���);
		print2(srEnum2.����);
		print2(srEnum2.�Ÿ�);
		print2(srEnum2.�׾���);
		print2(srEnum2.����);
		
		
		for (srEnum2 string : srEnum2.values()) {
			print2(string);
			
		}
	}

}
