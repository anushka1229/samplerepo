import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImp1 implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = s.nextInt();
		System.out.println("Enter the name:");
		String name = s.next();
		System.out.println("Enter the salary:");
		double sal = s.nextDouble();
		System.out.println("Enter the employee id:");
		int id = s.nextInt();
		s.close();
		emp.setAge(age);
		emp.setEmpId(id);
		emp.setEmpSalary(sal);
		emp.setName(name);
		return emp;
	}

	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp1 = employee;
		System.out.println("The details of employee are-");
		System.out.println("Age-" + emp1.getAge());
		System.out.println("Name-" + emp1.getName());
		System.out.println("Salary-" + emp1.getEmpSalary());
		System.out.println("Employee id:" + emp1.getEmpId());
	}

	public static void main(String[] args) {
	EmployeeIO emp=new EmployeeIOImp1();
	Employee e=emp.readEmployee();
	emp.writeEmployee(e);

	}

}
