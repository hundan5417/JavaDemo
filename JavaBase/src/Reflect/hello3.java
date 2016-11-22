package Reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;



	interface China{  
	    public static final String name="Rollen";  
	    public static  int age=20;  
	    public void sayChina();  
	    public void sayHello(String name, int age);  
	}  
	   
	class Person implements China{  
	    public Person() {  
	           
	    }  
	    public Person(String sex){  
	        this.sex=sex;  
	    }  
	    public String getSex() {  
	        return sex;  
	    }  
	    public void setSex(String sex) {  
	        this.sex = sex;  
	    }  
	    @Override  
	    public void sayChina(){  
	        System.out.println("hello ,china");  
	    }  
	    @Override  
	    public void sayHello(String name, int age){  
	        System.out.println(name+"  "+age);  
	    }  
	    private String sex;  
	} 
	class hello3{  
	    public static void main(String[] args) {  
	        int[] temp={1,2,3,4,5,6,7,8,9};  
	        int[] newTemp=(int[])arrayInc(temp,15);  
	        print(newTemp);  
	        System.out.println("=====================");  
	        String[] atr={"a","b","c"};  
	        String[] str1=(String[])arrayInc(atr,8);  
	        print(str1);  
	    }  
	       
	    /** 
	     * 修改数组大小 
	     * */  
	    public static Object arrayInc(Object obj,int len){  
	        Class<?>arr=obj.getClass().getComponentType();  
	        Object newArr=Array.newInstance(arr, len);  
	        int co=Array.getLength(obj);  
	        System.arraycopy(obj, 0, newArr, 0, co);  
	        return newArr;  
	    }  
	    /** 
	     * 打印 
	     * */  
	    public static void print(Object obj){  
	        Class<?>c=obj.getClass();  
	        if(!c.isArray()){  
	            return;  
	        }  
	        System.out.println("数组长度为： "+Array.getLength(obj));  
	        for (int i = 0; i < Array.getLength(obj); i++) {  
	            System.out.print(Array.get(obj, i)+" ");  
	        }  
	    }  
	}  