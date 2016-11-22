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

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		File b1 = new File("F:" + File.separator + "Student" + File.separator + "Test" + File.separator + "test1.wmv");
		File b2 = new File("F:" + File.separator + "Student" + File.separator + "Test" + File.separator + "test2.wmv");
		InputStream in = new FileInputStream(b1);
		OutputStream out = new FileOutputStream(b2);
		BufferedInputStream biStream = new BufferedInputStream(in);
		BufferedOutputStream buStream = new BufferedOutputStream(out);
		Byte tmp = (byte) biStream.read();
		while ((tmp != null)&&(b1.length() >= b2.length())) {
			buStream.write(tmp.byteValue());
			tmp = (byte) biStream.read();

		}
		biStream.close();
		in.close();
		buStream.close();
		out.close();
		System.out.println("¸´ÖÆÍê³É");
	}

}
