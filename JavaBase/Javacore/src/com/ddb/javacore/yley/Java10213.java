package com.ddb.javacore.yley;

public class Java10213 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int array1[];
		array1 = new int[3];
		System.arraycopy(array, 1, array1, 1, 2);
		for (int i : array1) {
			System.out.println(i);
		}
	}

}
