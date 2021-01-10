package Day5.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Day3.classAttribute.Employee;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee(12,"Joona");
		Employee emp1= new Employee(13,"Lily");
		Employee emp2= new Employee(14,"Jasmine");
		Employee emp3= new Employee(15,"Ritu");

		Map<Integer,Employee> employee= new HashMap<Integer,Employee>();
		employee.put(1, emp);
		employee.put(2, emp1);
		employee.put(3, emp2);
		employee.put(4, emp3);
		
		Set<Integer> e = employee.keySet();
		
		System.out.println("using for loop");
		for(int x :e) {
			Employee emp5=employee.get(x);
			System.out.println(emp5);
		}

		System.out.println("using iterator....");
		Iterator<Integer> iter=e.iterator();
		while (iter.hasNext()) {
			Integer x = iter.next();
			System.out.println(employee.get(x));
		}
	}

}
