package com.java.mvn.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MvnDemoTest {

	@Test
	public void testSayHello() {
		MvnDemo md = new MvnDemo("andy");
		System.out.println(md.getName());
		assertEquals("hello world!", md.sayHello());
		
	}

}
