package TestTwo;

public class Array {

	public static void main(String[] args) {
		//��forѭ���ﰤ���Ƚ���������Ĵ�С���ҳ���������ֵ����Сֵ��Ȼ��ȡƽ��ֵ��
		int x[] = { 12, 67, 8, 98, 23, 56, 124, 55, 59, 100 };
		int max = x[0], min = x[0], a;
		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
			if (min > x[i]) {
				min = x[i];
			}

		}
		a = (min + max) / 2;
		System.out.println("��������ֵ�ǣ�" + max);
		System.out.println("�������Сֵ�ǣ�" + min);
		System.out.println("��������ֵ����Сֵ��ƽ��ֵ�ǣ�" + a);

	}

}
