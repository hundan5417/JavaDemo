package TestFour;

public class test {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {        //����������Ԫ  ���20��
			for (int j = 0; j < 34; j++) {      //ĸ������3Ԫ�����33��
				if (5*i + 3*j + (100-i-j)/3 == 100) {     //С������Ϊ��100-i-j������Ϊ����Ϊ1/3Ԫ�������鷳������ͬ����3
                    System.out.print("���������ǣ�" + i + ";" );		
                    System.out.print("ĸ�������ǣ�" + j + ";" );					
                    System.out.print("С�������ǣ�" + (100-i-j) + ";"  );		
                    System.out.println();

				}
				
			}
			
		}
	}

}
