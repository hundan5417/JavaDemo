package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedDemo2 {

	public static void main(String[] args) throws IOException {
		File b1 = new File("F:" + File.separator + "Student" + File.separator + "Test1" + File.separator + "test1.wmv");
		File b2 = new File("F:" + File.separator + "Student" + File.separator + "Test1" + File.separator + "test2.wmv");
		InputStream in = new FileInputStream(b1);
		OutputStream out = new FileOutputStream(b2);
		BufferedInputStream biStream = new BufferedInputStream(in);
		BufferedOutputStream buStream = new BufferedOutputStream(out);
	    byte[] tm = new byte[1024];
	   
		Integer tmp = (int) biStream.read(tm);
		while (tmp != null) {
			buStream.write(tmp.byteValue());
			tmp = (int) biStream.read(tm);

		}
		biStream.close();
		in.close();
		buStream.close();
		out.close();
		System.out.println("¸´ÖÆÍê³Éle");
	}

}
