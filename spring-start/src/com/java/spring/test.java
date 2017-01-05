package com.java.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
	private static ApplicationContext ctx;
	private static void print(Object object){
		System.out.println(object);
	}
	public static void test1(){
		user user = new user();
		user.setName("test1");
		user.setAddr("anhui");
		user.setCity("fuyang");
		print(user);
	}
	public static void test2(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		user user = (user)ctx.getBean("user");
		print(user);
		
	}

	public static void main(String[] args) {
		test1();
		test2();

	}

}
