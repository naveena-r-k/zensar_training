package Day5.LinkedList2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Audi");

		System.out.println(cars);
		
		System.out.println(cars.get(2));

		//updating volvo to opel
		cars.set(0, "Opel");
		System.out.println(cars);
		
		//removing element
		System.out.println("removing index 2");
		cars.remove(2);
		System.out.println(cars);
		
		//removing all elements from car
		cars.clear();
		System.out.println(cars);
}
