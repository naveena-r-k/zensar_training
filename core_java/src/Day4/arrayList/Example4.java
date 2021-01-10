package Day4.arrayList;

//example on iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("BMW");
		
		Iterator<String> iter = cars.iterator();
		while (iter.hasNext()) {
			String x = iter.next();
			System.out.println(x);
		}
		
	}
	
}
