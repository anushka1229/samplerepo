package com.one;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the two numbers");
		int num=s.nextInt();
		int num1=s.nextInt();
		int sum=num+num1;
		System.out.println(sum);

	}

}
