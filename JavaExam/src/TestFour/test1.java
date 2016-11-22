package TestFour;

import java.util.Arrays;

public class test1 {


	public static void main(String[] args) {
		int scores[] = { 89, -23, 64, 91, 119, 52, 73 };
		Arrays.sort(scores);//利用Arrays类中的sort方法排序
		for (int i = 0; i < scores.length; i++) {
			if ( (scores[i]>0) && (scores[i]<100) ) {
	               System.out.println(scores[i]);	
	               
			}
			
			
		}
		
		

	}
	
		
	}


