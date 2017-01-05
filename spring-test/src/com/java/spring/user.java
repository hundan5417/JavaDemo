package com.java.spring;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class user {
private String name; 
private String addr; 
private String city;
@Override
public String toString(){
	return " user [name= " + name + ",addr = " + addr + ",city = " + city + "]";
}
}
