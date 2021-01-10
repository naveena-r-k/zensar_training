package Day5.setExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		
		Set<String> countries= new HashSet<String>();
		
		countries.add("Germany");
		countries.add("Japan");
		countries.add("Canada");
		
		Iterator<String> iter = countries.iterator();
		while (iter.hasNext()) {
			String x= iter.next();
			System.out.println(x);
		}
	}
}
