package Day3.classAttribute;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		/*System.out.println(employee.employeeId);
		System.out.println(employee.employeeName);
		Generates error if we try to access private member from other class
		*/
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Updating new values");
		employee.setEmployeeId(60001);
		employee.setEmployeeName("John");
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Creating object with parameterized constructor");
		Employee employee2=new Employee(15001, "Stela");
		System.out.println(employee2.getEmployeeId());
		System.out.println(employee2.getEmployeeName());
		
		System.out.println("***************");
		System.out.println(employee);
		
	}

}
