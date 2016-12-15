package yley;

public class Java10211 {

	public static void main(String[] args) {
		//int[]intrray;//声明一个int 类型的数组
		int n=6;//数组长度为6
		int[] intArray = new int[n];
		intArray[0]=5;
		intArray[1]=5;
		intArray[2]=5;
		intArray[3]=5;
		intArray[3]=6;
		
		
		for (int i : intArray) {
			
			System.out.println(i);
			
			
		}
	
	}

}
