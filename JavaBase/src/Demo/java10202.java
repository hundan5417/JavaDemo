package Demo;

import java.io.PrintStream;


public class java10202 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		// forѭ��
		int All = 0;
		for (int q = 1; q <= 100; q++) {
			out.println("All = " + q);
			All = All + q;
			out.println("All = " + All);
		}
		// whlieѭ��

		int w;
		w = 0;

		while (w < 10) {
			out.println("w = " + w);
			w++;
			out.println("e = " + w);

		}
		// do whlieѭ��
		int t;
		t = 0;
		do {
			out.println("t = " + t);
			t++;
			out.println("t = " + t);
		} while (t < 5);

	}

}
