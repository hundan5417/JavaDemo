package com.java.mvn.demo;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class MvnDemo {
	private String name;
	public MvnDemo() {
		
	}
	public MvnDemo(String name) {
		super();
		this.name = name;
	}
	public String sayHello() {
		if (this.name!= null) {
			
			return "hello world!" + "***" + this.getName();
		}
		return "hello world!";
		
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");

	}


}
