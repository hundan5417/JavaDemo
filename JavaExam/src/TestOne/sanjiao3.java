package TestOne;

public class sanjiao3 {
	public void sanjiao3(String[] args) {
		System.out.println("�����ε�������:" + args[2]);
		int n = Integer.parseInt(args[2]);
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k == 1) {
					System.out.print("*");
				} else if (k == 2 * i - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		for (int i = 1; i <= 2 * n - 1; i++)
			System.out.print("*");

	}

}
