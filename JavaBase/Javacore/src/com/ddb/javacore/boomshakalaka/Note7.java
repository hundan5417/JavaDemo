package com.ddb.javacore.boomshakalaka;

public class Note7 extends Samsung {

	@Override
	public void startos() {
		System.out.println("我是note7，我会爆炸！" + this.getOs());//调用自己的os方法
		System.out.println("我是note7，我会爆炸！" + super.getOs());//调用继承来的os方法，即父类的
		//两种方法打印的都没错，但是this是调用当前的，super是调用自己继承父类的。

	}

}
