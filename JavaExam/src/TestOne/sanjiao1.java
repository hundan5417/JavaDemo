package TestOne;

public class sanjiao1 {
	public static void sanjiao1(String[] args) {
		System.out.println("三角形的行数是:" + args[0]);
		int n = Integer.parseInt(args[0]);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}