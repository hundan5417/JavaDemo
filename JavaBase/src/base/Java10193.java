package com.ddb.javacore.base;

public class Java10193 {

	public static void main(String[] args) {
		int x, y;
		x = 50;
		y = 6;
		System.out.println("x ����: " + Integer.toBinaryString(x));
		System.out.println("y ����: " + Integer.toBinaryString(y));
		System.out.println("x ����: " + Integer.toBinaryString(x << 3));
		System.out.println("x ����: " + Integer.toBinaryString(x >>> 3));
		System.out.println("x ����: " + Integer.toBinaryString(x & y));
		System.out.println("x ����: " + Integer.toBinaryString(x | y));
		System.out.println("x ����: " + Integer.toBinaryString(x ^ y));
}

}
