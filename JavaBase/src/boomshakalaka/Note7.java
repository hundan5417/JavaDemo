package com.ddb.javacore.boomshakalaka;

public class Note7 extends Samsung {

	@Override
	public void startos() {
		System.out.println("����note7���һᱬը��" + this.getOs());//�����Լ���os����
		System.out.println("����note7���һᱬը��" + super.getOs());//���ü̳�����os�������������
		//���ַ�����ӡ�Ķ�û������this�ǵ��õ�ǰ�ģ�super�ǵ����Լ��̳и���ġ�

	}

}
