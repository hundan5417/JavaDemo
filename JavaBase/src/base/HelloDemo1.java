package com.ddb.javacore.base;

import java.io.PrintStream;

public class HelloDemo1 {

	public static void main(String[] args) {
		PrintStream out = System.out;
	    out.println("Hello World");
		out.println("ÎÒÊÇ"+args[0]);
        out.println("Äæ×Ó"+args[1]);  
	}
}