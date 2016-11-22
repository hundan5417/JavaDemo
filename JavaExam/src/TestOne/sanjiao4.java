package TestOne;

public class sanjiao4 {
	public void sanjiao4(String[] args) {
		System.out.println("三角形的行数是:" + args[3]);
		int n = Integer.parseInt(args[3]);
		for (int i = 1; i <= 2 * n - 1; i++)
			System.out.print("*");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= 2 * (n - i) - 1; k++) {
				if (k == 1) {
					System.out.print("*");
				} else if (k == 2 * (n - i) - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

}
