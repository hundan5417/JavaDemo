package ylew;

public class sanjiaoxing3 {

	public static void main(String[] args) {

		System.out.println("三角形行数：" + args[0]);
		int n = Integer.parseInt(args[0]);
		for(int i=1;i<=n;i++)                                     
		{
			
			for (int k=1;k<=i-1;k++)
				System.out.print(" ");
			for (int j=1;j<=2*(n-i)-1;j++)
					System.out.print("*");
			
			    System.out.println();
			}
		}

}
