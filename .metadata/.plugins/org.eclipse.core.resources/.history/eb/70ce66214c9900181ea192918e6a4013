package com.pojo;

public class Employee extends Person {
	private double empSalary;
	private int empId;
	//default constructor
	public Employee()
	{   super(23,"Anushka"); //please first invoke the parent class constructor
		setEmpId(20148050);
		setEmpSalary(1000);
	}
	public Employee(double salary, int empId, int age, String name)
	{   super(age,name);
		this.setEmpSalary(salary);
		this.setEmpId(empId);
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+(empId+" "+empSalary);
	}
	public void display()
	{   super.display();//you are brilliant :)
		System.out.println("Employee id:"+empId+"\t"+"Salary:"+empSalary);
		//System.out.println(getName()+"\t"+getAge());
		
		
	}

}
