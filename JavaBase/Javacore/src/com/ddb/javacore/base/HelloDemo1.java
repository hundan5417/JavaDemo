package com.ddb.javacore.base;

import java.io.PrintStream;

public class HelloDemo1 {

	public static void main(String[] args) {
		PrintStream out = System.out;
	    out.println("Hello World");
		out.println("����"+args[0]);
        out.println("����"+args[1]);  
	}
}