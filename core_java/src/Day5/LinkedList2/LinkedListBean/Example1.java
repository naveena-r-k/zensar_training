package Day5.LinkedList2.LinkedListBean;

import java.util.LinkedList;

import Day3.classAttribute.Employee;

public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1= new Employee(1,"Johanna");
		Employee employee2= new Employee(2,"Synthia");
		Employee employee3= new Employee(3,"April");

		LinkedList<Employee> emp = new LinkedList<Employee>();
		emp.add(employee1);
		emp.add(employee2);
		emp.add(employee3);

		for (Employee employee : emp) {
			System.out.println(employee);
		}
	}
}
