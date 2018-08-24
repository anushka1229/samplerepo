
public class Employee {
	
	private int empid;
	private double salary;
	private String empName;
	private String companyName;
	public Employee ()
	{
		empid=10;
		salary=2000.87;
		empName="Raghu";
		companyName="Citicorp";
		
		
	}
	public Employee(int empid, String empName, double salary)
	{
		this();
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("company name is "+companyName);
	}
	public static void main(String[] args)
	{
		Employee emp=new Employee(12, "Rahvendra", 23400);
		emp.display();
	}

}
