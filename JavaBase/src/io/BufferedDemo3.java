package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo3 {

	public static void main(String[] args) throws IOException {

		File file1 = new File(
				"F:" + File.separator + "Student" + File.separator + "Test1" + File.separator + "test1.wmv");
		File file2 = new File(
				"F:" + File.separator + "Student" + File.separator + "Test1" + File.separator + "test2.wmv");
		FileInputStream in = new FileInputStream(file1);
		FileOutputStream out = new FileOutputStream(file2);

		BufferedOutputStream fo = new BufferedOutputStream(out);
		BufferedInputStream fi = new BufferedInputStream(in);

		byte[] a = new byte[300];
		int tmp;
		while ((tmp = fi.read(a)) != -1) {
			fo.write(a, 0, tmp);
			// fo.write(a);
		}
		fi.close();
		fo.close();
		System.out.println("¸´ÖÆÍê³É");
	}
}
