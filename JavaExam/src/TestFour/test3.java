package TestFour;

public class test3 {

	public static void main(String[] args) {
		// ����������ʽx+y+z=i,��5x+3y+z=i����õ�4y=i-7x��4z=3x+3i��
		// ����y��z��ȡֵ��С���������xֵ
		// i�ǿ�������ı����������������ܼ�

		int x, y, z, i;
		i = Integer.parseInt(args[0]);
		for (x = 0; x < (i / 5); x++) {
			int m = i - 7 * x;
			int n = 3 * x + 3 * i; // m,n������Ŀ���Ǽ�һ�½������ĳ���
			if ((m > 0) && (n > 0)) { // m��n������ͬʱ������ʱ��ʾ����y��z
				if (((m % 4) == 0) && ((n % 4) == 0)) { // ��m��nȡ��Ϊ���ʱ�����y��z��ֵ
					y = m / 4;
					z = n / 4;
					System.out.print("���������ǣ�" + x + ";");
					System.out.print("ĸ�������ǣ�" + y + ";");
					System.out.print("С�������ǣ�" + z + ";");
					System.out.println();
				}
			}
		}

	}

}
