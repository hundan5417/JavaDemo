package yley;

public class Java10211 {

	public static void main(String[] args) {
		//int[]intrray;//����һ��int ���͵�����
		int n=6;//���鳤��Ϊ6
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
