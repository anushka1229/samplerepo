package com.pojoexercises;

public class Circle extends Shape {

	private double radius;
	public Circle()
	{
		radius=10.0;
	}
	
	public Circle(double radius) {
		super(0,0,"Circle");
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

}