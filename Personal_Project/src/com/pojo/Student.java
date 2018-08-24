package com.pojo;

import java.util.Arrays;

public class Student {
private String name;
private int[] marks;
private int rollNo;
public Student()
{
	name="XYZ";
	Arrays.fill(marks, 0);
	rollNo=10000;
	
}
public Student(String name, int[] marks, int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
	this.marks=marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public void display()
{
	System.out.println("the information of the given student is:");
	System.out.println("Name is "+name);
	System.out.println("RollNo is "+rollNo);
	System.out.println("Marks are:");
	for(int x:marks)
	{
		System.out.println(x);
	}
}

}
