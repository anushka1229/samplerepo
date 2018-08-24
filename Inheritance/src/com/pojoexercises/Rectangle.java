package com.pojoexercises;

public class Rectangle extends Shape {
    private int length;
    private int breadth;
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public Rectangle()
	{
		length=10;
		breadth=3;
	}
	public Rectangle(int length, int breadth) {
		super(4,4,"Rectangle");
		this.length = length;
		this.breadth = breadth;
	}
    
}