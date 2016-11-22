package com.ddb.javacore.ylee;

public class Outter {
	private Inner inner;// 用来保存inner类的一个实例化对象==个体
	String name = "outter"; //默认值

	public void print() {
		System.out.println("我是===Outter");
	}

	public Inner getInnerInstance() {
		if (inner == null) {
			inner = new Inner();

		}
		return inner;
	}//这个if语句的目的是讲inner默认值给予它

	public void readInnerName() {
	      System.out.println("我是Outter类，我可以访问内部类的名字：" + getInnerInstance().name);
	}

	public void execInnerPrint() {
		System.out.println("我是外部类，我将要执行内部类的方法：");
		getInnerInstance().print();
		System.out.println("我是外部类，我执行内部类的方法结束了！");

	}

	class Inner {
		String name = "Inner";

		public void readOutterName() {
			System.out.println("这是内部类的方法，我自己的内部类的名字是：" + name + "我的外部类名字是" + Outter.this.name);//name本身引用是重复了，默认输出是内部的量，即inner，所以需要引用外部类的时候，就采用了Outter.this.name的方法

		}

		public void print() {
			System.out.println("我是====Inner");
		}

		public void execOutterPrint() {
			System.out.println("我是内部类，我将要执行外部类的print方法 ====");
			Outter.this.print();
			System.out.println("我是内部类，我将要执行外部类的print方法 ====");

		}

	}

	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.print();
		outter.readInnerName();
		outter.execInnerPrint();

		Outter.Inner inner = outter.new Inner();
		inner.print();
		inner.readOutterName();
		inner.execOutterPrint();

	}

}
