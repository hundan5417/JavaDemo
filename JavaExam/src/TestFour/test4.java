package TestFour;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������,�������βµĻ��᣺");
		if (sc.hasNextBigInteger()) {
			int x = Integer.parseInt(sc.next());
			System.out.println("��������µ�����");
			for (int i = 0; i < 3; i++) {

				if (sc.hasNextBigInteger()) {
					int y = Integer.parseInt(sc.next());
					if (y > x) {
						System.out.println("��µĴ���");
                            while (i==2) {
                            	System.out.println("game over");
                            	break;
							}

					} else {
						if (y == x) {
							System.out.println("��¶���");
							while (i==2) {
                            	System.out.println("game over");
                            	break;

							}
						} else {
							System.out.println("��µ�С��");
							while (i==2) {
                            	System.out.println("game over");
                            	break;

							}
						}
					}

				}

			}

		} else {
			System.out.println("��������");
		}

	}

}
