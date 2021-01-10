package Day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("BMW");
		
		/*for (int i = 0; i <cars.size(); i++) {
			String x=cars.get(i);
			System.out.println(x);
		}*/
		
		Collections.sort(cars,Collections.reverseOrder());
		for (String x : cars) {
			System.out.println(x);
		}
		
		
	}
	
}
