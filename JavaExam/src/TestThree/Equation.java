package TestThree;

public class Equation {

	public static void main(String[] args) {
		// �ȱȽ�b*b-4*a*c�����������0��С��0������0�ֱ����ۡ�
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double d;
		d = b * b - 4 * a * c;
		System.out.println("a=" + a + "\n" + "b=" + b + "\n" + "c=" + c);
		if (a == 0) {
			System.out.println("�÷��̲���һԪ���η���");
			if (b == 0) {
				if (c == 0) {
					System.out.println("���̵Ľ������޸�");

				} else {
					System.out.println("�����޽�");
				}
			} else {
				if (c == 0) {

					System.out.println("���̵Ľ�x=" + 0);
				} else {
					System.out.println("���̵Ľ�x=" + (-b) / c);

				}

			}

		} else {

			if (d < 0) {
				System.out.println("�÷����޽�");

			} else if (d == 0) {

				System.out.println("�÷�����Ψһ�Ľ�");
				System.out.println("Ψһ�Ľ�x=" + (-b / (2 * a)));

			} else {
				System.out.println("�÷�����������");
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
