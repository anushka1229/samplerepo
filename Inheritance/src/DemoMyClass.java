import com.pojo.Employee;

public class DemoMyClass {
	public static void main(String[] args) {
		EmployeeIO e=new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				employee.display();
				
			}
			
			@Override
			public Employee readEmployee() {
				return new Employee();
			}
		};
		Employee emp=e.readEmployee();
		e.writeEmployee(emp);
	}

}
