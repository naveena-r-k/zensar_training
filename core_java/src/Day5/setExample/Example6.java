package Day5.setExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Day3.classAttribute.Employee;

public class Example6 {
	
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

		Iterator<Employee> iter= emp.iterator();
		while (iter.hasNext()) {
			Employee employee = iter.next();
			System.out.println(employee);
			
		}
	}
}
