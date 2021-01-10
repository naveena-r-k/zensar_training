package Day5.setExample;

import java.util.HashSet;
import java.util.Set;

import Day3.classAttribute.Employee;

public class Example5 {
	
	public static void main(String[] args) {
		
		Set<Employee> emp = new HashSet<Employee>();
		
		Employee e= new Employee(54,"Neetu");
		Employee e1= new Employee(64,"Rahul");
		Employee e2= new Employee(90,"Shaila");
		Employee e3= new Employee(21,"Dhruv");
		
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);

		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}
}
