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
		System.out.println("�ҵ��ͺ��ǣ�" + model);

	}

	public Samsung() {
		super();
		System.out.println("���Ǹ������ǣ���Ҫը�����磡");
	}
}
