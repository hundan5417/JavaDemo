package Demo;

public class Java10205 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print("\t" + j + "*" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			i++;

		}

	}

}
