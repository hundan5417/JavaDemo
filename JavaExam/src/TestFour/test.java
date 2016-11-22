package TestFour;

public class test {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {        //公鸡单价五元  最多20个
			for (int j = 0; j < 34; j++) {      //母鸡单价3元，最多33个
				if (5*i + 3*j + (100-i-j)/3 == 100) {     //小鸡个数为（100-i-j），因为单价为1/3元，方程麻烦，两边同乘以3
                    System.out.print("公鸡个数是：" + i + ";" );		
                    System.out.print("母鸡个数是：" + j + ";" );					
                    System.out.print("小鸡个数是：" + (100-i-j) + ";"  );		
                    System.out.println();

				}
				
			}
			
		}
	}

}
