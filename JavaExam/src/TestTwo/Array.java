package TestTwo;

public class Array {

	public static void main(String[] args) {
		//在for循环里挨个比较数组里面的大小，找出里面的最大值和最小值，然后取平均值。
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
		System.out.println("数组的最大值是：" + max);
		System.out.println("数组的最小值是：" + min);
		System.out.println("数组的最大值与最小值的平局值是：" + a);

	}

}
