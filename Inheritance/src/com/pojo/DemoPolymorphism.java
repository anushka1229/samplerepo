package com.pojo;

public class DemoPolymorphism {
	public static void main(String[] args) {
		Person e=new Employee(); //super class reference = subclass object
		((Employee)e).display(); //down casting
		
	}

}
