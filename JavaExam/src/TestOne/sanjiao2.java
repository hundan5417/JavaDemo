package TestOne;

public class sanjiao2 {
	public void sanjiao2(String[] args) {
		System.out.println("三角形的行数是:" + args[1]);
		int n = Integer.parseInt(args[1]);
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= 2 * (n - i) - 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
