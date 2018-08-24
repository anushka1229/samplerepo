package com.pojo;


public class Person {
  private int age;
  private String name;
  public Person() //default initialization
  {
	  name="Anushka";
	  age=24;
  }
  public void display()
  {
	  System.out.println("Name of person "+name+"\tAge->"+age);
  }
  public Person(int age, String name)
  {
	  this.age=age;
	  this.name=name;
  }
public int getAge() {
	return age;
}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	Person p=(Person)obj; //down casting
		return (p.name.equals(name) && (p.age==this.age));
	}


}

