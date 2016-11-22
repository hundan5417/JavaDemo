package com.ddb.javacore.base;

public class Java10193 {

	public static void main(String[] args) {
		int x, y;
		x = 50;
		y = 6;
		System.out.println("x 计算: " + Integer.toBinaryString(x));
		System.out.println("y 计算: " + Integer.toBinaryString(y));
		System.out.println("x 计算: " + Integer.toBinaryString(x << 3));
		System.out.println("x 计算: " + Integer.toBinaryString(x >>> 3));
		System.out.println("x 计算: " + Integer.toBinaryString(x & y));
		System.out.println("x 计算: " + Integer.toBinaryString(x | y));
		System.out.println("x 计算: " + Integer.toBinaryString(x ^ y));
}

}
