import java.util.Scanner;

import com.pojo.Employee;


public class TestEmployee {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		//emp.show();
		Employee emp1=new Employee( 10000, 20144053, 20, "AnushkaS");
		Employee emp3=new Employee( 10000, 20144053, 20, "AnushkaS");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the salary:");
		double sal=s.nextDouble();
		System.out.println("Enter the employee id:");
		int id=s.nextInt();
		//emp1.show();
		Employee emp2=new Employee(sal,id,age,name);
		emp2.display();
		//emp.display();
		emp2.getAge();
		System.out.println(emp);
		s.close();
		if(emp3.equals(emp1))
			System.out.println("true");
		else
			System.out.println("false");
		

	}

}
