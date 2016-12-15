package ylew;

public class sanjiaoxing4 {
	public static void main(String[] args) {
		System.out.println("三角形打印的行数是：" + args[0]);

		int n = Integer.parseInt(args[0]);
		for (int i = 1; i < n; i++) {

			for (int j = 1; j <= n - i; j++)

				System.out.print(" ");

			for (int k = 1; k <= i * 2 - 1; k++)
				if (k == 1) {
					System.out.print("*");

				} else if (k == 2 * i - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");

				}

			System.out.print("\n");

		}
		for (int i = 1; i <= 2 * n - 1; i++)
			System.out.print("*");

	}

}
