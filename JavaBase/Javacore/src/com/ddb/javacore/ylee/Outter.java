package com.ddb.javacore.ylee;

public class Outter {
	private Inner inner;// ��������inner���һ��ʵ��������==����
	String name = "outter"; //Ĭ��ֵ

	public void print() {
		System.out.println("����===Outter");
	}

	public Inner getInnerInstance() {
		if (inner == null) {
			inner = new Inner();

		}
		return inner;
	}//���if����Ŀ���ǽ�innerĬ��ֵ������

	public void readInnerName() {
	      System.out.println("����Outter�࣬�ҿ��Է����ڲ�������֣�" + getInnerInstance().name);
	}

	public void execInnerPrint() {
		System.out.println("�����ⲿ�࣬�ҽ�Ҫִ���ڲ���ķ�����");
		getInnerInstance().print();
		System.out.println("�����ⲿ�࣬��ִ���ڲ���ķ��������ˣ�");

	}

	class Inner {
		String name = "Inner";

		public void readOutterName() {
			System.out.println("�����ڲ���ķ��������Լ����ڲ���������ǣ�" + name + "�ҵ��ⲿ��������" + Outter.this.name);//name�����������ظ��ˣ�Ĭ��������ڲ���������inner��������Ҫ�����ⲿ���ʱ�򣬾Ͳ�����Outter.this.name�ķ���

		}

		public void print() {
			System.out.println("����====Inner");
		}

		public void execOutterPrint() {
			System.out.println("�����ڲ��࣬�ҽ�Ҫִ���ⲿ���print���� ====");
			Outter.this.print();
			System.out.println("�����ڲ��࣬�ҽ�Ҫִ���ⲿ���print���� ====");

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
