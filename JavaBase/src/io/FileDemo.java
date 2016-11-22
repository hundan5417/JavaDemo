package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
	    File f1 = new File("E:\\aaaaaaaaaa");
	    File f2 = new File("E:\\bbbbbbbbb");
	    File f3 = new File("E:\\cccccccc");
	    File f4 = new File("E:\\cccccccc\\ood5.zip");
	    System.out.println(f1.length());
	    System.out.println(f2.length());
	    System.out.println(f3.length());
	    System.out.println(f4.length());
	}

}
