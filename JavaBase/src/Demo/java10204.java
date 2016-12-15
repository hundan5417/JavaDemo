package Demo;

public class java10204 {

	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print("\t" + j + "*" + i + "=" + i * j + "\t");
				j++;
			} while (j <= i);
			System.out.println();
			i++;
		} while (i <= 9);

	}

}
