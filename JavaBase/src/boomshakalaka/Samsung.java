package com.ddb.javacore.boomshakalaka;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public abstract class Samsung {
	private String model;
	private String vender;
	@Setter
	@Getter
	private static String os = "TNT";

	public abstract void startos();

	public void printself() {
		System.out.println("我的型号是：" + model);

	}

	public Samsung() {
		super();
		System.out.println("我是父类三星，我要炸掉世界！");
	}
}
