package Saturday1.listConstructor;

//demo of parameterized constructor of arraylist
//new ArrayList(Collection c)

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		
		Set<String> cars= new HashSet<String>();
		cars.add("KIA");
		cars.add("Honda");
		cars.add("Audi");
		cars.add("BMW");
		
		List<String> listOfCars= new ArrayList<String>(cars);
		display(listOfCars);
	}
	
	public static void display(List<String> list1) {
		
		for (String x : list1) {
			System.out.println(x);
		}
	}
}
