package TestFour;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数,你有三次猜的机会：");
		if (sc.hasNextBigInteger()) {
			int x = Integer.parseInt(sc.next());
			System.out.println("请输入你猜的数：");
			for (int i = 0; i < 3; i++) {

				if (sc.hasNextBigInteger()) {
					int y = Integer.parseInt(sc.next());
					if (y > x) {
						System.out.println("你猜的大了");
                            while (i==2) {
                            	System.out.println("game over");
                            	break;
							}

					} else {
						if (y == x) {
							System.out.println("你猜对了");
							while (i==2) {
                            	System.out.println("game over");
                            	break;

							}
						} else {
							System.out.println("你猜的小了");
							while (i==2) {
                            	System.out.println("game over");
                            	break;

							}
						}
					}

				}

			}

		} else {
			System.out.println("输入有误");
		}

	}

}
