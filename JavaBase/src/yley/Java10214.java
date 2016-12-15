package yley;

public class Java10214 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int max, min;
		max = array[0];
		min = array[0];
		for (int i = 0; i <= 4; i++) {
			if (min < array[i]) {
				min = array[i];
			}
			if (max > array[i]) {
				max = array[i];
			}
		}
		System.out.println("最大值为：" + min);
		System.out.println("最小值为：" + max);
	}
}
