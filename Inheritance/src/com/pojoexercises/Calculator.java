package com.pojoexercises;

public class Calculator {
	private int num1;
	private int num2;
	public int add(int n1,int n2)
	{
		return (n1+n2);
	}
	public int subtract(int n1,int n2)
	{
		if(n1>n2)
			return n1-n2;
		else
			return n2-n1;
	}
	public int product(int n1,int n2)
	{
		return n1*n2;
	}
	public double div(int n1,int n2)
	{
		if (n2!=0)
			return n1/n2;
		else
			return 0;
	}


}
