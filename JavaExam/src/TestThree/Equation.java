package TestThree;

public class Equation {

	public static void main(String[] args) {
		// 先比较b*b-4*a*c，根据其大于0，小于0，等于0分别讨论。
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d;
		d = b * b - 4 * a * c;
		System.out.println("a=" + a + "\n" + "b=" + b + "\n" + "c=" + c);
		if (a == 0) {
			System.out.println("该方程不是一元二次方程");
			if (b == 0) {
				if (c == 0) {
					System.out.println("方程的解有无限个");

				} else {
					System.out.println("方程无解");
				}
			} else {
				if (c == 0) {

					System.out.println("方程的解x=" + 0);
				} else {
					System.out.println("方程的解x=" + (-b) / c);

				}

			}

		} else {

			if (d < 0) {
				System.out.println("该方程无解");

			} else if (d == 0) {

				System.out.println("该方程有唯一的解");
				System.out.println("唯一的解x=" + (-b / (2 * a)));

			} else {
				System.out.println("该方程有两个解");
				double e;
				e = Math.sqrt(d);
				double x1;
				double x2;
				x1 = (-b + e) / (2 * a);
				x2 = (-b - e) / (2 * a);
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);

			}
		}
	}

}
