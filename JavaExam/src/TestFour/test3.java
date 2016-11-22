package TestFour;

public class test3 {

	public static void main(String[] args) {
		// 根据两个公式x+y+z=i,和5x+3y+z=i处理得到4y=i-7x，4z=3x+3i。
		// 根据y，z的取值大小求出成立的x值
		// i是可以输入的变量，鸡的总数，总价

		int x, y, z, i;
		i = Integer.parseInt(args[0]);
		for (x = 0; x < (i / 5); x++) {
			int m = i - 7 * x;
			int n = 3 * x + 3 * i; // m,n的声明目的是简化一下接下来的程序
			if ((m > 0) && (n > 0)) { // m和n，当其同时大于零时表示存在y，z
				if (((m % 4) == 0) && ((n % 4) == 0)) { // 当m，n取余为零的时候即输出y，z的值
					y = m / 4;
					z = n / 4;
					System.out.print("公鸡个数是：" + x + ";");
					System.out.print("母鸡个数是：" + y + ";");
					System.out.print("小鸡个数是：" + z + ";");
					System.out.println();
				}
			}
		}

	}

}
