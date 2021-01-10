package Day4.arrayList;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("BMW");
		
		for (int i = 0; i <cars.size(); i++) {
			String x=cars.get(i);
			System.out.println(x);
		}
		
		for (String x : cars) {
			System.out.println(x);
		}
	}
	
}
